import java.util.ArrayList;

public class ArraysDataStructureApp {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(3);
        array.insert(10);
        array.insert(20);
        array.insert(300);
        array.insert(40);
        array.insert(50);

        // array.reverse();

        array.insertAt(1, 450);

        // array.removeAt(41);
//        System.out.println(array.max());
//        System.out.println(array.indexOf(20));
//        System.out.println("===================================");
        array.print();

//
//        System.out.println("===================================");
//        System.out.println("Java Dynamic Arrays --> ArrayList<E> or Vector<E>");
//        System.out.println("===================================");
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(67);
//        list.add(20);
//        list.add(50);
//        list.add(90);
//
//        list.remove(1);
//
//        System.out.println(list);
    }
}
