import java.util.*;

class func{
    public static void printMyName(String name) {
        System.out.println("Your name is " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name=sc.next();

        printMyName(name);  
           }
}