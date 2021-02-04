/*
 * Also know as Autoscale Policy
 *
 * Average utilization < 25%: An action is instantiated to reduce the number of instances by half if the number of
 * instances is greater than 1 (take the ceiling if the number is not an integer). If the number of instances is 1,
 * take no action. 25% <= Average utilization <= 60%: Take no action. Average utilization > 60%: An action is instantiated
 * to double the number of instances if the doubled value does not exceed 2* 10^8. If the number of instances exceeds this
 * limit upon doubling, perform no action. Given an array of integers that represent the average utilization at each second,
 * determine the number of instances at the end of the time frame.
 *
 * Example
 * instances = 2
 * averageUtil = [25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80]
 * At second 1, the average utilization averageUtil[0] = 25 <= 25. Take no action.
 * At second 2, the average utilization averageUtil[1] = 23 < 25. Reduce the number of instances by half, 2/2 = 1.
 * Since an action was taken, the system will stop checking for 10 seconds, from averageUtil[2] to averageUtil[11].
 * At averageUtil[12] = 76, 76 > 60 so the number of instances is doubled from 1 to 2.
 * There are no more readings to consider and 2 is the final answer.
 *
 */
package Amazon.UtilizationChecks;

public class Solution {
    public static int finalInstance(int instance, int[] averageUtil) {
        if(averageUtil.length == 0 || averageUtil == null || instance == 0) {
            return 0;
        }

        int limit = (int) (2 * (Math.pow(10, 8)));

        int cursor = 0;
        while(cursor < averageUtil.length) {
            int utilization = averageUtil[cursor];
            if(utilization > 60 && instance * 2 <= limit) {
                instance = instance * 2;
                cursor = cursor + 10;
            } else if(utilization < 25 && instance > 1) {
                instance = instance / 2;
                cursor = cursor + 10;
            } else {
                cursor = cursor + 1;
                continue;
            }
            cursor = cursor + 1;
        }
        //System.out.println(instance);
        return instance;
    }
}
