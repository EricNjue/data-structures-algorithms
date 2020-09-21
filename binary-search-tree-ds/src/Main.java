public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        tree.traversePreOrder();
        System.out.println("\n===============");
        tree.traverseInOrder();
        System.out.println("\n===============");
        tree.traversePostOrder();
        System.out.println("\n===============");


        System.out.printf("The Height Of The Tree Is: %d%n", tree.getNodeHeight());

//        System.out.println(tree);
//
//        System.out.println(tree.find(10));
//
//
//        System.out.println(getFactorialWithLoop(4));
//        System.out.println(getFactorialWithRecursion(4));

    }

    public static int getFactorialWithLoop(int digit) {
        // e.g get factorial of 4 = 4 x 3 x 2 x 1
        // i.e 4! = 4 x 3 x 2 x 1
        int factorial = 1;

        for (int i = digit; i > 1; i--)
            factorial *= i;
        return factorial;
    }

    public static int getFactorialWithRecursion(int digit) {
        // 4! = 4 x 3 x 2 x 1 = 4 x 3!
        // i.e n! = n x (n-1)!

        // base condition ... since factorial of zero is 1 .. i.e 0! = 1
        if (digit == 0)
            return 1;

        return digit * getFactorialWithRecursion(digit - 1);
    }
}
