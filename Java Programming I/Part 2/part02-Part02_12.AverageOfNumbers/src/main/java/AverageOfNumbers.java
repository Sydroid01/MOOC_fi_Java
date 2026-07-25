
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        double sum = 0;
        int amount = 0;
        
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());
            
            if (number == 0){
                break;
            }
            
            if (number != 0){
                sum = sum + number;
                amount = amount + 1;
            }
        }
        
        average = sum / amount;
        
        System.out.println("Average of the numbers: " + average);

    }
}
