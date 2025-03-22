import java.util.*;
import java.lang.Math;

class hello{
    public static void callthis(int n,int x){
        if(n==0){
            return;
        }
        System.out.println(Math.pow(x,n));
        callthis(n-1, x);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int n=sc.nextInt();
        callthis(n,x);
    }
}