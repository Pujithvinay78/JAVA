class fibon{
    public static int func(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
    }
    else{
        return func(n-1)+func(n-2);
    }
        
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(func(n));
        
    }
}