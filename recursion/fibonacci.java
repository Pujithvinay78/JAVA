import java.util.*;

class fibonacci{
    public static void PrintTheFibo(int n,int a,int b){

        int sum=a+b;
        a=b;
        b=sum;
        System.out.println(sum);
                if(n<sum){
            return;
        }
        PrintTheFibo(n, a, b);
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        PrintTheFibo(n,a,b);


    }
}

// 01 1 2 3 5 8 13
