import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PressStart pressstart = new PressStart();
        addObject(pressstart,300,200);

        Character_Title charactertitle = new Character_Title();
        addObject(charactertitle,0,150);

        Enemy_Title enemytitle = new Enemy_Title();
        addObject(enemytitle,600,250);
        //Character character = new Character();
        //addObject(character,436,209);
        Character character = new Character();
        addObject(character,373,118);
    }
}
