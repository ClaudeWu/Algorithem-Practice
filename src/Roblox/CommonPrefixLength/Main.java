package Roblox.CommonPrefixLength;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<String> testcase1 = Arrays.asList("ababaa");
        List<String> testcase2 = Arrays.asList("aa");

        System.out.println(s.commonPrefix(testcase1));
        System.out.println(s.commonPrefix(testcase2));
    }
}
