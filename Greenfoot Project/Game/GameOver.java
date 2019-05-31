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
        prepare();
    }
    public ScoreCounter getScore(){
        return score;
    }
    public void prepare(){
        score = new ScoreCounter();
        addObject(score,300,50);
        CloseToWin ctw = new CloseToWin();
        addObject(ctw,300,90);
        ReStart restart = new ReStart();
        addObject(restart,95,370);
        ReturnToTitlePage ret = new ReturnToTitlePage();
        addObject(ret,170,320);
    }
}
