import java.util.*;

class kaayi{

    public static void MathPower(int x, int y) {
        System.out.println(Math.pow(x, y));        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println("Enter the power for the number: ");
        int y=sc.nextInt();

        MathPower(x, y);

    }
}