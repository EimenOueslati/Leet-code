package Algorithms.Daily_temp;

public class Main {
    public static void main(String[] args) {
        int[] temp = new int[] {73,74,75,71,69,72,76,73};
        Solution sol = new Solution();
      int[] sulus = sol.dailyTemperatures(temp);
      for(int i = 0; i < sulus.length; i++) System.out.println(sulus[i]);
    }
}
