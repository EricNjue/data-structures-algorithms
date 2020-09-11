public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list.getKthNodeFromTheEnd(3));

        // list.reverse();
        // System.out.println(Arrays.toString(list.toArray()));

//        list.removeLast();
//
//        int[] data=list.toArray();
//
//        System.out.println(list.indexOf(20));
//        System.out.println(list.contains(10));

    }
}
