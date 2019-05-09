public class ThingA implements Changeable, Paintable
{
    private int width;
    private String color;
    public void valueWidth(int newwidth){
        this.width=newwidth;
    }
    public int getWidth(){
        return width;
    }

    public String getColour(){
        return color;
    }
    public void paint(String newC){
        this.color=newC;
    }
}
