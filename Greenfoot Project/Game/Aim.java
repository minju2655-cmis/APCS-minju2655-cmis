import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aim extends Text
{
    /**
     * Act - do whatever the Aim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("To Win: Score 70", 30, Color.WHITE,new Color(0,0,0,0)));
    }    
}
