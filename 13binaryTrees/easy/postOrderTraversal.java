import java.util.ArrayList;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getPostOrder(root,arr);
        return arr;
    }
    public static void getPostOrder(TreeNode root,ArrayList<Integer> arr){
        if (root == null) return;

        getPostOrder(root.left,arr);
        getPostOrder(root.right,arr);
        arr.add(root.val);
    }
}
