package Roblox.SmartSale;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testcase1 = {4, 1, 1, 1, 1, 2};
        int m1 = 4;

        int[] testcase2 = {2, 3, 1, 2, 3, 3};
        int m2 = 3;

        System.out.println(s.distinctId(testcase1, m1));
        System.out.println(s.distinctId(testcase2, m2));
    }
}
