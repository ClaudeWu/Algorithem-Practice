/*
 * this problem also know as Efficient Vineet or leetCode (881.Boats to Save People)
 *
 * problem description:
 * Find the minimum number of groups who's sum of each group is at max 3,
 * and every element must be in a group.
 * Given an Array like: [1.01, 1.01, 3.0, 2.7, 1.99, 2.3, 1.7]
 * return the minimum number of groups, in this case
 * it would be 5 groups: (1.01 , 1.99), (1.01, 1.7), (3.0), (2.7), (2.3)
 * Constraint: all elements are between 1.01-3 inclucsive, and each groups sum is at max 3
 *
 */

package Roblox.EfficientJanitor;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(double[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return ans;
    }
}
