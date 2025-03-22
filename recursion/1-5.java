import java.util.*;
class Printn{
    public static void PrintNum(int n,int i, int sum)
    {   if(i==n+1){
        System.err.println(sum);
        return;
        }
        sum+=i;
        PrintNum(n, i+1, sum);
        System.out.println(i);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0; 
        int i=1;
        PrintNum(n, i, sum);
    }
}