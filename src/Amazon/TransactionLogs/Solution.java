package Amazon.TransactionLogs;

import java.util.*;

public class Solution {
    public String[] processLogFile(String[] logs, int threshold) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String log: logs) {
            String[] words = log.split(" ");
            map.put(words[0], map.getOrDefault(words[0], 0) + 1);
            if(!words[0].equals(words[1])) {
                map.put(words[1], map.getOrDefault(words[1], 0) + 1);
            }
        }

        for(String key: map.keySet()) {
            if(map.get(key) >= threshold) {
                list.add(key);
            }
        }

        Collections.sort(list, (a, b) -> Integer.valueOf(b) - Integer.valueOf(a));
        String[] res = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
