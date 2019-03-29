public class Place extends Entity{
    private int population;
    public Place (){
        super("default place");
    }
    public Place (String name, int age){
        super(name+age);
    }
    public void setPopulation(int newpopulation){
        this.population=newpopulation;
    }
    public int getPopulation(){
        return population;
    }
    public String toString(){
        String out = super.toString();
        out += "->Place";
        return out;
    }
}
