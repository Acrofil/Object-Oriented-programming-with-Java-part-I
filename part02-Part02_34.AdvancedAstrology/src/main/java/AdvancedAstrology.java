
/*
                            Define a method called printSpaces(int number) that produces 
                            the number of spaces specified by number. 
                            The method does not print the line break.

                You will also have to either copy the printStars method your previous answer or reimplement it in this exercise template.
 */
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int stars = 0;
        while (number > stars) {
            System.out.print("*");
            stars++;

        }
        System.out.println();
    }

    public static void printSpaces(int number) { // 4
        // part 1 of the exercise
        int spaces = 0;

        while (spaces < number) {
            System.out.print(" ");
            spaces++;

        }
    }

    public static void printTriangle(int size) { //4 
        // part 2 of the exercise
        int line = 0;
        while (line < size) {
            printSpaces(size - line - 1);
            printStars(line + 1);
            line++;

        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int treeCrown = 0;
        int treeTrunk = 2;

        while (height > treeCrown) {
            printSpaces(height - treeCrown - 1);
            printStars(treeCrown + treeCrown + 2 - 1);
            treeCrown++;

        }

        while (treeTrunk > 0) {
            printSpaces(height - 2);
            printStars(3);

            treeTrunk--;

        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
    }
}
