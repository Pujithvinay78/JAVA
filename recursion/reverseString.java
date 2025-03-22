class reverseString{
    public static void PrinttheString(String x,int index){
        if(index==0){
            System.out.println(x.charAt(index));
            return;
        }
        System.out.println(x.charAt(index));
        PrinttheString(x, index-1);
    }
    public static void main(String[] args) {
        String x="D C B A";
        PrinttheString(x, x.length()-1);
    }
}