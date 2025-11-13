import java.util.Scanner;

public class RotatingArray {
    
    public static void rotateLeft(int[] arr, int k){
        for(int i = 0; i<k; i++){
            
            int temp = arr[0];
            for(int j = 0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp; 
        }
    }

    public static void rotateRight(int[] arr, int k){
        for(int i = 0; i<k; i++){
            
            int temp = arr[arr.length-1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        System.out.print("Enter rotating index: ");
        int k = sc.nextInt();

        k = k % arr.length; 
        if (k < 0) {
            k = -k;
            rotateRight(arr, k);
        } 
        else if (k > 0) {
            rotateLeft(arr, k);
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");;
        }

        sc.close();
    }
    
}
