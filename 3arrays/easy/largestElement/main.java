
class Solution {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if (i>max) max=i;
        }
        return max;
    }
}
