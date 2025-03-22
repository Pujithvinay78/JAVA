import java.util.*;

class printAverage{

    public static void printTheAverage(int a,int b,int c){
        int average =(a+b+c)/3;
        System.out.println(average);
        return;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        printTheAverage(a,b,c);
    }
}