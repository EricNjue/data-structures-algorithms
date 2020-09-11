public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


//        String str = "(1+2}";
//
//        Expression expression = new Expression();
//        System.out.println(expression.isBalanced(str));


//        StringReverser stringReverser = new StringReverser();
//        var result = stringReverser.reverse("ERIC");
//        System.out.println(result);
    }
}
