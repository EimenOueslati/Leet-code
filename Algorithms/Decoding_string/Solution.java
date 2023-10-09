package Algorithms.Decoding_string;

public class Solution {
    private String answer;
    public String decodeString(String s) {
        answer = "";
        String[] arr = s.split("]");
        for(String str : arr)
        {
            StringBuilder temp = new StringBuilder(str.substring(2));
            for(int i = 0; i < str.charAt(0) - '0'; i++)
            {
                answer += temp;
            }
        }

        return answer;
        
    }
}
