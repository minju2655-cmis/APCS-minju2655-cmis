public class Person extends Entity{
    public Person (){
        super("default person");
    }
    public Person (String name,int age){
        super(name+age);
    }
    public void setAge(int newage){
        if (newage<=150){
            super.setAge(newage);
        }
    }
    public String toString(){
        String out = super.toString();
        out += "->Person";
        return out;
    }
}