package Oct17Task;

import java.util.Scanner;

public class GradesCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your grade between 0 to 100:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int num= scanner.nextInt();
            if(num>=90 && num<=100){
                    System.out.println("Your Grade is: A+");
                }
            else if(num>=80 && num<=89){
                System.out.println("Your Grade is: A");
            }
            else if(num>=70 && num<=79){
                System.out.println("Your Grade is: B");
            }else if(num>=60 && num<=69){
                System.out.println("Your Grade is: C");
            }
            else if(num>=50 && num<=59){
                System.out.println("Your Grade is: D");
            }else if(num>=40 && num<=49){
                System.out.println("Your Grade is: E");
            }
            else if(num>=0 && num<=39){
                System.out.println("You are Fail");
            }
            else {
                System.out.println("Please enter number between 0 to 100");
            }
        }else {
            System.out.println("Please enter the integer number between 0 to 100");
        }
    }
}
