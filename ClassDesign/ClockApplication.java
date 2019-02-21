public class ClockApplication
{
    public static void main (String arg[]){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        Clock bedroomClock = new Clock(7, 53, 45);
        System.out.println(bedroomClock);
    }
}