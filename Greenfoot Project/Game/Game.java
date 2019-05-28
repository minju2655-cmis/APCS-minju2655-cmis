import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    public Game(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    
    private void prepare()
    {
        addObject(counter,80,50);
        addObject(healthbar,520,50);
        Character character = new Character();
        addObject(character,147,184);
    }
}
