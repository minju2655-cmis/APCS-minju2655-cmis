public class Idea extends Entity{
    private int popularity;
    public Idea (){
        super("default idea");
    }
    public Idea (String name, int age){
        super(name+age);
    }
    public void setPopularity(int newpopularity){
        this.popularity=newpopularity;
    }
    public int getPopularity(){
        return popularity;
    }
    public String toString(){
        String out = super.toString();
        out += "->Idea";
        return out;
    }
}
