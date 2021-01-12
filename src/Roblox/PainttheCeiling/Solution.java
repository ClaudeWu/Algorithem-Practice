package Roblox.PainttheCeiling;

public class Solution {
    public long PainttheCeiling (int s0, int n, int k, int b, int m, long a) {
        long[] A = new long[n];
        A[0] = s0;

        for(int i = 1; i < A.length; i++) {
            A[i] = (k * A[i - 1] + b) % m + 1 + A[i - 1];
        }

        long res = 0;
        int l = 0, r = A.length - 1;
        while(l <= r) {
            if(A[l] * A[r] <= a) {
                res += 2L * (r - l) + 1;
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
