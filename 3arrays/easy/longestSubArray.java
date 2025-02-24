class Solution {
    public int longestSubarray(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink window if sum exceeds k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // If we find a valid subarray with sum == k, update max length
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
