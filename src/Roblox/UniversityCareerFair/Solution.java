package Roblox.UniversityCareerFair;

import java.util.Arrays;

public class Solution {
    public static int num_maxEvents(int[] arr, int[] dur) {
        int drop = 0;
        int NumOfEvents = arr.length;
        int[][] intervals = new int[NumOfEvents][2];

        for (int i = 0; i < NumOfEvents; i++) {
            intervals[i] = new int[]{
                    arr[i], arr[i] + dur[i]
            };
        }

        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int curTime = intervals[0][1];

        for (int j = 1; j < NumOfEvents; j++) {
            int[] toSchedual = intervals[j];
            if (toSchedual[0] < curTime) {
                drop++;
            } else {
                curTime = toSchedual[1];
            }
        }
        return NumOfEvents - drop;
    }
}
