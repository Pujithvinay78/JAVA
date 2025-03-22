import java.util.*;

public class xxpower{
     static int power(int x,int n){
        if(n==0) return 1;

        int half=power(x, n/2);

        if(n%2==0) {
            return half*half;
        }
        else {
            return x*half*half;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x, n));
    }
}