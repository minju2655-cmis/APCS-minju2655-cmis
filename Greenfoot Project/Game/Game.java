import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    Character character = new Character();

    public Game(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        if (Greenfoot.getRandomNumber(30)<10){
           addObject(new Character(), 90, 5);
       }
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    private void prepare()
    {
        addObject(counter,520,50);
        addObject(healthbar,80,50);
        addObject(character,147,184);
        Enemy[] enemies = new Enemy[10];
        for (int i = 0; i<enemies.length; i++){
            enemies[i] = new Enemy();
            int enemyX = Greenfoot.getRandomNumber(getWidth());
            int enemyY = Greenfoot.getRandomNumber(getHeight());
            addObject(enemies[i], enemyX, enemyY);
        }
    }
    public void act()
    {
        int max = 8;        
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        if (getObjects(Enemy.class).size()<max)
        {
           addObject(new Enemy(),x,y);    
        }
        if (getObjects(Enemy.class).size()<max-1){
            max++;
        }
    }
}
