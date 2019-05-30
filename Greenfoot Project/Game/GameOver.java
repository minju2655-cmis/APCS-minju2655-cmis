import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public ScoreCounter score;
    public GameOver()
    {    
        super(600, 400, 1); 
        GreenfootImage img = new GreenfootImage("GameOv.png");
        img.scale(getWidth(), getHeight());
        setBackground(img); 
        score = new ScoreCounter();
        prepare();
    }
    public void prepare(){
        ReStart restart = new ReStart();
        addObject(restart,520,330);
        addObject(score,100,50);
    }
    public ScoreCounter getScore(){
        return score;
    }
}
