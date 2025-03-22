class permutations{

    public static void printStr(String str,String newString){
    if(str.length()==0){
        System.out.println(newString);
        return;
    }


    for(int i=0;i<str.length();i++){
        char currChar=str.charAt(i);
        String changingstr=str.substring(0,i)+str.substring(i+1);
        printStr(changingstr, newString+currChar);
    }
    }
    public static void main(String[] args) {
        printStr("abc", "" );
        
    }
}