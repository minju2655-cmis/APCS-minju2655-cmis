public class Thing extends Entity{
    private int value;
    public Thing (){
        super("default thing");
    }
    public Thing (String name, int age){
        super(name+ age);
    }
    public void setValue(int newvalue){
        this.value=newvalue;
    }
    public int getValue(){
        return value;
    }
    public String toString(){
        String out = super.toString();
        out += "->Thing";
        return out;
    }
}
