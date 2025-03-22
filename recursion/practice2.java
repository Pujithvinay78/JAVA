class practice2{

    public static int practice(int n) {
        if (n==0){
            return 0;
        }
        int sum= n+practice(n-1);
        return sum;


    }
    
    public static void main(String[] args) {
     int n=10;
     int rec=practice(n);
     System.out.println(rec);
        
    }
}