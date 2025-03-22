class fiboo{
    public static void recurs(int a,int b,int n) {
        if(n==0){
            return;
        }/
        int c=a+b;
        System.out.println(c);
        recurs(b, c, n-1);
        
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        recurs(a, b, n);
    }
}
// 0 1 1 2 3 5 8 13 21 