import java.util.*;

class marksPrint{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many students are there: ");
        int n=sc.nextInt();
        int []marks=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter marks: ");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Marks for student "+i +" is: ");
            System.out.println(marks[i]);
        }


    }
}