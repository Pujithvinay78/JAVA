import java.util.*;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
// 0 1 1 2 3 

        for(int i=1;i<=12;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);

        }
    }
}




















// import java.util.*;

// class fibo{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0;
//         int b=1;

//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=a+b;
//             System.out.println(sum);
//             a=b;
//             b=sum;

//             }

//         }
//     }


// // 0 1 1 2 3 5 8 13 