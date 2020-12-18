package Roblox.PilesOfBoxes;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testcase1 = {150, 210, 210, 80, 110};
        int[] testcase2 = {843, 247};
        int[] testcase3 = {2};

        System.out.println(s.minSteps(testcase1));
        System.out.println(s.minSteps(testcase2));
        System.out.println(s.minSteps(testcase3));
    }
}
