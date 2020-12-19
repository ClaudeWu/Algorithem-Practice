package Roblox.ConstructionManagement;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] teatcase = {
                {1,2,2},
                {2,3,3},
                {3,3,1}
        };

        System.out.println(s.minCost(teatcase));
    }
}
