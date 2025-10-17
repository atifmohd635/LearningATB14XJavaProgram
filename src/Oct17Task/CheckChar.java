package Oct17Task;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        System.out.println("Please enter a char:");
        Scanner scanner =new Scanner(System.in);
        char val=scanner.next().charAt(0);
        if((val>='A' && val<='Z') || (val>='a' && val<='z')){
            System.out.println(val+" is Alphabet...!!!");
        }else System.out.println(val+" is not Alphabet...!!!");
    }
}
