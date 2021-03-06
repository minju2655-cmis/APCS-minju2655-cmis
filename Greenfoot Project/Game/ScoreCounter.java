import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    public static int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+ score, 32, Color.WHITE,new Color(0,0,0,0)));
        if (ScoreCounter.getScore()>=70){
            Greenfoot.setWorld(new Win()); 
        }
    }    
    public static int getScore(){
        return score;
    }
    public static void setScore(int newScore){
        score = newScore;
    }
    public void addScore(){
        score++;
    }
}