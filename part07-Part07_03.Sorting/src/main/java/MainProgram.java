
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
   
    }

     public static int smallest(int[] array) {
        int smallest = array[0];
        for(int candidate : array) {
            if(candidate < smallest) smallest = candidate;
        }    
        return smallest;
    }
   
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int i = 0;
        int smallest = array[startIndex];
        for(i = startIndex; i<array.length; i++) {
            if(smallest > array[i]) smallest = array[i];
        }
        int indexToReturn = 0;
        for(i = startIndex; i<array.length; i++) {
            if(array[i] == smallest) indexToReturn = i;
        }
     
        return indexToReturn;
        
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int i = 0;
        for(i = 0; i < array.length; i++) {
            if(array[i] == smallest) return i;
        }
        return i;
        
    }
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        int i = 0;
        for(int number : array) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestIndex, i);
            i++;
        }
    }
    
    
}
