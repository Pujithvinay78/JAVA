import java.util.*;

class printTheGreater{

    public static void Thegreater(int a,int b){
        if(a>b){
            System.out.println("A is greater than B");
        }
        else{
            System.out.println("B is greater than A");
        }
        return;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();

        Thegreater(a,b);
        
    }
}