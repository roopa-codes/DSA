import java.util.HashMap;
import java.util.Map;

public class TwoSumII167 {
    public int[] twoSumApproach1(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right) {
            if(nums[left]+nums[right]==target){
                return new int[] {left+1,right+1};
            }
            if (nums[left]+nums[right]<target) {
                left++;
            }
            if(nums[left]+nums[right]>target)
            {
                right--;
            }
        }
        return new int[0];
    }
    public int[] twoSumApproach2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                // Problem returns 1-based index
                return new int[] {map.get(t) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
