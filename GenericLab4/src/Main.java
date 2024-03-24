public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> integerStack = new GenericStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(45);
        integerStack.push(25);
        System.out.println("Size: "+ integerStack.getSize());
        System.out.println("Top element: "+integerStack.peek());
        while(!integerStack.isEmpty()){
            System.out.println("Popped element: "+ integerStack.pop());
        }
    }
}