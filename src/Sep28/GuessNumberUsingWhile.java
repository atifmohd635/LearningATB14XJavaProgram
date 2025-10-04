package Sep28;



import java.util.Random;
import java.util.Scanner;

public class GuessNumberUsingWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        int attempt=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number: ");
        //int num=scanner.nextInt();
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("Please enter valid integer");
                scanner.next();
                continue;
            }
            int num=scanner.nextInt();
            attempt++;
            if(num<1  || num>100 )
            {
                System.out.println("Please enter number in range of 1 to 100");
                continue;
            }
            if(num<numberToGuess){
                System.out.println("Your number is low");
                continue;
            }
            if(num>numberToGuess){
                System.out.println("Your number is high");
                continue;
            }
            else if(num==numberToGuess) {
                System.out.println("Correct guess and total attempt is:"+attempt);
                break;
            }


        }
    }
}
