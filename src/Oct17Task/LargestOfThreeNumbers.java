package Oct17Task;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int numbers [] ={800, 3, 51, 20, 71,700};
        int largest=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("largest number is:"+largest);
    }
}
