package Oct17Task;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        int totalBalance=10000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter an amount to withdrawal=");
        if(scanner.hasNextInt()){
            int inputAmount= scanner.nextInt();
            if(inputAmount>0) {
                if (inputAmount <= totalBalance)
                {
                    if (inputAmount % 100 == 0) {
                        System.out.println("Please collect your Cash: "+inputAmount +" Rs.");
                        System.out.println("Remaining Balance is  "+(totalBalance-inputAmount) +" Rs.");
                    } else {
                        System.out.println("Please enter the amount multiple of 100");
                    }
            }else{
                    System.out.println("Insufficient balance in your account :-(");
                }
            }else{
                System.out.println("Entered value is not a valid amount");
            }
        }else {
            System.out.println("Enter the amount in integer");
        }
    }
}
