import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
        nums[i]= sc.nextInt();
    }
    bubbleSortLogic(nums);
    System.out.println("Sorted array:");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void bubbleSortLogic(int[] nums){
        int size = nums.length;
        int temp = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
        }
        }
    }
}