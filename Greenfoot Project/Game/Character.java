import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int frame = 1;
    private int speed = 1;
    private int velocity;
   
    public Character(){
         GreenfootImage myImage = getImage();
         int myNewHeight = (int)myImage.getHeight()/2;
         int myNewWidth = (int)myImage.getWidth()/2;
         myImage.scale(myNewWidth, myNewHeight);
         velocity = 0;
    }
    //public void act(){
    //}    
    public void moveLeft(){
        setLocation(getX()-speed,getY());
        motionLeft();
    }
    public void motionLeft(){
        if(frame==1){
            //setImage(left1);
        }
        else if (frame==2){
            //setImage(left2);
        }
        else if (frame==3){
            //setImage(left3);            
        }
        else if (frame==4){
            //setImage(left4);
        }
        else if (frame==5){
            //setImage(left5);            
        }
        else if (frame==6){
            //setImage(left6);            
        }
        else if (frame==7){
            //setImage(left7);            
        }
        else if (frame==8){
            //setImage(left8);            
        }
        else if (frame==9){
            //setImage(left9);
            frame = 1;
            return;
        }
        
        frame++;
    }
    public void moveRight(){
    
    }
    public void motionRight(){
    
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
            //moveLeft();
        }
        else if (Greenfoot.isKeyDown("a")){
            //moveRight();
        }
        else if (Greenfoot.isKeyDown("w")){
            //moveUp();
        }
        else if (Greenfoot.isKeyDown("s")){
            //moveDown();
        }
    }
    
}
