import java.util.*;
// enum level{
//         A,B,C,D;
//  }
// class enumswitch{

//     public static void main(String[] args) {

//         level l=level.C;
//         switch(l){
//             case A:
//                 System.out.println("HI");
//                 break;
//             case B:
//                 System.out.println("Whatever");
//                 break;

//             case C:
//                 System.out.println("Bye");
//                 break;
//         }

//     }
// }

class switched{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your grade");
    char grade=sc.next().charAt(0);

    switch(grade){
        case 'A':
        case 'B':
            System.out.println("Good job");
            break;
        case 'C':
            System.out.println("Work harder");
            break;
        case 'D':
        case 'E':
            System.out.println("Failed ");
            break;
        default:
            System.out.println("Enter grade only ");
            break;
    }

    
}
}