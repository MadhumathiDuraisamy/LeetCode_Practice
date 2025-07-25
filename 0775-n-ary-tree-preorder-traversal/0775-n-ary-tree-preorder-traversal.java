/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        // Stack<Node> st=new Stack<>();
        // ArrayList<Integer> res=new ArrayList<>();
        // if(root==null) return res;
        // st.push(root);
        // while(!st.isEmpty()){
        //     Node temp=st.pop();
        //     res.add(temp.val);
        //     for(int i=temp.children.size()-1;i>=0;i--){
        //         Node t=temp.children.get(i);
        //         st.push(t);
        //     }
        // }
        // return res;
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public void preorder(Node root,List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        for(Node child:root.children){
            preorder(child,res);
        }
    }
}