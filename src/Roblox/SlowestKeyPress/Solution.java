package Roblox.SlowestKeyPress;

public class Solution {
    public char slowestKey(int[] releaseTimes, String keyPressed) {
        int lCount = releaseTimes[0];
        char res = keyPressed.charAt(0);
        for(int i = 1; i < keyPressed.length(); i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if(duration > lCount || duration == lCount && keyPressed.charAt(i) > res) {
                lCount = duration;
                res = keyPressed.charAt(i);
            }
        }
        return res;
    }
}
