public class Person extends Entity{
    private int age;
    public Person (){
        super("default");
    }
    public Person (String name){
        super(name);
    }
    public void setage(int newage){
        this.age=newage;
    }
    public int getage(){
        return age;
    }
    public String toString(){
        String out = super.toString();
        out += "->Person";
        return out;
    }
}