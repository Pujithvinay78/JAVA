import java.util.*;
class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("A is greater than B");
        }
        else if (b>a) {
            System.out.println("B is greater than A");
            
        }
        else{
            System.out.println("Both are equal");
        }


    }
}