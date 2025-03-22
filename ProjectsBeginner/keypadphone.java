class keypadphone{
    public static String[] keypad={". ","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void Printnewstr(String str,int index,String newStr ) {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }


        char currChar=str.charAt(index);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            Printnewstr(str, index+1, newStr+mapping.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String str="23";
        Printnewstr(str,0,"");
        
    }
}