public class Size extends Place{
    private int width;
    public Size(){
        super("default size",34);
    }
    public void setwidth(int newwidth){
        this.width=newwidth;
    }
    public int getwidth(){
        return width;
    }
    public String toString(){
        String out = super.toString();
        out += "-->Size";
        return out;
    }
}
