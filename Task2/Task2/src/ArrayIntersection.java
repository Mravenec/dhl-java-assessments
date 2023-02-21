import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();

        // loop through nums1 array
        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];

            // loop through nums2 array
            for (int j = 0; j < nums2.length; j++) {
                int num2 = nums2[j];

                // check if the two numbers are equal and not already in the intersection list
                if (num1 == num2 && !intersection.contains(num1)) {
                    intersection.add(num1);
                    break;
                }
            }
        }

        // convert the intersection list to an array and return it
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection1 = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection1)); // [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] intersection2 = intersection(nums3, nums4);
        System.out.println(Arrays.toString(intersection2)); // [9, 4]
    }
}
