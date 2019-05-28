import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy_Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy_Title extends Actor
{
    /**
     * Act - do whatever the Enemy_Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy_Title() 
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*4;
        int myNewWidth = (int)myImage.getWidth()*4;
        myImage.scale(myNewWidth, myNewHeight);
    }    
    public void act() 
    {
        move(-3);
        if (isTouching(PressStart.class)){
            move(3);
        }
    }    
}
