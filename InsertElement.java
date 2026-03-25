import java.util.Scanner;

public class InsertElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
         nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int result = LinearSearchSolution(nums,target);
        
        System.out.print("Resultant index: " + result);
        sc.close();
        }
         public static int LinearSearchSolution(int[] nums , int target){
        int i,index = -1;
        for (i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    }
