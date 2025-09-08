
// Question Statement: 
// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340


import java.util.Scanner;

public class Rotating_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        int temp = n;
        int total = 0;

        // Count the digits
        while (temp != 0) {
            temp = temp / 10;
            total++;
        }

        // Handling k more than the size of the number e.g 160 means no rotaion if
        // number of digits is 5
        k = k % total;

        // Converting Negative to Positive Rotation
        if (k < 0) {
            k = k + total;
        }

        int div = (int) Math.pow(10, k);

        int remainder = n % div;
        int r = total - k;

        int mul = (int) Math.pow(10, r);
        n = n / div;

        int x = n + remainder * (mul);

        System.out.println("Rotated = " + x);

        sc.close();
    }
}
