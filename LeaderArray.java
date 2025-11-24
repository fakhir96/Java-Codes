import java.util.ArrayList;

// Problem Statement: Given an array, print all the elements which are leaders. 
// A Leader is an element that is greater than all of the elements on its right side in the array.

public class LeaderArray {
    public static void main(String[] args) {
        
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = new ArrayList<>();
        
        // Brute Force Approach O(n^2)
        // for(int i = 0; i<arr.length; i++){
        //     boolean leader = true;
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[j] > arr[i]){
        //             leader = false;
        //             break;
        //         }
        //     }
        //     if (leader)
        //         result.add(arr[i]);
        // }


        // Optimal Approach O(n)

        int n = arr.length;
        int max = arr[n - 1];

        result.add(max);

        for(int i = n - 2; i>=0; i--){
            if(arr[i] > max){
                result.add(arr[i]);
                max = arr[i];
            }
        }

        for (int res : result) {
            System.out.print(res + " ");
        }


    }
}
