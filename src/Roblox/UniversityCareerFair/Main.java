package Roblox.UniversityCareerFair;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testcase1 = {1, 3, 3, 5, 7};
        int[] duration1 = {2, 2, 1, 2, 1};
        System.out.println(s.num_maxEvents(testcase1, duration1));
        int[] testcase2 = {1, 3, 3, 5, 7, 6, 9};
        int[] duration2 = {2, 2, 1, 2, 1, 10, 2};
        System.out.println(s.num_maxEvents(testcase2, duration2));
        int[] testcase3 = {1, 3, 35, 7};
        int[] duration3 = {2, 2, 1, 2, 1};
        System.out.println(s.num_maxEvents(testcase3, duration3));
    }
}
