// Rearrange array in increasing–decreasing order, meaning:

// First half of array → ascending
// Second half → descending

public class ArrayOps {

    public static void AscSort(int[] arr, int low, int high){

        for(int i = low; i<high; i++){
            for(int j = low; j<high-i; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void reverse(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; end--;
        }   
    }

    public static void main(String[] args) {
        
        int[] arr = {3, 1, 2, 5, 4,2,7,6};
        int n = arr.length;

        AscSort(arr, 0, n-1); // Sorting whole Array through Bubble
        reverse(arr, n/2, n-1); // Reversing the second half

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");;
        }


    }
    
}
