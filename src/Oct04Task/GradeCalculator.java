package Oct04Task;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = inputValueCheck(scanner, "Enter the your grade number: ");
        if (a >= 90 && a <= 100) {
            System.out.println("Your Grade is: A");
        }else if (a >= 80 && a < 90) {
            System.out.println("Your Grade is: B");
        }
        else if (a >= 70 && a < 80) {
            System.out.println("Your Grade is: C");
        }
        else if (a >= 60 && a < 70) {
            System.out.println("Your Grade is: D");
        }
        else if (a >= 0 && a < 60) {
            System.out.println("Your Grade is: F");
        }else {
            System.out.println("Please enter your value between 1 - 100");
        }
    }

    static int inputValueCheck(Scanner scanner, String text) {
        System.out.println(text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Please enter valid integer value between 1-100");
            System.exit(0);
            return 0;
        }
    }

}
