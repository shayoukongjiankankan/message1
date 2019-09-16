public class TreeNodetonode {
    //将二叉搜索树转换为双向链表
    public TreeNode Convert(TreeNode root){
        if(root==null){
            return null;
        }
        if (root.left==null&&root.right==null){
            return root;
        }
        TreeNode left=Convert(root.left);
        TreeNode p=left;
        while (p.right!=null){
            p=p.right;
        }
        if (left!=null){
            p.right=root;
            root.left=p;
        }
        TreeNode right=Convert(root.right);
        if (right!=null){
            root.right=right;
            right.left=root;
        }
        return left!=null?left:root;
    }
}
