/*
 * this problem also know as paint house (leetcode)
 * it was solved by DP.
 *
 * problem description:
 * For example, lets say there are n=3 houses to be build.
 * Also, cost = [[1,2,3], [1,2,3], [3,3,1]].
 * denoting the cost of materials for each of the 3 houses.
 * The minimum cost to build all the houses is 4.
 *
 */
package Roblox.ConstructionManagement;

public class Solution {
    public int minCost(int[][] costs) {
        if(costs==null||costs.length==0) {
            return 0;
        }

        for(int i=1; i<costs.length; i++){
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }

        int m = costs.length-1;
        return Math.min(Math.min(costs[m][0], costs[m][1]), costs[m][2]);
    }
}
