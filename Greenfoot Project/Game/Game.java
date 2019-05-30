import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private Character character;
    ScoreCounter score = new ScoreCounter();
    HealthBar healthbar = new HealthBar();

    public Game(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage img = new GreenfootImage("Game1.jpeg");
        img.scale(getWidth(), getHeight());
        setBackground(img); 
        prepare();
    }
    public Character getCharacter(){
        return character;
    }
    public ScoreCounter getCounter(){
        return score;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }

    private void prepare()
    {
        character= new Character();
        addObject(score,520,50);
        addObject(healthbar,80,50);
        addObject(character,147,184);
        if(ScoreCounter.getScore()<=10){
            Enemy[] enemies = new Enemy[1];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[1] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
        else if (ScoreCounter.getScore()>10 && ScoreCounter.getScore()<=20){
            Enemy[] enemies = new Enemy[3];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[2] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
        else if (ScoreCounter.getScore()>20 && ScoreCounter.getScore()<=30){
            Enemy[] enemies = new Enemy[4];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[3] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
        else if (ScoreCounter.getScore()>30 && ScoreCounter.getScore()<=40){
            Enemy[] enemies = new Enemy[5];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[4] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
        else if (ScoreCounter.getScore()>40 && ScoreCounter.getScore()<=50){
            Enemy[] enemies = new Enemy[7];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[5] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
        else if (ScoreCounter.getScore()>50){
            Enemy[] enemies = new Enemy[8];
            for (int i = 0; i<enemies.length; i++){
                enemies[i] = new Enemy();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemies[i], enemyX, enemyY);
            }
            Enemy2[] enemiess = new Enemy2[6] ;
            for (int i = 0; i<enemiess.length; i++){
                enemiess[i] = new Enemy2();
                int enemyX = Greenfoot.getRandomNumber(getWidth());
                int enemyY = Greenfoot.getRandomNumber(getHeight());
                addObject(enemiess[i], enemyX, enemyY);
            }
        }
    }
    public void act()
    {
        if(ScoreCounter.getScore()<=10){
            int max = 1;   
            int max2 = 1;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
        else if (ScoreCounter.getScore()>10 && ScoreCounter.getScore()<=20){
            int max = 2;   
            int max2 = 1;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
        else if (ScoreCounter.getScore()>20 && ScoreCounter.getScore()<=30){
            int max = 4;   
            int max2 = 3;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
        else if (ScoreCounter.getScore()>30 && ScoreCounter.getScore()<=40){
            int max = 5;   
            int max2 = 4;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
        else if (ScoreCounter.getScore()>40 && ScoreCounter.getScore()<=50){
            int max = 6;   
            int max2 = 4;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
        else if (ScoreCounter.getScore()>50){
            int max = 7;   
            int max2 = 5;
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            int x1 = Greenfoot.getRandomNumber(600);
            int y1 = Greenfoot.getRandomNumber(400);
            if (getObjects(Enemy.class).size()<max)
            {
                addObject(new Enemy(),x,y);    
            }
            if (getObjects(Enemy.class).size()<max-1){
                max++;
            }
            if (getObjects(Enemy2.class).size()<max2)
            {
                addObject(new Enemy2(),x1,y1);    
            }
            if (getObjects(Enemy2.class).size()<max2-1){
                max2++;
            }
        }
                
    }
}
