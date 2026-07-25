
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int counts = Integer.valueOf(scanner.nextLine());
        
        for (int i = number; i <= counts; i++){
            System.out.println(i);
        }
    }
}
