//103.Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

//using stack approach

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null)return list;
        stack.push(root);
        int i=0;
        while(stack.size()>0){
            Stack<TreeNode> s = new Stack<TreeNode>();  
            List<Integer> lis = new ArrayList<Integer>();
            while(stack.size()>0){
                TreeNode node = stack.pop();
                lis.add(node.val);
                if(i%2==0){
                    if(node.left!=null) s.push(node.left);
                    if(node.right!=null) s.push(node.right);
                }else{
                    if(node.right!=null) s.push(node.right);
                    if(node.left!=null) s.push(node.left);
                }
            }
            stack=s;
            list.add(lis);
            i++;
        }
        return list;
    }
    
}
