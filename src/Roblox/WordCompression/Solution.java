package Roblox.WordCompression;

public class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder string = new StringBuilder(s);
        int i = 0;
        int count[] = new int[s.length()];

        while(i < string.length()) {
            if(i == 0 || string.charAt(i -1) != string.charAt(i)) {
                count[i] = 1;
            }
            else {
                count[i] = count[i - 1] + 1;
                if(count[i] == k) {
                    string.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
            i++;
        }
        return string.toString();
    }
}
