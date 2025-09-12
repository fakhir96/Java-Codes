import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Any Base to Any Base (Without Hex)
        
        System.out.print("Enter a number: ");    
        int n = sc.nextInt();

        System.out.print("Enter base of number: ");
        int b1 = sc.nextInt(); // source base

        System.out.print("Enter base to convert: ");
        int b2 = sc.nextInt(); // target base


        int dec = toDecimal(n, b1);
        long val = decToTarget(dec, b2);

        // Converted Value
        System.out.println("Final Ans = "+val);

        sc.close();
    }

    public static int toDecimal(int n, int b1){
        
        int fnum = 0;

        int i = 0;

        while(n != 0){
            int dig = n % 10;
            n = n / 10;
            fnum += dig * Math.pow(b1, i);
            i++;
        }


        return fnum;
    }

    public static long decToTarget(int n, int b2){

        long fnum = 0;

        long i = 1;

        while(n != 0){
            int dig = n % b2;
            n = n / b2;
            fnum += (long)dig * i;
            i *= (long)10;
        }

        return fnum;

    }
    
}
