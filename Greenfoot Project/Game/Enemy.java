import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
       */
    public Enemy(){

    }
    public void act(){
        move(1);
        follow();
        getKilled();
    }    
    public void follow(){
        if (getWorld().getObjects(Character.class).isEmpty()){
            return;
        } // skips following if the tank is not in world
        Actor character = (Actor)getWorld().getObjects(Character.class).get(0); // gets reference to tank
        turnTowards(character.getX(), character.getY()); // turn toward tank
    }
    public void getKilled(){
        Actor fire= getOneIntersectingObject(Fire.class);
        if (fire != null){
            World myWorld = getWorld();
            myWorld.removeObject(fire);
            Game game = (Game)getWorld();
            ScoreCounter counter = game.getCounter();
            counter.addScore();
            getWorld().removeObject(this);     
        }
    }
}
