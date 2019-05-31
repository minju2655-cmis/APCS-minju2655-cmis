import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);    
        myImage.setTransparency(220);    
        setImage(new GreenfootImage("BACK", 30, Color.WHITE,new Color(0,0,0,0)));
    }
    public void act() 
    {

        if(Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Title()); 
        }
    }    
}
