package src.ex26;
import java.util.Arrays;

public class kesimo{
    
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{4, 2, 6}, {1, 9, 3}, {8, 5, 7}};
        int k = 3;
        
        
        int[] flattenedArray = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();
        
        int kthSmallest = findKthSmallest(flattenedArray, k);
        int kthLargest = findKthLargest(flattenedArray, k);
        
        System.out.println("O " + k + "-ésimo elemento menor é: " + kthSmallest);
        System.out.println("O " + k + "-ésimo elemento maior é: " + kthLargest);
    }
}