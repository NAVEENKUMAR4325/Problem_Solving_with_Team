import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3, 5};
        System.out.println(mostFrequentUsingMap(arr));
    }

    public static int mostFrequentUsingMap(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int mostFrequent = arr[0], maxCount = 0;

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            if (freqMap.get(num) > maxCount) {
                maxCount = freqMap.get(num);
                mostFrequent = num;
            }
        }
        return mostFrequent;
    }
}
