package Oct17Task;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check Prime:");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNext()){
            int n=scanner.nextInt();
            int set=0;
            for (int i = 2; i < n-1; i++) {
                if(n%i==0){
                 set=1;
                }
            }
            if(set==1){
                System.out.println(n+" is not Prime");
            }
            else {
                System.out.println(n+" is  Prime");
            }

        }else {
            System.out.println("Please enter valid integer.");
        }
    }
}
