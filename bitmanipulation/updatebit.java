import java.util.*;

class updatebit{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int pos =sc.nextInt();
        System.out.println("Press 0 for 0 ||  1 for 1: ");
        int input=sc.nextInt();
        if(input==0){
            int bitmask=1<<pos;
            int notbitmask=~(bitmask);
            int finale=notbitmask&n;
            System.out.println(finale);        
            }
        else{
            int bitmask=1<<pos;
            int finale =bitmask |n;
            System.out.println(finale);
        }
    }
}