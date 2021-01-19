package Amazon.ItemInContainers;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Solution s = new Solution();

        int[] testCase1 = s.numberOfItems("|**|*|*", new int[] {1, 1, 3}, new int[] {5, 6, 7});
        int[] testCase2 = s.numberOfItems("*|*|", new int[] {1}, new int[] {3}); // in between two non-closed containers
        int[] testCase3 = s.numberOfItems("****", new int[] {1}, new int[] {3}); // all stars
        int[] testCase4 = s.numberOfItems("****|******|**", new int[] {6}, new int[] {13}); // all stars
        int[] testCase5 = s.numberOfItems("|||*|||", new int[] {1}, new int[] {5}); // all stars

        int[] testCase6 = s.numberOfItems2("|**|*|*", new int[] {1, 1, 3}, new int[] {5, 6, 7});

        System.out.println(Arrays.toString(testCase1));
        System.out.println(Arrays.toString(testCase2));
        System.out.println(Arrays.toString(testCase3));
        System.out.println(Arrays.toString(testCase4));
        System.out.println(Arrays.toString(testCase5));
        System.out.println(Arrays.toString(testCase6));
    }
}
