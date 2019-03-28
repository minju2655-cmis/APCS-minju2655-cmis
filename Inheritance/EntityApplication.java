import java.util.*;
public class EntityApplication{
    public static void main(String[] args){
        Entity el = new Entity("entity l");
        p(el);
        Thing tl = new Thing();
        p(tl);
        Person pl = new Person();
        p(pl);
        Place placel = new Place();
        p(placel);
        Idea il = new Idea();
        p(il);        
    }
    public static void p(Object string){
        System.out.println(string);
    }
}
