package Amazon.RobotBoundedInCircle;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();
        String testCase1 = "GGLLGG", testCase2 = "GG", testCase3 = "GL";

        System.out.println(s.isRobotBounded(testCase1));
        System.out.println(s.isRobotBounded(testCase2));
        System.out.println(s.isRobotBounded(testCase3));
    }
}
