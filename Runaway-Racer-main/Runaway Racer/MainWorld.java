import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{

    /**
     * Constructor for objects of class MainWorld.
     * 
     */
    public MainWorld()
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
        Border border = new Border();
        addObject(border,100,30);
        Border border2 = new Border();
        addObject(border2,300,30);
        border2.setLocation(457,29);
        bridge bridge = new bridge();
        addObject(bridge,300,336);
        bridge bridge2 = new bridge();
        addObject(bridge2,100,336);
        //bridge2.setLocation(396,383);
        //border.setLocation(221,201);
        //RoadLine roadLine = new RoadLine();
        //addObject(roadLine,221,201);
        //border2.setLocation(371,317);
        //bridge.setLocation(364,257);
        //RoadLine roadLine2 = new RoadLine();
        //addObject(roadLine2,364,257);
        //border2.setLocation(437,185);
        //RoadLine roadLine3 = new RoadLine();
        //addObject(roadLine3,437,185);
        //border.setLocation(248,110);
        //RoadLine roadLine4 = new RoadLine();
        //addObject(roadLine4,248,110);
    }
}
