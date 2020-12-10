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
    
    public void act(){
         if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Border(), 599, 0);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new bridge(), 599, 359);
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //RC rC = new RC();
        //addObject(rC,249,319);
        //rC.setLocation(300,139);
        //Portal portal = new Portal();
        //addObject(portal,300,139);
        //rC.setLocation(252,323);
        //RC rC2 = new RC();
        //addObject(rC2,252,323);
        Border border = new Border();
        addObject(border,300,60);
        //Border border2 = new Border();
        //addObject(border2,230,60);
        //Border border3 = new Border();
        //addObject(border3,400, 60);
        //Border border4 = new Border();
        //addObject(border4,550, 60);
        bridge bridge = new bridge();
        addObject(bridge,300,305);
        //bridge bridge2 = new bridge();
        //addObject(bridge2,200,305);
        //bridge bridge3 = new bridge();
        //addObject(bridge3,400,305);
        //bridge bridge4 = new bridge();
        //addObject(bridge4,550,305);
    }
}
