import java.util.*;

public class MergeAndSortLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7, 1, 5, 3);
        List<Integer> list2 = Arrays.asList(8, 6, 2, 4, 9);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);  // Sorting the merged list

        System.out.println("Merged Sorted List: " + mergedList);
    }
}

