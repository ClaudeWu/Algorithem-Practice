/*
 * problem description:
 * Consider the only string in the array inputs = ['abcabcd'].
 * Each suffix is compared to the original string.
 *
 * EXAMPLE:
 * ---Remove to leave suffix---Suffix---Common Prefix---Length---
 * ｜                                                           ｜
 * ｜          ' '             'abcabcd'    'abcabcd'      7    ｜
 * ｜          'a'             'bcabcd'     ' '            0    ｜
 * ｜          'ab'            'cabcd'      ' '            0    ｜
 * ｜          'abc'           'abcd'       'abc'          3    ｜
 * ｜            .                .           .            .    ｜
 * ｜            .                .           .            .    ｜
 * ｜            .                .           .            .    ｜
 * ｜                                                           ｜
 * --------------------------------------------------------------
 * Sum = 7+0+0+3+0+0+0 = 10
 *
 */

package Roblox.CommonPrefixLength;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> commonPrefix(List<String> inputs) {
        int n = inputs.size();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int cur = sumOfCommP(inputs.get(i));
            res.add(cur);
        }
        return res;
    }

    private static int sumOfCommP(String s) {
        int n = s.length();
        int res = n;

        for(int l = n - 1; l > 0; l--) {
            int cur = 0;
            for(int i = 0; i < l; i++) {
                if(s.charAt(i) == s.charAt(n - l + i)) {
                    cur++;
                }
                else{
                    break;
                }
            }
            res += cur;
        }
        return res;
    }
}
