package Algorithms.Implement_strStr;

public class Main {
    public static void main(String[] args) {
        String hayStack = "djbhawdijhs dadakjdkmaoisjdjkaw dks asad dwiadlkm daijwda od kjsad dpwoåptgfkldgm,er sad";
        String needle = "sad";
        Solution sol = new Solution();
        System.out.println(sol.strStr(hayStack, needle));
    }
}
