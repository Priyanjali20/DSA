import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int [] array = {10, 20, 30, 20, 40, 50, 40, 60, 80, 80};
        int data = 80;
        AllOccurrences(array, 0, data);
    }

    public static void AllOccurrences(int[] array, int idx, int data) {
        if (idx >= array.length)
            return;
        if (array[idx] == data)
            System.out.println("Index: " + idx);
        AllOccurrences(array, idx + 1, data);
    }
}
