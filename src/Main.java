import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //first Problem balanced and unbalnced test case repectively
        BalancedBracket.checkIfBalanced("({[]})");
        BalancedBracket.checkIfBalanced("({}))");




        //second problem
        int[] arr=new int[]{40,20,10,30,60,50,70};
        BinarySearchTree root=null;
        for(int value:arr){
            root= BinarySearchTree.inputTree(root,value);
        }
        //pair found case
        BinarySearchTree.findPairSum(root,130,false);
        //pair not found case
        BinarySearchTree.findPairSum(root,190,false);
        BinarySearchTree.findPairSum(root,70,false);



    }




}