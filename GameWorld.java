import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
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
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new RoadLine(), 350, 288);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new RoadLine(), 350, 235);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new RoadLine(), 350, 180);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new RoadLine(), 350, 122);
        }
    }
    
    private void prepare()
    {
        //Border border = new Border();
        //addObject(border,300,60);
        //bridge bridge = new bridge();
        //addObject(bridge,300,305);
        //Border border = new Border();
        //addObject(border,16,58);
        //border.setLocation(360,9);
        //border.setLocation(791,120);
        //removeObject(border);
        Border border = new Border();
        addObject(border,300,60);
        border.setLocation(300,60);
        bridge bridge = new bridge();
        addObject(bridge,299,306);
        bridge.setLocation(300,305);
        RoadLine roadLine = new RoadLine();
        addObject(roadLine,350,288);
        roadLine.setLocation(350,288);
        RoadLine roadLine2 = new RoadLine();
        addObject(roadLine2,350,235);
        roadLine2.setLocation(350,235);
        RoadLine roadLine3 = new RoadLine();
        addObject(roadLine3,350,190);  
        roadLine3.setLocation(350,180);
        RoadLine roadLine4 = new RoadLine();
        addObject(roadLine4,352,122);
        roadLine4.setLocation(350,122);
    }
}
