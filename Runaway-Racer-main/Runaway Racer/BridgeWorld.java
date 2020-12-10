import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BridgeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BridgeWorld extends World
{

    /**
     * Constructor for objects of class BridgeWorld.
     * 
     */
    public BridgeWorld()
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
        RC rC = new RC();
        addObject(rC,249,319);
        rC.setLocation(300,139);
        Portal portal = new Portal();
        addObject(portal,300,139);
        rC.setLocation(73,138);
        rC.setLocation(71,154);
        rC.setLocation(81,96);
        rC.setLocation(179,139);
        rC.setLocation(252,323);
        RC rC2 = new RC();
        addObject(rC2,252,323);
    }
}
