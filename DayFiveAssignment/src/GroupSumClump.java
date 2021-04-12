import java.util.Arrays;

public class GroupSumClump {
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

