package Algorithms.Add_binary;

class Solution {
    private char carryOver;
    public String addBinary(String a, String b) {
        int sa = a.length();
        int sb = b.length();
        carryOver = '0';
        StringBuilder answer = new StringBuilder();
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
            answer.insert(0, addOperation(op1.charAt(i), op2.charAt(i), carryOver));
        }
        if(carryOver == '1')  answer.insert(0, '1');
        return answer.toString();
    }

    private char addOperation(char operand1, char operand2, int carryOver)
    {
        if(operand1 == '1' && operand2 == '1')
        {  
            if(carryOver == '0') 
            {
                carryOver = '1';
                return '0';
            }else
            {
                carryOver = '1';
                return '1';
            }
        }else if(operand1 != operand2)
        {
             if(carryOver == '0') 
            {
                return '1';
            }else
            {
                carryOver = '1';
                return '0';
            }
        }else
        {
             if(carryOver == '0') 
            {
                return '0';
            }else
            {
                return '1';
            }
        }
    }
}