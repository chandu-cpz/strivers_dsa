
class Solution {
    static boolean searchInSorted(int arr[], int k) {
        for(int i: arr){
            if(i == k) return true;
        }
        return false;
    }
}
