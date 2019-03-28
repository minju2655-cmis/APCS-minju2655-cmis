public class Thing extends Entity{
    //private ;
    public Thing (){
        super("default");
    }
    public Thing (String name){
        super(name);
    }
    public String toString(){
        String out = super.toString();
        out += "->Thing";
        return out;
    }
}
