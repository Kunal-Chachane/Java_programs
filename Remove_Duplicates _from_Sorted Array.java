import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to remove: ");
        int target = sc.nextInt();

        int newLength = removeDuplicates(arr, target);

        System.out.println("\nNew length: " + newLength);
        System.out.print("Array after removal: ");
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int target) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != target) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}