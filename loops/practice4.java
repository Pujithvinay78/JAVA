
class main{
    public static void main(String[] args) {
        int m=10;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int j=i;j<=m;j++){
                System.out.print(j+" ");
                
            }
            for (int j=m-1;j<=i;j-- ){
                System.out.print(" ");
            }
            System.out.println();
        }
         for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            for(int j=i;j<=m;j++){
                System.out.print(j+" ");
                
            }
            for (int j=m-1;j<=i;j-- ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}