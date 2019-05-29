import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressStart extends Actor
{
    public PressStart(){
         GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight()/3;
         int myNewWidth = (int)myImage.getWidth()/3;
         myImage.scale(myNewWidth, myNewHeight);
         myImage.setTransparency(170);
    }
    /**
     * Act - do whatever the PressStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }   
    private void click(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Game());
        }
    }
}
