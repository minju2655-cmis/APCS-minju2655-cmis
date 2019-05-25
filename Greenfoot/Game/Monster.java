import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    private int frame = 1;
    private int speed = 1;
    private GreenfootImage left1 = new GreenfootImage("left1.png");
    private GreenfootImage left2 = new GreenfootImage("left2.png");
    private GreenfootImage left3 = new GreenfootImage("left3.png");
    private GreenfootImage left4 = new GreenfootImage("left4.png");
    private GreenfootImage left5 = new GreenfootImage("left5.png");
    private GreenfootImage left6 = new GreenfootImage("left6.png");
    private GreenfootImage left7 = new GreenfootImage("left7.png");
    private GreenfootImage left8 = new GreenfootImage("left8.png");
    private GreenfootImage left9 = new GreenfootImage("left9.png");
    
    private GreenfootImage right1 = new GreenfootImage("right1.png");
    private GreenfootImage right2 = new GreenfootImage("right2.png");
    private GreenfootImage right3 = new GreenfootImage("right3.png");
    private GreenfootImage right4 = new GreenfootImage("right4.png");
    private GreenfootImage right5 = new GreenfootImage("right5.png");
    private GreenfootImage right6 = new GreenfootImage("right6.png");
    private GreenfootImage right7 = new GreenfootImage("right7.png");
    private GreenfootImage right8 = new GreenfootImage("right8.png");
    private GreenfootImage right9 = new GreenfootImage("right9.png");
    private int animationCounter = 0;
    public void act(){
        movement();
        animationCounter++;
    }
    public void moveLeft(){
        setLocation(getX()-speed,getY());
        if(animationCounter%9==0){
            motionLeft();
        }
    }
    public void motionLeft(){
        if(frame==1){
            setImage(left1);
        }
        else if (frame==2){
            setImage(left2);
        }
        else if (frame==3){
            setImage(left3);            
        }
        else if (frame==4){
            setImage(left4);
        }
        else if (frame==5){
            setImage(left5);            
        }
        else if (frame==6){
            setImage(left6);            
        }
        else if (frame==7){
            setImage(left7);            
        }
        else if (frame==8){
            //setImage(left8);            
        }
        else if (frame==9){
            setImage(left9)g;
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveRight(){
        setLocation(getX()+speed,getY());
        if(animationCounter%9==0){
            motionRight();
        }
    }
    public void motionRight(){
        if(frame==1){
            setImage(right1);
        }
        else if (frame==2){
            setImage(right2);
        }
        else if (frame==3){
            setImage(right3);
        }
        else if (frame==4){
            setImage(right4);
        }
        else if (frame==5){
            setImage(right5);
        }
        else if (frame==6){
            setImage(right6);
        }
        else if (frame==7){
            setImage(right7);
        }
        else if (frame==8){
            setImage(right8);
        }
        else if (frame==9){
            setImage(right9);
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveUp(){
    
    }
    public void motionUp(){
    
    }
    public void moveDown(){
    
    }
    public void motionDown(){
    
    }
    public void movement(){
        if(Greenfoot.isKeyDown("d")){
            moveRight();
        }
        else if (Greenfoot.isKeyDown("a")){
            moveLeft();
        }
        else if (Greenfoot.isKeyDown("w")){
            //moveUp();
        }
        else if (Greenfoot.isKeyDown("s")){
            //moveDown();
        }
    }
    
}