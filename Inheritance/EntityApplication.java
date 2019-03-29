import java.util.*;
public class EntityApplication{
    public static void main(String[] args){
        Entity el = new Entity("entity l");
        p(el);

        Person pr1 = new Person("pr1",34);
        pr1.setAge(13);
        p(pr1.getAge());
        p(pr1);

        Thing t1 = new Thing("t1",1);
        t1.setValue(30);
        p(t1.getValue());
        p(t1);

        Place pl1 = new Place("pl1",123);
        pl1.setPopulation(30000);
        p(pl1.getPopulation());
        p(pl1);

        Idea i1 = new Idea("Confusion",2);
        i1.setPopularity(168);
        p(i1.getPopularity());
        p(i1);        

        p("\n");
        
        List<Entity> entities= new ArrayList<Entity>();
        Person person = new Person("MinJu",17);
        Thing thing = new Thing("Eraser",1);
        Place place= new Place("Chiang Mai",500);
        Idea idea= new Idea("Sloth",2);

        entities.add(person);
        entities.add(thing);
        entities.add(place);
        entities.add(idea);
        
        for (Entity e: entities){
            p(e.getName());
            p(e.getAge());
            if (e instanceof Idea){
                Idea i= (Idea) e;
                p(idea.getPopularity());
            }
        }
    }
    public static void p(Object string){
        System.out.println(string);
    }
}
