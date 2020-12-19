package Roblox.EfficientJanitor;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        double[] testcase1 = {1.01, 1.01, 3.0, 2.7, 1.99, 2.3, 1.7};
        //int[] testcase2 = {3,5,3,4};

        System.out.println(s.numRescueBoats(testcase1, 3));
    }
}
