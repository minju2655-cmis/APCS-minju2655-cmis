import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PPL1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PPL1 extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public void Jumper(){
        velocity = 0;
    }
    public void act() 
    {
        fall();
        if (Greenfoot.isKeyDown("space")){
            jump();
        }
    }    
    public void fall(){
        setLocation(getX(),getY()+velocity);
        if (getY()>getWorld().getHeight()-50){
            velocity=0;
        }
        else{
            velocity+=GRAVITY;
        }
        
    }
    public void jump(){
        velocity=-20;
    }
    public void move(){
        int y=getY();
        int x=getX();
        if (Greenfoot.isKeyDown("left")){
            x--;
        }
        if (Greenfoot.isKeyDown("right")){
            x++;
        }
        setLocation(x,y);
    }
}
