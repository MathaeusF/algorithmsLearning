package main;

public class StackDemo {
    public static void main(String[] args) {
        runDemo(new ArrayDequeStack<>());
    }

    public static void runDemo(Stack<Integer> stack){
        System.out.println(stack.getClass().getSimpleName());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek ="+ stack.peek());

        System.out.println("Pop ="+ stack.pop());
        System.out.println("Pop ="+ stack.pop());
        System.out.println("Pop ="+ stack.pop());

        try{
            System.out.println("Pop ="+ stack.pop());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


    }
}
