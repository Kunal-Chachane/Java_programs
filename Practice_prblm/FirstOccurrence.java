import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = scanner.nextInt();
        int result = FirstOccurenceFinder.findFirstOccurrence(arr, target);
        System.out.println("First Occurrence: "+ result);
    }
    
}
class FirstOccurenceFinder {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0 ; int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                    index = mid;
                    high = mid - 1;
                }
             else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
