class stairs{
    public static void min(int n,int index,int x) {
        if(x==2){
            if(n%2==0){
                if(n==0){
                    System.out.println(index +" two steps");
                    return;
                } 
                index =index+1;
                min(n-2, index, x);  
            }
            else{
                if(n==1){
                    System.out.println("one extra step "+index + " two steps");
                    return;
                }
                index=index+1;
                min(n-2, index, x);
            }
        }
        else{
            if(n==0){
                System.out.println(index+" Steps");
                return;
            }
            index=index+1;
            min(n-1, index, x);
        }        
    }
    public static void main(String[] args) {
        int n=10;
        min(n, 0, 2);
    }
}