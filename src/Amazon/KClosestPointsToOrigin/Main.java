package Amazon.KClosestPointsToOrigin;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();

        int k1 = 1, k2 = 2;
        int[][] testCase1 = {{1, 3}, {-2, 2}};
        int[][] testCase2 = {{3,3},{5,-1},{-2,4}};

        System.out.println(Arrays.deepToString(s.kClosest(testCase1, k1)));
        System.out.println(Arrays.deepToString(s.kClosest(testCase2, k2)));
    }
}
