
import java.util.Arrays;


public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;

    }
    public static void sort(int[] array){
//        int smallestNumber = indexOfSmallest(array);
//        
//        
//        swap(array, 0, smallestNumber);
//        
//        
        // We do array.length - 1 since we don't have to swap the last index
        // Ex: if the length was 5. the length - 1 would be 4.
        // if i < 4 then the index would be 0, 1, 2, 3 for the 4 numbers
        // We only need to potential switch up to 4 indexs and never 5 because
        // From the second to last index the indexOfSmallest goes from second to last
        // Checking the last index to see if it is smaller or larger than the second to
        // last index. Ex: {3, 1, 5, 99, 12} {1,3, 5  -> 99, (99 checks 12 ) -> 12}
        
        for(int i = 0; i < array.length - 1; i++){
            int smallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, smallestFrom);
        }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of smallest number: " + MainProgram.indexOfSmallest(array));
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));

            MainProgram.sort(array);
            System.out.println(Arrays.toString(array));
            
    }

}
