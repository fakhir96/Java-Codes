import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pattern 1

        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // for(int i = 0; i<n; i++){
        //     int icj = 1;
        //     for(int j = 0; j<=i; j++){
        //         System.out.print(icj +"\t");
        //         int icjp1 = (icj * (i-j)) / (j+1);
        //         icj = icjp1;
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------------------

        // Pattern 2
        //                 1
        //         2       3       2
        // 3       4       5       4       3
        //         2       3       2
        //                 1


        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // int st = 1;
        // int sp = n/2;        
        // int v = 1;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 0; j<sp; j++){
        //         System.out.print("\t");
        //     }
        //     int cv = v;
        //     for(int j = 1; j<=st; j++){
        //         System.out.print(cv + "\t");

        //         if(j <= st/2){
        //             cv++;
        //         }
        //         else{
        //             cv--;
        //         }
        //     }
        //     if(i <= (n/2)){
        //         st+=2;
        //         sp--;
        //         v++;
        //     }

        //     else{
        //         st-=2;
        //         sp++;
        //         v--;
        //     }
        //     System.out.println();
        // }

// ----------------------------------------------------------------------------

        // Pattern 3
        // 1                                               1
        // 1       2                               2       1
        // 1       2       3               3       2       1
        // 1       2       3       4       4       3       2


        // int n = 4;

        // int x = 1;
        // int sp = (2*n) - 3;

        // int st = 1;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=st; j++){
        //         System.out.print(x+"\t");
        //         x++;
        //     }
        //     for(int j = 1; j<=sp; j++){
        //         System.out.print("\t");
        //     }
        //     if(i == n){
        //         // x--;
        //         st--;
        //     }
        //     for(int k = 1; k<=st;k++){
        //         x--;
        //         System.out.print(x+"\t");
        //     }
        //     sp-=2;
        //     x = 1;
        //     st++;
        //     System.out.println();
        // }

// ----------------------------------------------------------------------------

        // Pattern 4
        //             *
        //             *       *
        // *       *   *       *       *
        //             *       *
        //             *

        int n = 5;
        int sp = n/2;
        int st = 1;

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=sp; j++){
                if(i == n/2 +1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j = 1; j<=st; j++){
                System.out.print("*\t");
            }

            if(i<=(n/2)){
                st++;
            }
            else{
                st--;
            }

            System.out.println();
        }

        sc.close();
    }
}
