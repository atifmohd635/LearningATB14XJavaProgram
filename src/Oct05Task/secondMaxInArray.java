package Oct05Task;

public class secondMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max1=0;
        int max2=0;
        for(int i=0; i<numbers.length;i++){
            if(max1<numbers[i]){
                max1=numbers[i];
            }
        }
        System.out.println("maximum number is:"+max1);
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]!=max1){
                if(max2<numbers[i]){
                    max2=numbers[i];
                }
            }
        }
        System.out.println("Second maximum number is:"+max2);
    }
}
