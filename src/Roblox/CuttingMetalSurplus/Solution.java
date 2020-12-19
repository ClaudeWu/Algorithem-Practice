package Roblox.CuttingMetalSurplus;

import java.util.List;

public class Solution {
    public static int mixProfit(int costPerCut, int salePrice, List<Integer> lengths) {
        int profit = 0, maxLength = 0;
        for(Integer length: lengths) {
            maxLength = Math.max(maxLength, length);
        }
        for(int L = 1; L <= maxLength; L++) {
            int cut = 0, pieces = 0;
            for(Integer length: lengths) {
                int curCut = (length - 1) / L;
                int curPiece = length / L;
                if(L * salePrice * curPiece - costPerCut * curCut > 0) {
                    cut += curCut;
                    pieces += curPiece;
                }
            }
            profit = Math.max(profit, L * salePrice * pieces - costPerCut * cut);
        }
        return profit;
    }
}
