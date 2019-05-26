 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int frame = 1;
    private int speed = 2;
    
    private GreenfootImage left1 = new GreenfootImage("left1.png");
    private GreenfootImage left2 = new GreenfootImage("left2.png");
    private GreenfootImage left3 = new GreenfootImage("left3.png");
    private GreenfootImage left4 = new GreenfootImage("left4.png");
    
    private GreenfootImage right1 = new GreenfootImage("right1.png");
    private GreenfootImage right2 = new GreenfootImage("right2.png");
    private GreenfootImage right3 = new GreenfootImage("right3.png");
    private GreenfootImage right4 = new GreenfootImage("right4.png");
    
    private GreenfootImage front1 = new GreenfootImage("front1.png");
    private GreenfootImage front2 = new GreenfootImage("front2.png");
    private GreenfootImage front3 = new GreenfootImage("front3.png");
    private GreenfootImage front4 = new GreenfootImage("front4.png");
    
    private GreenfootImage back1 = new GreenfootImage("back1.png");
    private GreenfootImage back2 = new GreenfootImage("back2.png");
    private GreenfootImage back3 = new GreenfootImage("back3.png");
    private GreenfootImage back4 = new GreenfootImage("back4.png");
    
    private int animationCounter = 0;
    public Character(){
        setLocation(0,0); 
    }
    public void act(){
        movement();
        animationCounter++;
        if("space".equals(Greenfoot.getKey())){
            fire();
        }
    }
    private void fire(){
        Fire fire = new Fire();
        getWorld().addObject(fire,getX(),getY());
        if (getImage().equals(left1) || getImage().equals(left2) || getImage().equals(left3) || getImage().equals(left4)) {
            fire.setRotation(180);
        }
        else if (getImage().equals(back1) || getImage().equals(back2) || getImage().equals(back3) || getImage().equals(back4)) {
            fire.setRotation(270);
        }
        else if (getImage().equals(front1) || getImage().equals(front2) || getImage().equals(front3) || getImage().equals(front4)) {
            fire.setRotation(90);
        }
        else if (getImage().equals(right1) || getImage().equals(right2) || getImage().equals(right3) || getImage().equals(right4)) {
            fire.setRotation(0);
        }        
        if((Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) && ((Greenfoot.isKeyDown("w")) || Greenfoot.isKeyDown("up"))){
            fire.setRotation(-45);
        }
        else if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) && ((Greenfoot.isKeyDown("a")) || Greenfoot.isKeyDown("left"))){
            fire.setRotation(-135);
        }
        else if((Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) && ((Greenfoot.isKeyDown("d")) || Greenfoot.isKeyDown("right"))){
            fire.setRotation(45);
        }
        else if((Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) && ((Greenfoot.isKeyDown("s")) || Greenfoot.isKeyDown("down"))){
            fire.setRotation(135);
        }
    }
    public void moveLeft(){
        setLocation(getX()-speed,getY());
        if(animationCounter%4==0){
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
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveRight(){
        setLocation(getX()+speed,getY());
        if(animationCounter%4==0){
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
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveUp(){
        setLocation(getX(),getY()-speed);
        if(animationCounter%4==0){
            motionUp();
        }
    }
    public void motionUp(){
        if(frame==1){
            setImage(back1);
        }
        else if (frame==2){
            setImage(back2);
        }
        else if (frame==3){
            setImage(back3);
        }
        else if (frame==4){
            setImage(back4);
            frame = 1;
            return;
        }
        frame++;
    }
    public void moveDown(){
        setLocation(getX(),getY()+speed);
        if(animationCounter%4==0){
            motionDown();
        }
    }
    public void motionDown(){
        if(frame==1){
            setImage(front1);
        }
        else if (frame==2){
            setImage(front2);
        }
        else if (frame==3){
            setImage(front3);
        }
        else if (frame==4){
            setImage(front4);
            frame = 1;
            return;
        }
        frame++;
    }
    public void diagonalUpRight(){
        setLocation(getX(),getY()-0);
        if(animationCounter%4==0){
            motionRight();
        }
    }
    public void diagonalUpLeft(){
        setLocation(getX(),getY()-0);
        if(animationCounter%4==0){
            motionLeft();
        }
    }
    public void diagonalDownRight(){
        setLocation(getX(),getY()+0);
        if(animationCounter%4==0){
            motionRight();
        }
    }
    public void diagonalDownLeft(){
        setLocation(getX(),getY()+0);
        if(animationCounter%4==0){
            motionLeft();
        }
    }
    public void movement(){
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            moveRight();
        }
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            moveLeft();
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            moveUp();
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            moveDown();
        }
        if((Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) && ((Greenfoot.isKeyDown("w")) || Greenfoot.isKeyDown("up"))){
            diagonalUpRight();
        }
        if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) && ((Greenfoot.isKeyDown("a")) || Greenfoot.isKeyDown("left"))){
            diagonalUpLeft();
        }
        if((Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) && ((Greenfoot.isKeyDown("d")) || Greenfoot.isKeyDown("right"))){
            diagonalDownRight();
        }
        if((Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) && ((Greenfoot.isKeyDown("s")) || Greenfoot.isKeyDown("down"))){
            diagonalDownLeft();
        }
    }
    
}