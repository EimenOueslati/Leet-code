package Algorithms.BFS.Open_the_lock;

public class openTheLock {
    public int openLock(String[] deadEnds, String target)
    {
        int steps = 0;
        if(target.equals("0000"))
        {
            return steps;
        }

       if(( steps = getStepsRight(deadEnds, target)) < 0)
       {
       }else{
        return getStepsLeft(deadEnds, target);
       }
       return -1;

    }
    

    private int getStepsRight(String[] deadStrings, String targetString)
    {
        String[] chars = targetString.split("");
        int[] ints = new int[4];
        int i = 0;
        int steps = 0;
        for (String c : chars) {
            ints[i] = Integer.parseInt(c);
            i++;
        }
        String current[] = new String[]{"0","0","0","0"};
        for(i = 0; i < 4; i++)
        {
            int stepsToAdd = getShortestPath(ints, i, deadStrings, ints[i], current);
            if(stepsToAdd < 0)
            {
                return -1;
            }
            current[i] = Integer.toString(ints[i]);
            steps = steps + stepsToAdd;
        }

        return steps;
    }

    private int getStepsLeft(String[] deadStrings, String targetString)
    {
        String[] chars = targetString.split("");
        int[] ints = new int[4];
        int i = 0;
        int steps = 0;
        for (String c : chars) {
            ints[i] = Integer.parseInt(c);
            i++;
        }
        String current[] = new String[]{"0","0","0","0"};
        for(i = 3; i > -1; i--)
        {
            int stepsToAdd = getShortestPath(ints, i, deadStrings, ints[i], current);
            if(stepsToAdd < 0)
            {
                return -1;
            }
            current[i] = Integer.toString(ints[i]);
            steps = steps + stepsToAdd;
        }

        return steps;
    }

    private int getShortestPath(int[] list, int index, String[] deads, int target, String[] current){
        if(list[index] == target)
        {
            return 0;
        }

        int up = 0;
        int down = 0;
        int ret;
        for(int i = 0; i < 10; i++)
        {
            if(list[index] == 9)
            {
                list[index] = 0;
            }else
            {
                list[index]++;
            }

            current[index] = Integer.toString(list[index]);
            if(containsArr(deads, current))
            {
                up = 100;
                break;
            }


            up++;
            if(list[index] == target) break;

        }

        for(int i = 0; i < 10; i++)
        {
            if(list[index] == 0)
            {
                list[index] = 9;
            }else
            {
                list[index]--;
            }

            current[index] = Integer.toString(list[index]);
            if(containsArr(deads, current))
            {
                down = 100;
                break;
            }

            down++;
            if(list[index] == target) break;


        }

        if(up == 100 && up == 100 ){
            return -1;
        }else{
            ret = (up < down) ? up : down;
            return ret;
        } 
    }


    private boolean containsArr(String[] search, String[] arr)
    {
        String code = String.join("", arr);
        for (String string : search) {
            if(string.equals(code))
            {
                return true;
            }
        }
        return false;
    }
}
