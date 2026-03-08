import java.util.*;

public class findDifferentBinaryString {

    public static String findDifferentBinaryStringMethod(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = nums[i].charAt(i);

            if (c == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of binary strings (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nums = new String[n];

        System.out.println("Enter " + n + " binary strings:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }

        String ans = findDifferentBinaryStringMethod(nums);

        System.out.println("Binary string not in array: " + ans);

        sc.close();
    }
}