import java.util.*;

class printTheRadius{
    public static void Radius(double r) {
        double c = 6.28 * r;
        System.out.println(c);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The radius of the circke to get the circumference: ");
        double r=sc.nextDouble();
        Radius(r);
    }
}