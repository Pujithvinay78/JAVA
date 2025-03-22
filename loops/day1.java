import java.util.*;

class day1{
 
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a+b);
      
      if(a>b){
        System.out.println("A is greater than B");

      }
      else{
        System.out.println("B is greater than A");
      }
  }
}