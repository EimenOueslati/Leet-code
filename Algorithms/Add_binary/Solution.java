package Algorithms.Add_binary;

class Solution {
    private int carryOver;
    public String addBinary(String a, String b) {
        int sa = a.length();
        int sb = b.length();
        carryOver = 0;
        StringBuilder answer;
        StringBuilder op1;
        StringBuilder op2;
        if(sa >= sb)
        {
            op1 = new StringBuilder(a);
            op2 = new StringBuilder(b);
        }else
        {
            op1 = new StringBuilder(b);
            op2 = new StringBuilder(a);
        }
        while(op1.length() != op2.length())
        {
            op2 = op2.insert(0, '0');
        }
        for(int i = 0; i < op1.length(); i++)
        {
            answer.append(addOperation(op1.charAt(i), op2.charAt(i), carryOver));
        }
    }
}