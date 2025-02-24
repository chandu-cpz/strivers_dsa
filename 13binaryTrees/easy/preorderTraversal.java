import java.util.ArrayList;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getPreOrder(root,arr);
        return arr;
    }
    public static void getPreOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;

        arr.add(root.val);
        getPreOrder(root.left,arr);
        getPreOrder(root.right,arr);

    }
}
