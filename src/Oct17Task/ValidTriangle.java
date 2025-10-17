package Oct17Task;

public class ValidTriangle {
    public static void main(String[] args) {
        int side1= 3;
        int side2= 4;
        int side3= 5;
        if(((side1 + side2)> side3) && ((side1+side3)>side2) && ((side3+side2)>side1)){
            System.out.println("It is a valid Triangle");

        }
        else{
            System.out.println("Not valid");
        }
    }
}
