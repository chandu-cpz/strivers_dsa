class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] ==0){
                int zeroIndex = i;
                int nonZeroIndex = i;
                while( nonZeroIndex< n && nums[nonZeroIndex]!=0){
                    ++nonZeroIndex;
                }
                if(nonZeroIndex<n){
                    nums[zeroIndex] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = 0;

                }
            }
        }
        
    }
}

///Better appraoch
//class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;  // Pointer for placing non-zero elements

        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Second pass: Fill the rest with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}

//Best alternative that is faster 
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;  // Pointer for the position of the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if i and nonZeroIndex are different
                if (i != nonZeroIndex) {
                    int temp = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;
                }
                nonZeroIndex++; // Move pointer forward
            }
        }
    }
}
