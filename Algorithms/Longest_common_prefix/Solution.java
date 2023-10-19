package Algorithms.Longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String prefix = "";
        int index = 0;
        while(index < strs[strs.length - 1].length() && index < strs[strs.length - 2].length())
        {
            if(strs[strs.length - 1].charAt(index) == strs[strs.length - 2].charAt(index))
            {
                prefix += strs[strs.length - 1].charAt(index);
                index++;
            }else{
                break;
            }
        }
        if(strs.length == 2 || prefix.length() == 0) return prefix;
        for(String str : strs)
        {
            if(str.equals("")) 
            {
                prefix = "";
                break;
            }
            for(int i = 0; i < prefix.length(); i++)
            {
                if(i == str.length() || prefix.charAt(i) != str.charAt(i))
                {
                    prefix = prefix.substring(0, i);
                    break;
                }
            }
        }
        return prefix;
    }
}