import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public void getSortedArray(List<Integer> myList) {
        System.out.println("List without sort");
        System.out.println(myList);

        System.out.println("   ");
        System.out.println("List in descending order");
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println("  ");
        System.out.println("List in ascending order");
        Collections.reverse(myList);
        System.out.println(myList);
    }

    public static void main(String[] args) {
        ListSort listSort = new ListSort();
        listSort.getSortedArray(Arrays.asList(2, 4, 6, 1, 20, 40, 48));
    }
}
