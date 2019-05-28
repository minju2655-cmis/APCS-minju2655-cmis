import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character_Title extends TitlePage
{
    private boolean touch = true;
    private GreenfootImage right1 = new GreenfootImage("right1.png");
    private GreenfootImage right2 = new GreenfootImage("right2.png");
    private GreenfootImage right3 = new GreenfootImage("right3.png");
    private GreenfootImage right4 = new GreenfootImage("right4.png");
    private int frame = 1;
    private int animationCounter = 0;
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight()*2;
    int myNewWidth = (int)myImage.getWidth()*2;
    /**
     * Act - do whatever the TitlePage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Character_Title(){
        myImage.scale(myNewWidth, myNewHeight);
        myImage.setTransparency(230);
    }
    public void act() 
    {
        move(4);
        fire();
        if(animationCounter%4==0){
            animate();
        }
        if (isTouching(Barrier.class)){
                setImage(right1);
            }
        animationCounter++;    
    }    
    private void fire(){
        Fire fire = new Fire();
        if (isTouching(Barrier.class)){
            if (touch){
                getWorld().addObject(fire,getX(),getY());
                touch = false;
            }
            move(-4);
        }
    }
    public void animate(){
        if(frame==1){
            right1.scale(myNewWidth, myNewHeight);
            setImage(right1);
        }
        else if (frame==2){
            right2.scale(myNewWidth, myNewHeight);
            setImage(right2);
        }
        else if (frame==3){
            right3.scale(myNewWidth, myNewHeight);
            setImage(right3);
        }
        else if (frame==4){
            right4.scale(myNewWidth, myNewHeight);
            setImage(right4);
        }
        else if (frame==5){
            setImage(right1);
        }
        else if (frame==6){
            setImage(right2);
        }
        else if (frame==7){
            setImage(right3);
        }
        else if (frame==8){
            setImage(right4);
        }
        else if (frame==9){
            setImage(right1);
            return;
        }
        frame++;
    }
}
