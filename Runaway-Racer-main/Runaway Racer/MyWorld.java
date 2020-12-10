import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    public void act()
    {
       if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Enemy(), 599, Greenfoot.getRandomNumber(399));
        } 
       if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Enemy2(), 599, Greenfoot.getRandomNumber(399));
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        RC rC = new RC();
        addObject(rC,250,273);
    }
}
