import java.util.HashSet;
class TheUniquesub{
    public static void PrinttheSet(String str,int index,String newString,HashSet<String>seet){
        if(index==str.length()){
            if(!seet.contains(newString)){
                System.out.println(newString);
                seet.add(newString);
            }
            return;
        }
        char currChar=str.charAt(index);

        PrinttheSet(str, index+1, newString+currChar, seet);

        PrinttheSet(str, index+1, newString, seet);
    }
    public static void main(String[] args) {
        HashSet <String> seet=new HashSet<>();
        PrinttheSet("aaabc", 0,"", seet);
    }p
}
        