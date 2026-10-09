
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int right = cardPoints.length - k;
        int sum = 0;

        for (int i = right; i < cardPoints.length; i++) {
            sum += cardPoints[i];
        }

        int maxSum = sum;

        for (int i = 0; i < k; i++) {
            sum = sum + cardPoints[left] - cardPoints[right];
            left++;
            right++;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
