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