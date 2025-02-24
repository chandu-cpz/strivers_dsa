import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        int topA = 0, topB = 0;

        while (topA < a.length && topB < b.length) {
            if (!arr.isEmpty() && arr.get(arr.size() - 1) == a[topA]) {
                topA++; // Skip duplicate in 'a'
                continue;
            }
            if (!arr.isEmpty() && arr.get(arr.size() - 1) == b[topB]) {
                topB++; // Skip duplicate in 'b'
                continue;
            }

            if (a[topA] < b[topB]) {
                arr.add(a[topA]);
                topA++;
            } else if (a[topA] > b[topB]) {
                arr.add(b[topB]);
                topB++;
            } else { // If both are equal, add only one and move both pointers
                arr.add(a[topA]);
                topA++;
                topB++;
            }
        }

        // Add remaining elements from 'a'
        while (topA < a.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != a[topA]) {
                arr.add(a[topA]);
            }
            topA++;
        }

        // Add remaining elements from 'b'
        while (topB < b.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != b[topB]) {
                arr.add(b[topB]);
            }
            topB++;
        }

        return arr;
    }

}
