
public class Que7 {
	public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int ans = n;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
