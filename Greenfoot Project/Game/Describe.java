import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Describe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Describe extends Text
{
    /**
     * Act - do whatever the Describe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Click Orange Icon For Description", 15, Color.WHITE,new Color(0,0,0,0)));
        getImage().setTransparency(200);
    }    
}
