package Oct17Task;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        if (scanner.hasNextInt()) {
            int year=scanner.nextInt();
            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println("Year "+year+ " is a leap year");
            }
            else {
                System.out.println("Year "+year+" is not a leap year");
            }
        } else {
            System.out.println("Please enter valid year in integer");
            System.exit(0);
        }


    }
}
