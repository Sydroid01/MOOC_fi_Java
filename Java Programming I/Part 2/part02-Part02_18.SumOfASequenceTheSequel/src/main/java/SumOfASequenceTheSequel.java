
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        
        System.out.println("First Number?");
        int startNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last Number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        for (int i = startNumber; i <= lastNumber; i++){
            result = result + i;
            
        }
        
        System.out.println("The sum is " + result);
        

    }
}
