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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<len;i++){
                Node temp=q.remove();
                l.add(temp.val);
                for(Node child:temp.children){
                    q.add(child);
                }
            }
            res.add(l);
        }
        return res;
    }
}