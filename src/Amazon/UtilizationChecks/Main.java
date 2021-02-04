package Amazon.UtilizationChecks;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();
        int[] testCase1 = {30,5,4,8,19,89}, testCase2 = {30,  15, 18, 18, 19, 89, 15, 18, 18, 19, 89, 15, 18, 18, 19, 89, 15, 18, 18, 19, 89, 15, 18, 18, 19, 89};
        System.out.println(s.finalInstance(5, testCase1));
        System.out.println(s.finalInstance(1, testCase2));
    }
}
