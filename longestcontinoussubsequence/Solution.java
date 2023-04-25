// Genrerated from chatgpt
// nearby solution is on https://www.youtube.com/watch?v=odrfUCS9sQk
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int maxCount = 1;  // initialize the maximum count to 1
        int count = 1;  // initialize the current count to 1
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {  // if the current number is greater than the previous one
                count++;  // increase the current count
                maxCount = Math.max(maxCount, count);  // update the maximum count if necessary
            } else {
                count = 1;  // reset the current count to 1
            }
        }
        
        return maxCount;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,4,7};
        Solution solution = new Solution();
        int result = solution.findLengthOfLCIS(nums);
        System.out.println(result);
    }
}
