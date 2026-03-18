import java.util.Scanner;

public class PeakIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to add: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution.findPeak(nums);
    }
}

class Solution {
    public static void findPeak(int[] nums) {
        if (nums.length < 3) {
            System.out.println("Array too small to have a peak.");
            return;
        }

        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                System.out.println("Peak found at index: " + mid);
                return;
            } else if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("No peak found");
    }
}