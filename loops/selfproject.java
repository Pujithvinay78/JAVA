class main{
    public static void main(String[] args) {
        int n=6;
        int a=2;
        int b=3;
        int z=1;

        for(int i=1;i<=2;i++){
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            a=a*3;
            b=b/3;
            System.out.println();
        }
        for (int i=4;i>=1;i--){
            for(int j=1;j<=z;j++){
                System.out.print(" ");
            }
 
            for(int j=n;j>=1;j--){
                System.out.print("*");
            }
            for(int j=1;j<=z;j++){
                System.out.print(" ");
            }
            z=z+1;
            n=n-2;
            System .out.println();
        }
    }
}