import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{
    ScoreCounter score = new ScoreCounter();
        /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage img = new GreenfootImage("Win.jpg");
        prepare();
    }
    public void prepare(){
        ReturnToTitlePage ret = new ReturnToTitlePage();
        addObject(ret,300,320);
        addObject(score,300,260);
        CloseToWin ctw = new CloseToWin();
        addObject(ctw,300,110);
    }
    public ScoreCounter getCounter(){
        return score;
    }
}
