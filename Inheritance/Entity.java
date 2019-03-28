public class Entity{
    private String name;
    public Entity(String name){
        this.name=name;
    }
    public void changeName(String newname){
        this.name=newname;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return String.format("%s,%s,%s",super.toString(),name,"Entity");
    }
}
