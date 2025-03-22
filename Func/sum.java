import java.util.*;

class sum{
    
    public static int summing(int x,int y ){
        System.out.println(x*y);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y =sc.nextInt();

        summing(x, y);
        
    }
}