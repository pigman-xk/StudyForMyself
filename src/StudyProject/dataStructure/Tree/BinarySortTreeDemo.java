package StudyProject.dataStructure.Tree;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        binarysorttree a = new binarysorttree();
        int[] arr = {7,3,10,12,5,1,9};
        for(int i =0;i<arr.length;i++){
            a.add(new Node(arr[i]));
        }
        a.infixOrder();
    }
}
class binarysorttree{
    Node root;
    public void add(Node node){
        if(root==null){
            root=node;
        }else {
            root.add(node);
        }
    }
    public void infixOrder(){
        if(root!=null){
            root.infixOrder();
        }else{
            System.out.println("此树为空");
        }
    }
}
class Node{
    Node left;
    Node right;
    int val;
    public Node(int value){
        this.val=value;
    }
    public void add(Node node){

        if(node.val<this.val){
            if(this.left==null){
                this.left=node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right==null){
                this.right=node;
            }else{
                this.right.add(node);
            }
        }
    }
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this.val);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
}