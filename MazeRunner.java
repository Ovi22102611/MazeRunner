import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends players
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mazeRunnerLives;
    public MazeRunner(int lives)
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3); //setting up the size
            
        mazeRunnerLives=lives;
    }
    
    public void act()
    {
        SlideMove();
        collectcheese();
        maxspeed();
        loseLife();
        mazerunnerHitenemy();
        WinningMoment();
        youLose();
    }
    
    public void mazerunnerHitenemy()
    {
    if(hitenemy()==true)
    {
    setLocation(44,329);
    
    }
    
    }
    public void loseLife()
    {
    if (hitenemy())
    {
    mazeRunnerLives--;
    }
    }
    
    public void youLose()
    {
    if (mazeRunnerLives==0)
    {
         getWorld().addObject(new YouLose(),getWorld().getWidth()/2, getWorld().getHeight()/2);
         Greenfoot.stop();
    }
    }
    
    
}
