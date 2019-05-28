import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy_Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy_Title extends TitlePage
{
    private GreenfootImage m1 = new GreenfootImage("m1.png");
    private GreenfootImage m2 = new GreenfootImage("m2.png");
    private GreenfootImage m3 = new GreenfootImage("m3.png");
    private GreenfootImage m4 = new GreenfootImage("m4.png");
    private GreenfootImage m5 = new GreenfootImage("m5.png");
    private int frame = 1;
    private int animationCounter = 0;
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()*2;
    int myNewWidth = (int)myImage.getWidth()*2;
    /**
     * Act - do whatever the Enemy_Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy_Title() 
    {
        myImage.scale(myNewWidth, myNewHeight);
        myImage.setTransparency(230);
    }    
    public void act() 
    {
        move(-4);
        if (isTouching(PressStart.class)){
            move(4);
        }
        hitByFire();
        if(animationCounter%5==0){
            animate();
        }
        animationCounter++;
    }    
    public void hitByFire(){
        Actor fire = getOneIntersectingObject(Fire.class);
        if (fire != null){
            getWorld().removeObject(fire);
            getWorld().removeObject(this);       
        }
    }
    public void animate(){
        if(frame==1){
            m1.scale(myNewWidth, myNewHeight);
            setImage(m1);
        }
        else if (frame==2){
            m2.scale(myNewWidth, myNewHeight);
            setImage(m2);
        }
        else if (frame==3){
            m3.scale(myNewWidth, myNewHeight);
            setImage(m3);
        }
        else if (frame==4){
            m4.scale(myNewWidth, myNewHeight);
            setImage(m4);
        }
        else if (frame==5){
            m5.scale(myNewWidth, myNewHeight);
            frame = 1;
            return;
        }
        frame++;
    }
}
