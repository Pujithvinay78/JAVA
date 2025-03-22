class Subsetsofthestring{
    public static void PrinttheSet(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
    }
    char currChar=str.charAt(index);
    PrinttheSet(str, index+1, newString+currChar);

    PrinttheSet(str, index+1, newString);
    }
    public static void main(String[] args) {
        PrinttheSet("abc", 0, "");
    }

}