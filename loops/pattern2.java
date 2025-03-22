import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Rows: ");
        int r=sc.nextInt();
        System.out.println("Enter no of columns");
        int c=sc.nextInt();


        for(int i =1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==4&&j==3){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}