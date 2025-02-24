class Solution {
    public int missingNumber(int[] nums) {
        int Sum = 0;
        for(int i:nums){
            Sum+=i;
        }
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        return totalSum-Sum;
    }
}
