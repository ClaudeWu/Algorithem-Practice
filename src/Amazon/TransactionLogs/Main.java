package Amazon.TransactionLogs;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();
        String[] testCase = {"345366 89921 45", "029323 38239 23",
                "38239 345366 15", "029323 38239 77",
                "345366 38239 23", "029323 345366 13",
                "38239 38239 23"};

        System.out.println(Arrays.toString(s.processLogFile(testCase, 3)));
    }
}
