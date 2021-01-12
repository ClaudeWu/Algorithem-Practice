package Amazon.FIveStarSellers;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();
        int[][] testCase1 = {{4, 4}, {1, 2}, {3, 6}};
        int[][] testCase2 = {{4, 4}, {2, 3}, {3, 6}};
        int[][] testCase3 = {{4, 4}, {3, 4}, {3, 6}};
        int[][] testCase4 = {{4, 4}, {3, 4}, {4, 7}};
        System.out.println(s.fiveStarReviews(testCase1, 77));
        System.out.println(s.fiveStarReviews(testCase2, 77));
        System.out.println(s.fiveStarReviews(testCase3, 77));
        System.out.println(s.fiveStarReviews(testCase4, 77));
    }
}
