## Name: Naveen Kumar E
## Date: 24/3/2025

# Count Available Workdays

## Problem Description
You are given a positive integer `days` representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array `meetings` of size `n` where `meetings[i] = [start_i, end_i]` represents the starting and ending days of meeting `i` (inclusive).

Return the count of days when the employee is available for work but no meetings are scheduled.

**Note:** The meetings may overlap.

---

## Solution Approach

### Intuition
To solve this problem efficiently, we leverage sorting and iteration:
1. **Sort the Meetings:** Sort all meetings based on their starting day. This helps in processing meetings in chronological order.
2. **Track the Last Meeting End:** Maintain a variable `last` to track the maximum day covered by meetings, initially set to `0`.
3. **Identify Gaps:** Iterate through each meeting and check if there is a gap between `last` and the current meeting's start day:
   - If `last < start_i`, calculate the free days in this gap and add to the answer.
   - Otherwise, meetings overlap or are contiguous.
4. **Expand the Meeting Scope:** Update `last` to the maximum of its current value and the meeting's end day.
5. **Check Remaining Days:** If `last < days`, add the remaining free days after the last meeting.

This structured approach ensures an efficient calculation of available workdays without scheduled meetings.

---

## Solution Implementation

### Java Implementation
```java
import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort the meetings based on their starting day
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
      
        int ans = 0; // To hold the count of free days
        int last = 0; // To track the last day covered by meetings

        // Iterate over all the meetings
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
          
            // If there are free days before the start of this meeting
            if (last < start) {
                ans += start - last - 1; // Count these free days
            }
          
            // Update the last covered day
            last = Math.max(last, end);
        }
      
        // Add any remaining days after the last meeting to the free days
        ans += days - last;

        return ans; // Return the total count of free days
    }
}
```

---

## Example Walkthrough
### Example Input:
```java
int days = 10;
int[][] meetings = {{1, 2}, {5, 6}, {8, 8}};
```
### Processing:
1. **Sorted Meetings:** `[[1, 2], [5, 6], [8, 8]]`
2. **Tracking Free Days:**
   - `last = 0`
   - Meeting `[1,2]`: No gap, `last = 2`
   - Meeting `[5,6]`: Free days `3, 4`, `ans = 2`, update `last = 6`
   - Meeting `[8,8]`: Free day `7`, `ans = 3`, update `last = 8`
   - Remaining free days `9, 10`, `ans = 5`

### Final Output:
```java
Output: 5  // Available workdays: 3, 4, 7, 9, 10
```

---

## Complexity Analysis
- **Time Complexity:** `O(n log n)` due to sorting and `O(n)` for iteration, resulting in `O(n log n)` overall.
- **Space Complexity:** `O(log n)` for sorting, making it efficient in memory usage.

---

## Summary
This solution efficiently determines the total number of available workdays without meetings using sorting and iteration, ensuring optimal performance for large inputs.



