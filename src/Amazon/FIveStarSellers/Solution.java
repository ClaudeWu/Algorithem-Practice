/*
 * problem description:
 *
 * For example, let's say there are 3 products (n = 3)
 * where productRatings = [[4,4], [1,2], [3, 6]], and the percentage ratings Threshold = 77.
 * The first number for each product in productRatings denotes the number of fivestar reviews,
 * and the second denotes the number of total reviews. Here is how we can get the seller to
 * reach the threshold with the minimum number of additional five-star reviews:
 *
 * @ Before we add more five-star reviews, the percentage for this seller is ((4 / 4) + (1/2) + (3/6))/3 = 66.66%
 * @ If we add a five-star review to the second product, the percentage rises to ((4 / 4) + (2/3) +(3/6))/3 = 72.22%
 * @ If we add another five-star review to the second product, the percentage rises to ((4 / 4) + (3/4) + (3/6))/3 = 75.00%
 * I@ f we add a five-star review to the third product, the percentage rises to ((4/4) + (3/4) + (4/7))/3 = 77.38%
 *
 * At this point, the threshold of 77% has been met.Therefore, the answer is 3 because that is the minimum number
 * of additional five-star reviews the company needs to become a five-star seller.
 */

package Amazon.FIveStarSellers;

import java.util.PriorityQueue;

public class Solution {
    public int fiveStarReviews(int[][] products, int threshold) {
        int total = products.length;
        double curPercent = 0.0;
        double dThreshold = threshold / 100.0 * total;
        PriorityQueue<int[]> pq = new PriorityQueue<>((first, second) -> {
            int a = first[1], b = first[0];
            int c = second[1], d = second[0];
            return a * c * (a - c) - a * d * (d + 1) + b * c * (c + 1);
        });
        for (int[] p : products) {
            curPercent += ((double) p[0] / p[1]);
            if (p[1] > p[0]) {
                pq.offer(p);
            }
        }

        int ret = 0;
        while (curPercent < dThreshold) {
            int[] p = pq.poll();
            ret++;
            curPercent += (1 - (double) p[0] / p[1]) * (1.0 / (p[1] + 1));
            p[0]++;
            p[1]++;
            pq.offer(p);
        }
        return ret;
    }
}
