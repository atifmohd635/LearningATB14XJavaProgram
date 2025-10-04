package Sep28;

public class forLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println("Before if: "+i);
            if (i==5){
                break;
            }
            System.out.println("After if: "+i);
        }
    }
}
