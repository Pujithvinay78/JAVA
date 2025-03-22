import java.util.*;

class min{
    public static int checkreversed(int n,int reversed){
        if(n==0) return reversed;
        return checkreversed(n/10,reversed*10+(n%10));
    }

    public static boolean ispalindrome(int n){
        return n==checkreversed(n, 0);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ispalindrome(n));

    }
}