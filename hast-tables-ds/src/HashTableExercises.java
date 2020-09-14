import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {

    // Qn. Find the most repeated element in an array of integers. What is the time complexity of this method?
    //     (A variation of this exercise is finding the most repeated word in a sentence. The algorithm is the same.
    //     Here we use an array of numbers for simplicity.)
    // O(n)
    public int mostFrequent(int[] data) {
        // [1, 2, 2, 3, 3, 3, 4]
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : data) {
            if (map.containsKey(item)) {
                int integer = map.get(item);
                map.put(item, ++integer);
            } else {
                map.put(item, 0);
            }
        }

        int result = data[0];
        int mostFrequent = -1;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > mostFrequent) {
                mostFrequent = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    // Qn. Given an array of integers, count the number of unique pairs of integers that have difference k.
    // O(n) ...
    public int countPairsWithDiff(int[] numbers, int difference) {
        // For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
        //
        // We can iterate over our array of numbers, and for each number,
        // check to see if we have (current + diff) or (current - diff).
        // But looking up items in an array is an O(n) operation. With this
        // algorithm, we need two nested loops (one to pick a,
        // and the other to find b). This will be an O(n^2) operation.
        //
        // We can optimize this by using a set. Sets are like hash tables
        // but they only store keys. We can look up a number in constant time.
        // No need to iterate the array to find it.

        // So, we start by adding all the numbers to a set for quick look up.
        Set<Integer> set = new HashSet<>();
        for (var number : numbers)
            set.add(number);


        // Now, we iterate over the array of numbers one more time,
        // and for each number check to see if we have (a + diff) or
        // (a - diff) in our set.
        //
        // Once we're done, we should remove this number from our set
        // so we don't double count it.
        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + difference))
                count++;
            if (set.contains(number - difference))
                count++;
            set.remove(number);
        }

        // Time complexity of this method is O(n).

        return count;
    }


    // Qn. Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    // O(n)
    public int[] twoSum(int[] numbers, int target) {
        // This problem is a variation of the previous problem
        // (countPairsWithDiff).
        //
        // If a + b = target, then b = target - a.
        //
        // So we iterate our array, and pick (a). Then,
        // we check to see if we have (b) in our array.
        // Similar to the last problem, this would be an O(n^2)
        // operation, because we'll need two nested loops for
        // looking up (b).
        //
        // We can optimize this by using a hash table. In this
        // hash table, we store numbers and their indexes.
        //
        // There is no need to store all the numbers in the hash table
        // first. If we find two numbers that add up to the target,
        // we simply return their indexes.

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }

        // Time complexity of this method is O(n) because we need to iterate
        // the array only once.

        return null;
    }
}
