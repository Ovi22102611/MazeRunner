import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnimyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnimyBird extends Enimies
{
    /**
     * Act - do whatever the EnimyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);//the bird's speed. it will move 10 pixel for 1 act. and the speed depends on ''run'' button to be pressed as 1 run= 60 acts per second.
        wrapatedge();
    }
    
    public EnimyBird()
    {
    
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2); //setting up the size
    
    }
    
}
