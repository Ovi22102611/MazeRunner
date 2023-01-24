import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enimies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enimies extends Runners
{
    /**
     * Act - do whatever the Enimies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void wrapatedge()
    {  int x=getX();
        int y=getY();
        int worldwidth=getWorld().getWidth() -1;
        int worldheight=getWorld().getHeight() -1;
        if(x >= worldwidth )
        {
        setLocation(0, y);
        }
        
        if(x==0 )
        {
        setLocation(worldwidth, y);
        }
         if(y >= worldheight )
        {
        setLocation(x,1 );
        }
         if(y <= 0 )
        {
        setLocation(x,worldheight );
        }
    
    }
   
}
