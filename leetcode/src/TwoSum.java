import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/articles/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        for(int num : result) System.out.println(num);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[] {map.get(value), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
