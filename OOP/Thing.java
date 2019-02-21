public class Thing
{
    private int field1 = 10;
    private double field2 = 4.9;
    private boolean field3 = false;
    private String field4 = "hello";
    //CONSTRUCTOR METHODS
    public Thing(){
        //Sets all 4 instance variable
        this.field1 = 11;
        this.field2 = 5.1;
        this.field3 = true;
        this.field4 = "good bye";
    }
    public Thing(int fieldvalue){
        //calls default constructor
        this();
        //then overrides values set in Thing()
        this.field1=fieldvalue;
        this.field2=62.3;
    }
    public Thing (String fieldValue){
        //calls Thing(int)
        this(3);
        this.field4=fieldValue;
    }
    
    //SETTER METHODS
    public void setfield1(int newValue){
         this.field1 = newValue;
    }  
    public void setfield2(double newValue){
         this.field2 = newValue;
    }
    public void setfield3(boolean newValue){
         this.field3 = newValue;
    }
    public void setfield4(String newValue){
         this.field4 = newValue;
    }
    
    //GETTER METHODS
    public int getfield1(){
        return field1;
    }
    public double getfield2(){
        return field2;
    }
    public boolean getfield3(){
        return field3;
    }
    public String getfield4(){
        return field4;
    }
    
    //ToString Method
    public String toString(){
        String out = this.field4+"\n"+this.field3;
        return out;
    }
    
    public int method1(Thing other){
        if(this.field1>other.field1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
