class pokemon{
    String name;
    int hp;

    pokemon(){
        name="Pikachu";
        hp=100;

    }

    pokemon(String n,int y){
        name=n;
        hp=y;

    }
    void printthe(){
        System.out.println(" pokemon with "+name+" is left with "+hp);
    }
}
class matchup{
    public static void main(String[] args) {
        pokemon pokemon1= new pokemon();
        pokemon pokemon2= new pokemon("Raichu",120);
        pokemon1.printthe();
        pokemon2.printthe();
        
    }
    }
