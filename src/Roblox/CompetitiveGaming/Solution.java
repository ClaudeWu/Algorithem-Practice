/*
 * also know as Cut of Rank (Amazon OA)
 */
package Roblox.CompetitiveGaming;

public class Solution {
    public int contNumPlayerToLevelUp(int comGaming, int[] scores) {
        int[] frequencies = new int[100 + 1];
        for(int score: scores) {
            frequencies[score]++;
        }

        int ans = 0, currentRank = 1;
        for(int i = 100; i >= 0 && currentRank <= comGaming; i--) {
            if(frequencies[i] == 0) {
                continue;
            }
            ans += frequencies[i];
            currentRank += frequencies[i];
        }
        return ans;
    }
}
