import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Racer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Racer extends Actor
{
    /**
     * Act - do whatever the Racer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int speed = 2;
        if(Greenfoot.isKeyDown("up"))
        setLocation(getX(), getY() - speed);
        if(Greenfoot.isKeyDown("down"))
        setLocation(getX(), getY() + speed);
        if(Greenfoot.isKeyDown("left"))
        setLocation(getX() - speed, getY());
        if(Greenfoot.isKeyDown("right"))
        setLocation(getX() + speed, getY());
    }    
}
