
class numbertree{
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=4;i++){
            for(int j=1;j<=15;j++){
                System.out.print(j+" ");
                j=+1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}