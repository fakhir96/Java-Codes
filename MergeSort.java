public class MergeSort {

    // O(n)
    public static void Merge(int[] arr, int low, int mid, int high, int[] temp){

        int left = low; // index of array 1
        int right = mid+1; // index of array 2
        int x = 0; // index of temp array

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[x] = arr[left];
                x++;
                left++;
            }
            else{
                temp[x] = arr[right];
                x++;
                right++;
            }
        }

        while(left <= mid){
            temp[x++] = arr[left++];
        }
        while(right <= high){
            temp[x++] = arr[right++];
        }

        // Copying elements in original Array
        for(int i = low; i<=high; i++){
            arr[i] = temp[i-low];
        }

    }

    // O(log n)
    public static void Divide(int[] arr, int low, int high, int[] temp){
        if(low >= high){
            return;
        }

        int mid = (low + high) / 2;

        Divide(arr, low, mid, temp);
        Divide(arr, mid+1, high, temp);
        Merge(arr, low, mid, high, temp);
    }


    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 7, 8, 2, 0};
        int n = arr.length;
        int[] temp = new int[n];

        Divide(arr, 0, n-1, temp);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
