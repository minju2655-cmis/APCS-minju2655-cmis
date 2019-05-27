import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    HealthBar healthbar = new HealthBar();

    public Game(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    public void prepare(){
        addObject(healthbar,50,320);
        
    }
}
