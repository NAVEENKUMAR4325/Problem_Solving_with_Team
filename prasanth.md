# Done By:

```

Name: Prasanth U
Regno: 212222220031
Dept:IT
Date:24.03.2025
```
## Problem

```
Write a Java program to merge two sorted ArrayLists into a single sorted list.
```
## Approach
```
Merging the array using Merge Function
```
## Code

```
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


```
## OUTPUT:

![image](https://github.com/user-attachments/assets/c598be79-dc7e-4c1d-9f61-e25d197e7416)
