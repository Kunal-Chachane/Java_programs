import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of array: ");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to search: ");
    int key = sc.nextInt();
    int result = linearSearchSolution(arr, key);
    if(result == -1){
        System.out.println("Element not found");
    }else{
        System.out.println("Element found at index: " + result);
    }
}
public static int linearSearchSolution(int[] arr, int key){
    for(int i=0; i<arr.length; i++){
        if(arr[i] == key){
            return i;
        }
    }
    return -1;
}
}