import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutToWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloseToWin extends Actor
{
    ScoreCounter score = new ScoreCounter();
    public ScoreCounter getCounter(){
        return score;
    }
    /**
     * Act - do whatever the AboutToWin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act(){
        if(ScoreCounter.getScore()>=60 && ScoreCounter.getScore()<70){
            setImage(new GreenfootImage("So Close To Win!", 32, Color.WHITE,new Color(0,0,0,0)));
            getImage().setTransparency(240);
        }
        else if (ScoreCounter.getScore()>=40 && ScoreCounter.getScore()<60){
            setImage(new GreenfootImage("You Are Better Than What I Expected", 32, Color.WHITE,new Color(0,0,0,0)));
            getImage().setTransparency(240);
        }
        else if (ScoreCounter.getScore()>=0 && ScoreCounter.getScore()<40){
            setImage(new GreenfootImage("Fail..Try Harder", 32, Color.WHITE,new Color(0,0,0,0)));
            getImage().setTransparency(240);
        }
        else if (ScoreCounter.getScore()>=70){
            setImage(new GreenfootImage("!Congratulations!", 32, Color.WHITE,new Color(0,0,0,0)));
            getImage().setTransparency(240);
        }    
    }
}
