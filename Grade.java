import java.util.Scanner;

public class Grade {
    
    public static int[] gradingStudents(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 38){
                
                continue;
            }
            for(int x = 0; x<5; x++){
                int a = arr[i] + x;
                if(a % 5 == 0 && x<3){
                    arr[i] = a;
                }
            }
        }
        return arr;
    }
    
    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades[];

        //Valiadting Students Size (n)
        System.out.println("Enter number of Students: ");
        int n = sc.nextInt();

        if(n < 1 || n>60){
            System.out.println("ERROR");
        }
        grades = new int[n];
        
        //Taking Input and Validating Grades
        int temp;
        for(int i = 0; i<n; i++){
            System.out.println("Enter Grade " + (i+1) + ": ");
            temp = sc.nextInt();

            if(temp < 0 || temp > 100) {
                System.out.println("Invalid Input");
                i--; // retry the same index
                continue;
            } 
            grades[i] = temp;    
        }


        System.out.println("Printing Original Grades");
        for(int x = 0; x<n; x++){
            System.out.println(grades[x]);
        }

        grades = gradingStudents(grades);


        System.out.println("Rounded Off Grades");
        for(int x = 0; x<n; x++){
            System.out.println("Grade " + (x+1) + ": " + grades[x]);
        }

        sc.close();
    }
}
