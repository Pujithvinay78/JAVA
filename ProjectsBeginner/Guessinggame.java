import java.util.*;

class GuessingGame{
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. if you think you have a brain and luck");
        int g = sc.nextInt();

        Random rn=new Random();
       int randomIntInRange = rn.nextInt(101);
        if(g==randomIntInRange){
            System.out.println("Correct!!! \nYou have 1 in 100 chance and you got it correct");
        } 
        else{
            System.out.println("Cry me a river \nThe no. was "+randomIntInRange);
        }

    }
}
