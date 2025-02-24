class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int swapCount = 0;
        int start = 0;
        while (swapCount < n) {
            int current = start;
            int prev = nums[start];
            do {
                int newIndex = (current + k) % n;
                int temp = nums[newIndex];
                nums[newIndex] = prev;
                prev = temp;
                current = newIndex;
                ++swapCount;

            } while (current != start);
            start++;
        }
    }
}
