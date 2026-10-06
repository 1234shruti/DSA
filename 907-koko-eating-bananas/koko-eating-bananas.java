class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find maximum pile
        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        // Binary Search
        while (left < right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            // Calculate total hours
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            // If Koko can finish within h hours
            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}