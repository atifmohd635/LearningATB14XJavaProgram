package Oct17Task;

public class SmallestOfAllNumbers {
    public static void main(String[] args) {
        int numbers[]={ 2, 40, 40, 90, 1, 0};
        int n= numbers.length;
        int smallest=numbers[0];
        for (int i = 1; i <n ; i++) {
            if(numbers[i]<smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is: "+smallest);
    }
}
