import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Text
{
    GreenfootImage img;
    int health = 8;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int) healthBarWidth/health;
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar(){
        update();
    }
    public void act() 
    {
        update(); 
    }    
    public void update(){
        setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
        GreenfootImage myimg = getImage();
        myimg.setColor(Color.WHITE);
        myimg.drawRect(0,0,healthBarWidth+1, healthBarHeight+1);
        myimg.setColor(Color.RED);
        myimg.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
        
    }
    public void loseHealth(){
        health--;
        
    }
}
