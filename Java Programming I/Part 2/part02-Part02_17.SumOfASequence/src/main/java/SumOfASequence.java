
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = 0;
        int sum = 0;
        int result = 0;
        
        System.out.println("Last Number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i <= lastNumber; i++){
            sum = startNumber + i;
            result = result + sum;
        }
        
        System.out.println("The sum is " + result);

    }
}
