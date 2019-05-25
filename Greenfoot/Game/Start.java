import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start(String text){
        GreenfootImage img = new GreenfootImage (100, 180);
        img.setColor(Color.DARK_GRAY);
        img.drawString(text,60,140);
        img.setFont(new Font("Comic Sans MS",true,false, 150));

        setImage (img);
        
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*4;
        int myNewWidth = (int)myImage.getWidth()*4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
        click();
    }    
    private void click(){
        if(Greenfoot.mouseClicked(this)){
            //Greenfoot.setWorld(new MyWorld());
        }
    }    
}
