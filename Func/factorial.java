import java.util.*;

class fact{
    public static void Printfactorial(int a){
        int factor=1;
        for(int i=a;i>=1;i--){
            factor=factor*i;
        }
        System.out.println(factor);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Printfactorial(a);
        
    }
}