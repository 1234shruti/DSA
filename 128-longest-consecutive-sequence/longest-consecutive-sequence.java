import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength = 0;

        Map<Integer, Boolean> exploredMap = new HashMap<>();

        // Store all numbers
        for (int i = 0; i < nums.length; i++) {
            exploredMap.put(nums[i], false);
        }

        // Check every number
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int currentLength = 1;

            // Check forward
            int nextNum = num + 1;

            while (exploredMap.containsKey(nextNum)
                    && exploredMap.get(nextNum) == false) {

                currentLength++;

                exploredMap.put(nextNum, true);

                nextNum++;
            }

            // Check backward
            int prevNum = num - 1;

            while (exploredMap.containsKey(prevNum)
                    && exploredMap.get(prevNum) == false) {

                currentLength++;

                exploredMap.put(prevNum, true);

                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}