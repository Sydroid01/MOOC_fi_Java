
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grades = Integer.valueOf(scan.nextLine());
        
        if (grades < 0){
            System.out.println("Impossible");
        } else if (grades <= 49){
            System.out.println("Failed");
        } else if (grades <= 59){
            System.out.println("Grade: 1");
        } else if (grades <= 69){
            System.out.println("Grade: 2");
        } else if (grades <= 79){
            System.out.println("Grade: 3");
        } else if (grades <= 89){
            System.out.println("Grade: 4");
        } else if (grades <= 100) {
            System.out.println("Grade: 5");
        } else if (grades > 100){
            System.out.println("Incredible!");
        }
    }
}
