package Roblox.CuttingMetalSurplus;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<Integer> list1 = Arrays.asList(26, 59, 103);
        List<Integer> list2 = Arrays.asList(26, 59, 103);
        List<Integer> list3 = Arrays.asList(30, 59, 110);

        int cutCost1 = 1, price1 = 10;
        int cutCost2 = 100, price2 = 10;
        int cutCost3 = 1, price3 = 10;


        System.out.println(s.mixProfit(cutCost1, price1, list1));
        System.out.println(s.mixProfit(cutCost2, price2, list2));
        System.out.println(s.mixProfit(cutCost3, price3, list3));
    }
}
