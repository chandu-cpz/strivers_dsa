import java.util.ArrayList;

import javax.swing.tree.TreeNode;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getInOrder(root,arr);
        return arr;
    }
    public static void getInOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        getInOrder(root.left,arr);
        arr.add(root.val);
        getInOrder(root.right,arr);
    }
}
