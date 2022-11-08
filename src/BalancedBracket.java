import java.util.Stack;

public class BalancedBracket {
    public static void checkIfBalanced(String brackets){
        Stack<Character> myStack = new Stack<>();
        char[] arr=brackets.toCharArray();
        for(char ch:arr){
            if(ch=='(' || ch=='{' || ch=='['){
                myStack.push(ch);
            }else{
                if(myStack.empty())
                {
                    System.out.println("The entered Strings do not contain Balanced Brackets");
                    return;
                }else{
                    char a=myStack.pop();
                }
            }
        }
        if(myStack.empty()){
            System.out.println("The entered String has Balanced Brackets");
        }else System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
