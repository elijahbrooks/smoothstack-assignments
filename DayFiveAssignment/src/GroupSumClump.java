/**
 * @author elijahbrooks
 */
public class GroupSumClump {

    /**
     *
     * @param start index to start on with array of ints
     * @param nums array of integers to iterate through
     * @param target target sum to reach
     * @return
     */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (target == 0) return true;
        else if (start >= nums.length) return false;
        else {
            int end = start;
            while (end < nums.length && nums[end] == nums[start]) end++;
            int length = end - start;
            return groupSumClump(end, nums, target) || groupSumClump(end, nums, target - nums[start] * length);
        }
    }
}

