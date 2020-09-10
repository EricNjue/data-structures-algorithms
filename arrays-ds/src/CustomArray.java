public class CustomArray {

    private int[] items;
    private int count;

    public CustomArray(int size) {
        items = new int[size];
    }

    // insert an element from the array ...
    public void insert(int value) {
        // if array is full, resize it ...
        if (items.length == count) {
            // create a new array e.g twice the size ...
            int[] newItems = new int[count * 2];

            // copy all the existing items ...
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // set items to this new array ...
            items = newItems;
        }


        // add the new item at the end ...
        items[count] = value;
        count++;
    }

    // removing an element from the array ....
    public void removeAt(int index) {
        // validate the index ...
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException(String.format("Invalid index '%d' supplied", index));

        // shift the items to the left to fill the hole ...
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public void insertAt(int index, int value) {
        // Create a new array with a size of CurrentArraySize + 1 ;
        int[] newArray = new int[count + 1];

        // Copy the 1st n elements of the initial array upto index - 1
        for (int i = 0; i < newArray.length - 1; i++) {
            if (i < index) {
                newArray[i] = items[i];
            } else if (i == index)
                newArray[index] = value;
            else
                newArray[i] = items[i];

        }
        items = newArray;
    }

    public void reverse() {
        // create a new array of the same size ...
        int[] newArray = new int[count];
        int j = count;
        for (int i = 0; i < count; i++) {
            newArray[j - 1] = items[i];
            j--;
        }
        items = newArray;
    }

    public int max() {
        int max = items[0];

        for (int i = 1; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public int indexOf(int item) {
        // if we find it, return its index
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }

        // otherwise, return -1
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
