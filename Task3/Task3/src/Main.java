public class Main {
    public static String findFirstKOcurrence(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) {
                return Integer.toString(arr[i]);
            }
        }
        return "Any number in the array has that occurence";
    }

    public static void main(String[] args) {
        //int[] arr = {5, 2,1, 2, 12,1, 12,1, 1};
        //int k = 4;
        int[] arr = {5, 2, 2, 12, 12, 1};
        int k = 2;
        String result = findFirstKOcurrence(arr, k);
        System.out.println(result); // Output: 2
    }
}