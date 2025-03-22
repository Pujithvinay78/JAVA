import java.util.*;

class calculator{
    public static void calculate(int n,int a,int b){
        int all=0;
    switch(n){
        case 1:
            all=a+b;
            break;
        
        case 2:
            all=a-b;
            break;
        case 3:
            all=a*b;
            break;
        case 4:
            all=a/b;
            break;

    }
    System.out.println(all);
    
        
        
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the which action you want to perform \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division  ");
        int n=sc.nextInt();
        System.out.println("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b= sc.nextInt();

        calculate(n, a, b);
        

     }
}