class Stringuilder{
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Pujith vinay");

        System.out.println(str);
        str.insert(0,"J");
        System.out.println(str);
        str.delete(0,1);
        System.out.println(str);
        System.out.println(str.charAt(1));
        str.setCharAt(0,'b' );
        System.out.println(str);

        for(int i=0;i<str.length()/2;i++){
            int front =i;
            int back =str.length()-1-i;

            char frontChar=str.charAt(front);
            char backChar=str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
            
        }
        System.out.println(str); 
    }
}