import java.util.*;

class bitmanipu{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n: ");
    int n=s.nextInt();
    System.out.println("Enter postion: ");
    int pos=s.nextInt();
    System.out.println("1 for left shift \n 2 for right shift");
    int bitmask=s.nextInt();
    if(bitmask==1){
        int bitmark=n<<pos;
        if((bitmark &pos)==0){
            System.out.println("The bit is zero");
        }
        else{
            System.out.println("The bit is one");
        }
    }
    else{
        int bitmark=n>>pos;
            if((bitmark &pos)==0){
                System.out.println("The bit is zero");
        }
        else{
            System.out.println("The bit is one");
        }
    }
    int bitmark=n<<pos;
    System.out.println(bitmark);
}
}