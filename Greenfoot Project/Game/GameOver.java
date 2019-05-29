import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class GameOv.
     * 
     */
    public GameOver()
    {    
        super(600, 400, 1); 
        GreenfootImage img = new GreenfootImage("GameOver.png");
        img.scale(getWidth(), getHeight());
        setBackground(img);   
        //addObject(counter,520,50); // carry counter to different world

    }
}
