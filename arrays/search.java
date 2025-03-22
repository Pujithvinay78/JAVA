import java.util.*;

class PrintTheInderx{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int siz=sc.nextInt();
        int array[]=new int[siz];
        for(int i=0;i<siz;i++){
            System.out.println("Enter array for "+i);
            array[i]=sc.nextInt();

        }
        System.out.println("Enter the number you want to find: ");

        int index=sc.nextInt();
        for(int i =0;i<array.length;i++){
            if(i==index){
                System.out.println("Found the "+index+" at "+i);
            }
            else{
                System.out.println("Finding...");
            }
        }
    }
}
