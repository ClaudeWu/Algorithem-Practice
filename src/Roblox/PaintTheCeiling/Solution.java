/*
 * https://www.lintcode.com/problem/paint-the-ceiling/description
 * You want to build yourself a house. The building company you hired can only build houses with sides from their specific set s.
 * That means they can build you a square house or a rectangular one but if and only if its length and width belong to the sets.
 * This month, they have a special promotion: they will paint the ceiling of a new house for free... but only if its area is not more than a,
 * You want them to do it for free but you also want to be sure that the house will be comfortable and not too small.
 * How many possible house configurations can you create to have the ceiling painted for free given the side lengths offered?
 *
 * There is a method to how the company decides what lengths of sides to produce. To determine n lengths of wall s segments to offer,
 * they start with a seed value s0, some variables k, b and m, and use the following equation to determine all other side lengths Si:
 *
 * Si =((k×Si−1+b) mod m+1+Si−1) for 1≤i<n
 *
 * Example:
 * Input:
 * s_0 = 2
 * n = 3
 * k = 3
 * b = 3
 * m = 2
 * a = 15
 * Output: 5
 */

package Roblox.PaintTheCeiling;

public class Solution {
    /**
     * @param s0: the number s[0]
     * @param n:  the number n
     * @param k:  the number k
     * @param b:  the number b
     * @param m:  the number m
     * @param a:  area
     * @return: the way can paint the ceiling
     */
    public long painttheCeiling(int s0, int n, int k, int b, int m, long a) {
        // write your code here
        long[] A = new long[n];
        A[0] = s0;
        for (int i = 1; i < A.length; i++) {
            A[i] = (k * A[i - 1] + b) % m + 1 + A[i - 1];
        }

        long res = 0;
        int l = 0, r = A.length - 1;
        while (l <= r) {
            if (A[l] * A[r] <= a) {
                res += 2L * (r - l) + 1;
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
