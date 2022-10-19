import java.util.Arrays;

public class ArrayPattern {
    public void getArrayPattern(int[] array) {
        int[] tempArray = new int[array.length];
        int arrayIndex = 0;
        int length = array.length;
        Arrays.sort(array);
        System.out.print("Input : ");
        for (int i = 0, j = array.length - 1; i < array.length / 2 || j > array.length / 2; i++, j--) {
            if (length > arrayIndex) {
                tempArray[arrayIndex] = array[j];
                System.out.print(tempArray[arrayIndex] + " ");
                arrayIndex++;
            }
            if (length > arrayIndex) {
                tempArray[arrayIndex] = array[i];
                System.out.print(tempArray[arrayIndex] + " ");
                arrayIndex++;
            }
        }
        System.out.print("\nOutput : ");
        for (int i = 0; i < tempArray.length; i++) {
            array[i] = tempArray[i];
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayPattern arraySort = new ArrayPattern();
        arraySort.getArrayPattern(new int[]{2, 6, 9, 1, 4, 5});
    }
}
