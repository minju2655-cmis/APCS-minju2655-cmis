public class Entity{
    private String name;
    private int age;
    private int value;
    public Entity(String name){
        this.name=name;
    }
    public Entity(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String newname){
        this.name=newname;
    }
    public void setAge(int newage){
        this.age=newage;
    }
    public void setValue(int newvalue){
        this.value=newvalue;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getValue(){
        return value;
    }
    
    public String toString(){
        return String.format("%s,%s,%s",super.toString(),name,"Entity");
    }
}
