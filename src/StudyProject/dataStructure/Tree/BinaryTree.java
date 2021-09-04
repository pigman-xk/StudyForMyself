package StudyProject.dataStructure.Tree;

public class BinaryTree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        seqList(arr,0);
    }

    public static void seqList(int[] arr,int index){//给一个序列以二叉树的前序遍历方式顺序存储(打印)
        if(arr==null||arr.length==0){
            return;
        }
        System.out.println(arr[index]);
        if(2*index+1<arr.length){
            seqList(arr,2*index+1);
        }
        if(2*index+2<arr.length){
            seqList(arr,2*index+2);
        }
    }
    public static void list(Tree tree){
        if(tree==null){
            return;
        }
        System.out.println(tree.value);
        if(tree.left!=null){//线索化二叉树的判断条件为tree.leftType==0;由于上面已经进行判空了，这里是否判空都无所谓
            list(tree.left);
        }
        if(tree.right!=null){//线索化二叉树的判断条件为tree.leftType==0;
            list(tree.right);
        }
    }
    public static void delete(Tree tree,int value){
        if(tree==null){
            return;
        }
        if(tree.left!=null&&tree.left.value==value){
            tree.left=null;
            return;
        }else if(tree.left!=null){
            delete(tree.left,value);
        }
        if (tree.right!=null&&tree.right.value==value){
            tree.right=null;
            return;
        }else if (tree.right!=null){
            delete(tree.right,value);
        }
    }
    public static Tree find(Tree tree,int value){
        if(tree==null){
            return null;
        }
        if (tree.value==value){
            return tree;
        }
        if(tree.left!=null&&tree.left.value==value){
            return tree.left;
        }else if (tree.left!=null){
            return find(tree.left,value);
        }
        if(tree.right!=null&&tree.right.value==value){
            return tree.right;
        }else if (tree.left!=null){
            return find(tree.right,value);
        }
        return null;
    }

}
