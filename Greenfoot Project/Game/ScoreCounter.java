import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Text
{
    private int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score: "+ score, 30, Color.WHITE,new Color(0,0,0,0)));
    }    
    public int getScore(){
        return score;
    }
    public void setScore(int newScore){
        this.score = newScore;
    }
    public void addScore(){
        score++;
    }
}
