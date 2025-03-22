

class main{
    public static void main(String[] args) {
        int n=6;
        int m=1;
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                
                int z=i+j;
                if(z%2==0){
                    m=1;
                }
                else{
                    m=0;
                }
                System.out.print(m);
            }
            for(int j=1;j>i;j++){
                System.out.print(" ");
            }
            
           }
            System.out.println();
        }
    }
}