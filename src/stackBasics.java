import java.util.Stack;

public class stackBasics {

    public static Stack arrayToStack(int[] intArr){
        Stack<Integer> stack = new Stack<>();
        for(Integer i : intArr){
            stack.push(i);
        }
        return stack;
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty Stack: " + stack);
        System.out.println("Is the Stack Empty? " + stack.isEmpty());

        stack.push(1001);  //.push() puts something at the top of the stack. Will display as the last item in the array.
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("Non-Empty Stack: " + stack);
        System.out.println("Stack Pop Operation returns: " + stack.pop());  //.pop() removes the top element and returns it
        System.out.println("Stack After Pop Operation: " + stack);
        System.out.println("Stack search() Operation returns: " + stack.search(1002));  //.search() returns the index of the desired element
    }
}


