import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int [] array = {10, 20, 30, 20, 40, 50, 40, 60, 80, 80};
        int data = 80;
        int i = lastOccurrence(array, array.length - 1, data);
        if (i != -1) {
            System.out.println("Last index of" + data + " is at index: " + i);
        } else {
            System.out.println("Element " + data + " not found in the array.");
        }
    }

    public static int lastOccurrence(int[] array, int idx, int data) {
        if (idx < 0)
            return -1;
        if (array[idx] == data)
            return idx;
        else
            return lastOccurrence(array, idx - 1, data);
    }
}
