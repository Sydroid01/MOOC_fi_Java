
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int min = 0;
        while (min < number){
            System.out.print("*");
            min++;
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int space = 0;
        while (space < number) {
            System.out.print(" ");
            space++;
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int triangle = 1;
        int space = size - 1;
        while (triangle <= size){
            printSpaces(space);
            printStars(triangle);
            space--;
            triangle++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int tree = 1;
        int width = height - 1;
        height = height * 2;
        
        while (tree < height){
            printSpaces(width);
            printStars(tree);
            width--;
            tree = tree + 2;
            
        }
        
        tree = tree - 2;
        tree = tree / 2;
        tree = tree - 1;
        printSpaces(tree);
        printStars(3);
        printSpaces(tree);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
