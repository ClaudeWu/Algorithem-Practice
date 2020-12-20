package Roblox.SlowestKeyPress;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testcase1 = {9,29,49,50};
        int[] testcase2 = {12,23,36,46,62};
        String s1 = "cbcd";
        String s2 = "spuda";

        System.out.println(s.slowestKey(testcase1, s1));
        System.out.println(s.slowestKey(testcase2, s2));
    }
}
