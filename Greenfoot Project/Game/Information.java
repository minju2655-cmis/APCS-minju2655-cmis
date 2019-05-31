import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Information here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Information extends World
{

    /**
     * Constructor for objects of class Information.
     * 
     */
    public Information()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage img = new GreenfootImage("Information2.jpg");
        img.scale(getWidth(), getHeight());
        setBackground(img); 
    }
    public void act(){
        prepare();
    }
    public void prepare(){
        Enter enter = new Enter();
        addObject(enter,100,160);
        Keys keys = new Keys();
        addObject(keys,100,80);
        Aim aim = new Aim();
        addObject(aim, 430, 340);
        Key key = new Key();
        addObject(key,340,80);
        Shoot shoot = new Shoot();
        addObject(shoot,260,160);
        Back back = new Back();
        addObject(back,100,340);
    }
}
