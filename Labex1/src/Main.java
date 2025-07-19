import java.util.Scanner; // user theke input newa hobe tai Scanner import kora holo.

// Main code
public class Main {
    public static void main(String[] args) {
        // ekta obj. Create korte hobe jeno Scanner keyboard theke input ney.
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1:");
        int subject1 = inputScanner.nextInt(); // Read the first integer input

        System.out.println("Enter marks for Subject 2:");
        int subject2 = inputScanner.nextInt(); // Read the second integer input

        /*Student object Create kore nilam
         (ei student i 2ta interface impliment korbe and method run korbe)*/
        Student student = new Student();

        /* Object diye method call kora holo jno Calculate kora hoi
        and pore print korar jonno system.out use kora hoise */
        int total = student.calculateTotal(subject1, subject2);
        double average = student.calculateAverage(subject1, subject2);

        System.out.println("----------------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("----------------------------------");

        /* Close the scanner to release system resources not necessary for small code but good practice */
        inputScanner.close();
    }
}
