import java.util.*;

class factor{
    public static int func(int n) {
        if(n==0){
            return 1;
        }
            return n * func(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(func(n));

    }
}