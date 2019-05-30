import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Details
{
    /**
     * Act - do whatever the Enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enter() 
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);    
    }    
    public void act(){
  
    }
    
}
