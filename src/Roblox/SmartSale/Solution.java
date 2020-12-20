package Roblox.SmartSale;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static int distinctId(int arr[], int n, int mi) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int count = 0, size = 0;

        for(int i = 0; i < n; i++) {
            if(m.containsKey(arr[i]) == false) {
                m.put(arr[i], 1);
                size++;
            }
            else {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> mp: m.entrySet()) {
            if(mp.getKey() <= mi) {
                mi -= mp.getKey();
                count++;
            }
            else return size - count;
        }
        return  size - count;
    }
}
