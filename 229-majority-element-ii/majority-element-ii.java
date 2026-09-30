import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size(); i++) {
            if (map.get(keys.get(i)) > nums.length / 3) {
                ans.add(keys.get(i));
            }
        }

        return ans;
    }
}