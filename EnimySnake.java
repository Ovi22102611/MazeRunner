import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnimySnake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnimySnake extends Enimies
{
    /**
     * Act - do whatever the EnimySnake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed=2;
    public EnimySnake(boolean upAndDown )
    {

        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2); //setting up the size
        upDown = upAndDown;
    }

    public void act()
    {
         moveSnake();
         enemyHitWalls();
         wrapatedge();
    }

    public void enemyHitWalls()
    {
        if (hitBarriers())
        {
            speed= -speed;
        }        }
        
        

    
    

    private void moveSnake()
    {   int x= getX();
        int y= getY();
        if (upDown)
    { 
        setLocation(x,y+speed); 

    }
    else if (!upDown)
    { 
        setLocation(x+speed,y);
    }
    }
    
}

