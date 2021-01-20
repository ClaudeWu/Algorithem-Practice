/*
 * Also know as Pairs of Songs With Total Durations Divisible by 60 (Leetcode 1010)
 *
 * We can simplify this problem as a Two Sum problem. For each time[i], we want to find how many time[j]
 * (0<= j < i) can satisfy the requirement (time[i] + time[j]) % 60 = (time[i] % 60 + time[j] % 60) = 0.
 * We can use an array/map to store the number of each time[j]%60. I use array beacause time[j]%60 <= 59
 * which is small, the "get" operation should be faster considered the hash collisions of map.
 * Time: O(N) -> traverse time array once
 * Space: 60 -> arr size 60, will be a constant if time is large enough
*/

package Amazon.AmazonMusicPair;

public class Solution {
    public int numPairsDivBy60(int[] time) {
        int res = 0;
        int[] remainder = new int[60];
        for(int i = 0; i < time.length; i++) {
            res += remainder[(60 - time[i] % 60) % 60];
            remainder[time[i] % 60] ++;
        }
        return res;
    }
}
