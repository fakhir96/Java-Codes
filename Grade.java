import java.util.Scanner;

public class Grade {
    //Method to Round Off Each Array Elelment 
    public static int[] gradingStudents(int[] arr){
        for(int i = 0; i<arr.length; i++){ // Loop for the grades array
            if(arr[i] < 38){ // Fail condition
                continue; //skipping the fall
            }
            // Actual Round Off Logic
            for(int x = 0; x<5; x++){ 
                int rounded = arr[i] + x;
                if(rounded % 5 == 0 && x<3){
                    arr[i] = rounded;
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

        // Round Off Through Function and save into the array grades
        grades = gradingStudents(grades);


        System.out.println("Rounded Off Grades");
        for(int x = 0; x<n; x++){
            System.out.println("Grade " + (x+1) + ": " + grades[x]);
        }

        sc.close();
    }
}
