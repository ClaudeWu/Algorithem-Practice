/*
 * Items in Containers
 * Amazon would like to know how much inventory exists in their closed inventory compartments.
 * Given a string s consisting of items as and closed compartments as an open and close i',
 * an array of starting indices startIndices, and an array of ending indices endIndices,
 * determine the number of items in closed compartments within the substring between the two indices, inclusive.
 *
 * - An item is represented as an asterisk ('*' = ascii decimal 42)
 * - A compartment is represented as a pair of pipes that may or may not have items between them ('|' = ascii decimal 124).
 *
 * Example
 * s = '|**|*|*'
 * startIndices = [1, 1]
 * endIndices = [15 6]
 *
 * The string has a total of 2 closed compartments,
 * one with 2 items and one with 1 item.
 * For the first pair of indices, (1, 5),
 * the substring is '|**|*' There are 2 items in a compartment.
 *
 * For the second pair of indices, (1, 6), the substring is '|**|*|' and there are 2 + 1 = 3 items in compartments.
 * Both of the answers are returned in an array, [2, 3].
 *
 * Function Description
 * Complete the numberOfItems function in the editor below.
 * The function must return an integer array that contains the results for each of the startIndices[i] and endIndices[i] pairs.
 *
 * numberOfItems has three parameters:
 * - s: A string to evaluate
 * - startIndices: An integer array, the starting indices.
 * - endIndices: An integer array, the ending indices.
 */

package Amazon.ItemInContainers;

import java.util.TreeMap;

public class Solution {
    public static int[] numberOfItems2(String s, int[] startIndices, int[] endIndices) {
        // **|**|*|*
        // 0 2 3
        // Idea: Use TreeMap to store the idx of | as key and value as preSum
        // So we can subtract the right (floor) to the left (ceiling)
        // Runtime: O(s log(p) + n log(p)) where s is length of the string, n is number of indices, p is number of the |
        TreeMap<Integer, Integer> map = new TreeMap<>(); // |idx->sum
        int n = startIndices.length;
        int sum = 0;
        int containerStart = -1;

        for(int i = 0; i < s.length(); i++) { // O(s log(p))
            char c = s.charAt(i);
            if(c == '|') {
                containerStart = i;
                map.put(i, sum); // O(log(s))
            } else if(containerStart >= 0) {
                // it's * and wait until the first |
                sum++;
            }
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++) { // n log(p)
            Integer leftKey = map.ceilingKey(startIndices[i] - 1); // log(p)
            Integer rightKey = map.floorKey(endIndices[i] - 1); // log(p)
            if(leftKey == null || rightKey == null || leftKey.intValue() >= rightKey.intValue()) {
                res[i] = 0;
            } else {
                // O(log p)
                res[i] = map.get(rightKey) - map.get(leftKey);
            }
        }
        return res;
    }

    public static int[] numberOfItems(String s, int[] startIndices, int[] endIndices) {
        // Idea: Use three arrays to achieve what Treemap stores but has a faster run-time
        // 012345678 idx
        // **|**|*|*
        // --2225577 left
        // 22255577- right
        // 000002233 preSum
        // Runtime: O(n + s)
        int n = startIndices.length;
        int containerStart = -1;
        int sum = 0;
        int[] preSum = new int[s.length()];

        for(int i = 0; i < s.length(); i++) { // O(s)
            char c = s.charAt(i);
            if(c == '|') {
                containerStart = i;
                preSum[i] = sum;
            } else if(containerStart >= 0) {
                // it's * and wait until the first |
                sum++;
                // Use the last container sum until |
                preSum[i] = i == 0 ? 0 : preSum[i - 1];
            }
        }

        int[] right = new int[s.length()]; // O(s)
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c == '|') {
                right[i] = i;
            } else {
                right[i] = i == s.length() - 1 ? -1 : right[i + 1];
            }
        }

        int[] left = new int[s.length()]; // O(s)
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '|') {
                left[i] = i;
            } else {
                left[i] = i == 0 ? -1 : left[i - 1];
            }
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++) { // O(n)
            int rightIdx = endIndices[i] - 1;
            rightIdx = left[rightIdx];

            int leftIdx = startIndices[i] - 1;
            leftIdx = right[leftIdx];

            if(leftIdx != -1 && rightIdx != -1 && leftIdx < rightIdx) {
                res[i] = preSum[rightIdx] - preSum[leftIdx];
            } else {
                res[i] = 0;
            }
        }
        return res;
    }

}
