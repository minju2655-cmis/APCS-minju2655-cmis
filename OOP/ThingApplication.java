public class ThingApplication
{
    public static void main(String args[]){
        Thing thing1 = new Thing();
        Thing thing2 = new Thing(50);
        System.out.println(thing1);
        System.out.println(thing1.method1(thing2));
        System.out.println(thing2.method1(thing1));
        //System.out.println(thing1);
        //System.out.println(thing2);
        //System.out.println(thing1.getfield1());
        //System.out.println(thing2.getfield1());
        //System.out.println(thing1.getfield2());
        //System.out.println(thing2.getfield2());
        //System.out.println(thing1.getfield3());
        //System.out.println(thing2.getfield3());
        //System.out.println(thing1.getfield4());
        //System.out.println(thing2.getfield4());
    }
}
