import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends Actor
{
    /**
     * Act - do whatever the TitlePage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TitlePage(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*4;
        int myNewWidth = (int)myImage.getWidth()*4;
        myImage.scale(myNewWidth, myNewHeight);
        getImage().setTransparency(0);
    }
    public void act() 
    {
        move(5);
        if (isTouching(PressStart.class)){
            move(-5);
            getImage().setTransparency(250);
        }
    }    
}
