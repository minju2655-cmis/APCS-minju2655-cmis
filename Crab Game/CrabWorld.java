import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,104,325);
        Worm worm = new Worm();
        addObject(worm,156,131);
        Worm worm2 = new Worm();
        addObject(worm2,253,229);
        Worm worm3 = new Worm();
        addObject(worm3,349,96);
        Worm worm4 = new Worm();
        addObject(worm4,453,277);
        Worm worm5 = new Worm();
        addObject(worm5,378,383);
        Worm worm6 = new Worm();
        addObject(worm6,181,450);
        Worm worm7 = new Worm();
        addObject(worm7,484,102);
        Worm worm8 = new Worm();
        addObject(worm8,483,488);
        worm5.setLocation(322,367);
        worm6.setLocation(237,450);
        worm4.setLocation(431,257);
        worm7.setLocation(503,148);
        worm3.setLocation(343,46);
        worm2.setLocation(263,178);
        worm.setLocation(140,89);
        Worm worm9 = new Worm();
        addObject(worm9,83,240);
        worm6.setLocation(221,452);
        worm5.setLocation(207,337);
        worm6.setLocation(311,474);
        Worm worm10 = new Worm();
        addObject(worm10,125,497);
        worm6.setLocation(311,430);
        worm4.setLocation(371,273);
        Worm worm11 = new Worm();
        addObject(worm11,531,363);
        worm8.setLocation(423,499);
        worm2.setLocation(245,151);
        worm7.setLocation(455,108);
        worm3.setLocation(331,35);
        worm2.setLocation(262,210);
        worm7.setLocation(471,126);
        worm2.setLocation(259,182);
        Lobster lobster = new Lobster();
        addObject(lobster,336,143);
    }
}
