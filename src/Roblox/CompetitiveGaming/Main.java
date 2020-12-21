package Roblox.CompetitiveGaming;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testcase1 = {100, 50, 50, 25};
        int k1 = 3;

        int[] testcase2 = {2, 2, 3, 4, 5};
        int k2 = 4;

        System.out.println(s.contNumPlayerToLevelUp(k1, testcase1));
        System.out.println(s.contNumPlayerToLevelUp(k2, testcase2));
    }
}
