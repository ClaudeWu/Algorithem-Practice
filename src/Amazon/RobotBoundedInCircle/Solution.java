/*
 * LeetCode 1041
 *
 * On an infinite plane, a robot initially stands at (0, 0) and faces north. The robot can receive one of three instructions:
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degrees to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 *
 * Example
 * Input: instructions = "GGLLGG"
 * Output: true
 * Explanation: The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
 * When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
 *
 */

package Amazon.RobotBoundedInCircle;

public class Solution {
    public boolean isRobotBounded(String ins) {
        int x = 0, y = 0, i = 0;
        int[][] d = {{0, 1}, {1, 0}, {0, -1}, { -1, 0}};
        for(int j = 0; j < ins.length(); j++) {
            if(ins.charAt(j) == 'R') {
                i = (i + 1) % 4;
            } else if(ins.charAt(j) == 'L') {
                i = (i + 3) % 4;
            } else {
                x += d[i][0];
                y += d[i][1];
            }
        }
        return x == 0 && y == 0 || i > 0;
    }
}
