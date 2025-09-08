import java.util.Scanner;

public class Num_Probs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Is a Prime Number

        System.out.println("Amount of Numbers: ");
        int t = sc.nextInt();
        int n;

        for (int i = 0; i < t; i++) {

            System.out.println("Enter a number");
            n = sc.nextInt();

            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

        // ----------------------------------------------------------------------

        // Print all Prime Numbers till N

        // System.out.print("Enter lower limit: ");
        // int low = sc.nextInt();

        // System.out.print("Enter upper limit: ");
        // int high = sc.nextInt();

        // for(int i = low; i<=high; i++){

        // int count = 0;
        // for(int j = 2; j*j <= i; j++){
        // if(i % j == 0){
        // count++;
        // break;
        // }
        // }

        // if(count == 0){
        // System.out.println(i);
        // }
        // }

        // ----------------------------------------------------------------------

        // Printing Fibonacci Series till N

        // int a = 0;
        // int b = 1;

        // System.out.print("\n
        // Total = ");
        // int n = sc.nextInt();

        // for(int i = 0; i<n; i++){
        // System.out.println(a);
        // int c = a+b;
        // a = b;
        // b = c;
        // }

        // ----------------------------------------------------------------------

        // Digits of a NUmber from Left to Right

        // System.out.println("Enter a number");
        // int n = sc.nextInt();

        // int total = 0;
        // int temp = n;

        // // Count the digits
        // while (temp != 0) {
        // temp = temp / 10;
        // total++;
        // }

        // // Didvide it with 100 if n is 754 to get 7
        // // Likewise happens with bigger numbers so to get the dividor like 100 we do
        // this
        // int div = (int) Math.pow(10, total - 1);

        // while (div != 0) {
        // int q = n / div;
        // System.out.println(q);

        // n = n % div;
        // div = div / 10;
        // }

        // ----------------------------------------------------------------------

        // Inverse of a Number

        // int n = 21453;
        // int inv = 0;
        // int op = 1;

        // while(n != 0){
        // int od = n % 10;
        // int id = op;
        // int ip = od;

        // inv = inv + id * (int)Math.pow(10, ip -1);

        // n = n / 10;
        // op++;
        // }

        // System.out.println(inv);


        sc.close();
    }
}
