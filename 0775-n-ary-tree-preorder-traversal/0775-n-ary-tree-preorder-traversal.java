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
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        st.push(root);
        while(!st.isEmpty()){
            Node temp=st.pop();
            res.add(temp.val);
            for(int i=temp.children.size()-1;i>=0;i--){
                Node t=temp.children.get(i);
                st.push(t);
            }
        }
        return res;
    }
}