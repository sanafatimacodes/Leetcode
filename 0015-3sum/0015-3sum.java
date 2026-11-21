import java.util.*;

class Solution {

    void TwosumHelper(int f, int[] nums, List<List<Integer>> res) {
        int i = f + 1;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[f] + nums[i] + nums[j];

            if (sum > 0) {
                j--;
            } else if (sum < 0) {
                i++;
            } else {
                res.add(Arrays.asList(nums[f], nums[i], nums[j]));

                int left = nums[i];
                int right = nums[j];

                while (i < j && nums[i] == left) {
                    i++;
                }

                while (i < j && nums[j] == right) {
                    j--;
                }
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int f = 0; f < nums.length - 2; f++) {
            if (f > 0 && nums[f] == nums[f - 1]) {
                continue;
            }

            TwosumHelper(f, nums, res);
        }

        return res;
    }
}