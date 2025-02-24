class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for(int i: nums){
            if(i==0){
                if(curr>max) max = curr;
                curr =0;
            }
            else ++curr;
        }
        return Math.max(max,curr);
    }

}
