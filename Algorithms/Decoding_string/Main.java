package Algorithms.Decoding_string;

public class Main {
    public static void main(String[] args) {
        String test = "3[a2[c]]";
        Solution sol = new Solution();
        System.out.println(sol.decodeString(test));
    }
}
