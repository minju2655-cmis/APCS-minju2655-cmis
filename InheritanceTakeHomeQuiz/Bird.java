import java.util.*;
public class Bird extends Animal{
    private String color;
    public Bird (int x, int y, String color){
        super(x,y);
        this.color=color;
        super.setGraphic ("   \\"+"\n"+"   (o>"+"\n"+"\\\\_//)"+"\n"+"\\_/_)"+"\n"+"  _|_"+"\n");
    }
    public String getColor(){
        return color;
    }
    public boolean eat (String food){
        if (food=="worms" || food=="seeds"){
            return true;
        }
        else{
            return false;
        }
    }
    public void fly(int x, int y){
        List<Integer> location=getLocation();
        location.set(0,x);
        location.set(1,y);
    }
    public String toString(){
        String out="Bird"+"\n";
        out+=super.getGraphic();
        out+="x: "+getLocation().get(0)+"\n"+ "y: "+getLocation().get(1)+"\n";
        out+=super.toString();
        return out;
    }
}
