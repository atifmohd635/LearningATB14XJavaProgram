package Oct05Task;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string you want to reverse:");
        String stringBuilder= scanner.next();
        int len=stringBuilder.length();
        String revers="";
        while(len>0){
            revers=revers+stringBuilder.charAt(len-1);
            len--;
        }
        System.out.println("reverse is :"+revers);
    }
}
