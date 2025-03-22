class diamond{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=i;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*(i-1);j++){
                System.out.print(" *");
             }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=i;j<=3;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*(i-1);j++){
                System.out.print(" *");
             }
        
            System.out.println();
        }
        
    }
}