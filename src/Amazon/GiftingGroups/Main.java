package Amazon.GiftingGroups;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();
        int[][] testCase1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] testCase2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        System.out.println(s.findCircleNum(testCase1));
        System.out.println(s.findCircleNum(testCase2));
    }
}
