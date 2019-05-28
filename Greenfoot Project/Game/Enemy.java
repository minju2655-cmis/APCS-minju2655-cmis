import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends GamePlay
{
    public Enemy(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act(){
        move(1);
        if (getWorld().getObjects(Character.class).isEmpty()){
            return;
        } // skips following if the tank is not in world
        Actor character = (Actor)getWorld().getObjects(Character.class).get(0); // gets reference to tank
        turnTowards(character.getX(), character.getY()); // turn toward tank
        hitByFire();
    }    
    public void hitByFire(){
        Actor fire= getOneIntersectingObject(Fire.class);
        if (fire != null){
            World myWorld = getWorld();
            myWorld.removeObject(fire);
            Game game = (Game)getWorld();
            Counter counter = game.getCounter();
            counter.addScore();
            getWorld().removeObject(this);            
        }
    }
    
}
