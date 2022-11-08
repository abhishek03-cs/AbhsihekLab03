import java.util.Stack;

public class BinarySearchTree {
    int data;
    BinarySearchTree left;
    BinarySearchTree right;
    BinarySearchTree(int data){
        this.data=data;
        left=null;
        right=null;
    }

    public static BinarySearchTree inputTree(BinarySearchTree root, int data){
        if(root==null){
            return new BinarySearchTree(data);
        }
        if(root.data>data)
            root.left=inputTree(root.left,data);
        else root.right=inputTree(root.right,data);
        return root;
    }


    public static void findPairSum(BinarySearchTree root,int sum,boolean found){
        if(root==null){
            if(!found)
                System.out.println("nodes are not found");
            return;

        }
        if(root.data>sum)
            findPairSum(root.left,sum,found);
        if(sum-root.data<root.data){
            if(isNumberPresent(root.left,sum-root.data))
                System.out.println("Pair is ("+root.data+" "+(sum- root.data)+")");
            return;

        }
        if(isNumberPresent(root.right,sum-root.data)){
            System.out.println("Pair is ("+root.data+" "+(sum- root.data)+")");
            findPairSum(root.right,sum,true);
        }else{
            findPairSum(root.right,sum,found);
        }

    }

    public static boolean isNumberPresent(BinarySearchTree root,int data){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        if(root.data<data)
            return isNumberPresent(root.right,data);
        return isNumberPresent(root.left,data);
    }

}
