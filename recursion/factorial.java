import java.util.*;

class PrintFactorial{
    public static int Fact_main(int n){
        if(n==1 || n==0){
            return 1;
        }
        int Fact_mainm1=Fact_main(n-1);
        int Fact_sol=n*Fact_mainm1;
        return Fact_sol;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=Fact_main(n);
        System.out.println(a);        
    }
}