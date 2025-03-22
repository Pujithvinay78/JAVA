class rec{
    public static void recur(int n) {


            System.out.println(n);
              if(n==6){
            return;
        }
        recur(n+1);
      
        
    }
    public static void main(String[] args) {
        int n=0;
        recur(n);
        
    }
}