import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runners here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runners extends Actor
{
    /**
     * Act - do whatever the Runners wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
    
    }
    
    public void SlideMove()
    {
        int x = getX();
        int y = getY();
        int speed = 4;
     if(Greenfoot.isKeyDown("Right"))
     {
         setLocation(x+speed,y);
         if(hitBarriers())
         {
          setLocation(x-speed, y);
         }
    
     }

     if(Greenfoot.isKeyDown("Left"))
     {
         setLocation(x-speed,y);
         if(hitBarriers())
         {
          setLocation(x+speed, y);
         }
    
     }
     
     if(Greenfoot.isKeyDown("Up"))
     {
         setLocation(x,y-speed);
         if(hitBarriers())
         {
          setLocation(x, y+speed);
         }
    
     }
     
     if(Greenfoot.isKeyDown("Down"))
     {
         setLocation(x,y+speed);
         if(hitBarriers())
         {
          setLocation(x, y-speed);
         }
    
     }
    }
    
    public boolean hitBarriers()
    {
    if(
    isTouching(MazeBarrier.class))
    {
     return true;
    }

     else 
     {
       return false  ;
     }
    }


    }
    
    
    
 

    
    
    
    
    
    
    
    

