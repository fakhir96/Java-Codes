import java.util.Scanner;

public class Bulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Pattern 1
        // *
        // **
        // ***
        // ****
        // *****


        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = 0; i<=n; i++){
        //     for(int j = 0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------

        // Pattern 2
        // *****
        // ****
        // ***
        // **
        // *


        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = n; i>0; i--){
        //     for(int j = 0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------

        // Pattern 3
        //     *
        //    **  
        //   ***   
        //  ****        
        // *****

        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j = 0; j<n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k<i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------

        // Pattern 4
        // *****
        //  ****        
        //   ***   
        //    **  
        //     *

        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = 0; i<n; i++){
            
        //     for(int k = 0; k<i; k++){
        //         System.out.print(" ");
        //     }

        //     for(int j = n; j>i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// ----------------------------------------------------------------

        // Pattern 5
        
        //         *
        //     *   *   *
        // *   *   *   *   *
        //     *   *   *
        //         *

        // Assumption that n will always be odd
        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // int sp = n / 2;
        // int st = 1;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     for(int k = 1; k<=st; k++){
        //         System.out.print("*\t");
        //     }

        //     if(i <= n/2){
        //         sp--;
        //         st+=2;
        //     }
        //     else{
        //         sp++;
        //         st-=2;
        //     }

        //     System.out.println();
        // }


// ----------------------------------------------------------------

        // Pattern 6
        
        // *** ***
        // **   **
        // *     *
        // **   **
        // *** ***

        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // int st = (n/2) + 1;
        // int sp = 1;

        // for(int i = 1; i<=n; i++){
            
        //     for(int j = 1; j<=st; j++){
        //         System.out.print("*");
        //     }
        //     for(int k = 1; k<=sp; k++){
        //         System.out.print(" ");
        //     }
        //     for(int a = 1; a<=st; a++){
        //         System.out.print("*");
        //     }
            
        //     if(i >= (n/2)+1){
        //         st++;
        //         sp-=2;
        //     }
        //     else{
        //         st--;
        //         sp+=2;
        //     }

        //     System.out.println();
        // }


// ----------------------------------------------------------------

        // Pattern 7
        
        //  *
        //      *
        //          *
        //              *
        //                  *


        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(i == j){
        //             System.out.print("*");
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }


// ----------------------------------------------------------------

        // Pattern 8
        
        //                  *
        //              *
        //          *
        //      *
        //  *


        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(i + j == n + 1){
        //             System.out.print("*\t");
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------

        // Pattern 9
        
        // *   *
        //  * *
        //   *
        //  * *
        // *   *

        // System.out.print("Enter n: ");
        // int n = scn.nextInt();

        // int mt = (n/2) + 1;
        // int lt = 0;

        // for(int i = 1; i<=n; i++){

        //     for(int j = 0; j<lt; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");
            
        //     for(int k = 1; k<=mt; k++){
        //         System.out.print(" ");
        //     }
        //     if(i == (n/2)+1){
        //         lt--;
        //         mt+=2;
        //     }
        //     else if(i > (n/2)+1){
        //         lt--;
        //         mt+=2;
        //         System.out.print("*");
        //     }
        //     else{
        //         lt++;
        //         mt-=2;
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        scn.close();
    }
}
