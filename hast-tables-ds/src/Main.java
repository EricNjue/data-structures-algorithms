public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put(6, "Eric"); // 1
        hashTable.put(8, "Eva"); // 3
        hashTable.put(11, "Pauline"); // testing collision ...
        hashTable.put(6, "Eric Njue"); // 1

        System.out.println(hashTable.get(611));

//        CharFinder finder = new CharFinder();
//        char ch = finder.findFirstRepeatedChar("a green apple");
//        System.out.println(ch);


//        CharFinder charFinder = new CharFinder();
//        char result = charFinder.findFirstNonRepeatingChar("a green apple");
//        System.out.println(result);


//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Eric");
//        map.put(2, "John");
//        map.put(3, "Mary");
//        System.out.println(map);
//
//        map.remove(3);
//        System.out.println(map);
    }


}
