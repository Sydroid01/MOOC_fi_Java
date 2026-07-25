
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        double sum = 0;
        double amount = 0;
        
        while (true){
            double number = Double.valueOf(scanner.nextLine());
            
            if (number > 0){
                amount = amount + 1;
                sum = sum + number;
            }
            
            if (number == 0){
                if (sum == 0){
                    System.out.println("Cannot calculate the average");
                } else if (sum != 0){
                    average = sum / amount;
                    System.out.println(average);
                }
                
                break;
            }
            
            
        }
        
        

    }
}
