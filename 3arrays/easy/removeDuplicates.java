class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int uniquepointer = 0;
        for(int i=1;i<n;i++){
            if(nums[uniquepointer] !=nums[i]){
                ++uniquepointer;
                nums[uniquepointer] =nums[i];
            }
        }
        return uniquepointer+1;
    }
}
