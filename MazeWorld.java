import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBarrier mazeBarrier = new MazeBarrier();
        addObject(mazeBarrier,2*50,10*50);
        MazeBarrier mazeBarrier2 = new MazeBarrier();
        addObject(mazeBarrier2,2*50,11*50);
        MazeBarrier mazeBarrier3 = new MazeBarrier();
        addObject(mazeBarrier3,2*50,9*50);
        MazeBarrier mazeBarrier4 = new MazeBarrier();
        addObject(mazeBarrier4,0,10*50);
        MazeBarrier mazeBarrier5 = new MazeBarrier();
        addObject(mazeBarrier5,0,9*50);
        MazeBarrier mazeBarrier6 = new MazeBarrier();
        addObject(mazeBarrier6,0,8*50);
        MazeBarrier mazeBarrier7 = new MazeBarrier();
        addObject(mazeBarrier7,1*50,8*50);
        MazeBarrier mazeBarrier8 = new MazeBarrier();
        addObject(mazeBarrier8,5*50,7*50);
        mazeBarrier8.setLocation(2*50,8*50);
        MazeBarrier mazeBarrier9 = new MazeBarrier();
        addObject(mazeBarrier9,3*50,8*50);
        MazeBarrier mazeBarrier10 = new MazeBarrier();
        addObject(mazeBarrier10,4*50,8*50);
        MazeBarrier mazeBarrier11 = new MazeBarrier();
        addObject(mazeBarrier11,5*50,8*50);
        mazeBarrier3.setLocation(3*50,7*50);
        MazeBarrier mazeBarrier12 = new MazeBarrier();
        addObject(mazeBarrier12,0,5*50);
        MazeBarrier mazeBarrier13 = new MazeBarrier();
        addObject(mazeBarrier13,1*50,5*50);
        MazeBarrier mazeBarrier14 = new MazeBarrier();
        addObject(mazeBarrier14,2*50,5*50);
        MazeBarrier mazeBarrier15 = new MazeBarrier();
        addObject(mazeBarrier15,2*50,4*50);
        MazeBarrier mazeBarrier16 = new MazeBarrier();
        addObject(mazeBarrier16,2*50,3*50);
        MazeBarrier mazeBarrier17 = new MazeBarrier();
        addObject(mazeBarrier17,2*50,2*50);
        MazeBarrier mazeBarrier18 = new MazeBarrier();
        addObject(mazeBarrier18,2*50,1*50);
        MazeBarrier mazeBarrier19 = new MazeBarrier();
        addObject(mazeBarrier19,4*50,2*50);
        MazeBarrier mazeBarrier20 = new MazeBarrier();
        addObject(mazeBarrier20,5*50,2*50);
        MazeBarrier mazeBarrier21 = new MazeBarrier();
        addObject(mazeBarrier21,6*50,3*50);
        MazeBarrier mazeBarrier22 = new MazeBarrier();
        addObject(mazeBarrier22,6*50,4*50);
        MazeBarrier mazeBarrier23 = new MazeBarrier();
        addObject(mazeBarrier23,4*50,4*50);
        MazeBarrier mazeBarrier24 = new MazeBarrier();
        addObject(mazeBarrier24,6*50,1*50);
        MazeBarrier mazeBarrier25 = new MazeBarrier();
        addObject(mazeBarrier25,4*50,0);
        MazeBarrier mazeBarrier26 = new MazeBarrier();
        addObject(mazeBarrier26,5*50,6*50);
        mazeBarrier26.setLocation(5*50,6*50);
        MazeBarrier mazeBarrier27 = new MazeBarrier();
        addObject(mazeBarrier27,5*50,6*50);
        MazeBarrier mazeBarrier28 = new MazeBarrier();
        addObject(mazeBarrier28,6*50,6*50);
        MazeBarrier mazeBarrier29 = new MazeBarrier();
        addObject(mazeBarrier29,7*50,4*50);
        MazeBarrier mazeBarrier30 = new MazeBarrier();
        addObject(mazeBarrier30,8*50,4*50);
        MazeBarrier mazeBarrier31 = new MazeBarrier();
        addObject(mazeBarrier31,8*50,6*50);
        MazeBarrier mazeBarrier32 = new MazeBarrier();
        addObject(mazeBarrier32,9*50,7*50);
        MazeBarrier mazeBarrier33 = new MazeBarrier();
        addObject(mazeBarrier33,8*50,8*50);
        MazeBarrier mazeBarrier34 = new MazeBarrier();
        addObject(mazeBarrier34,7*50,0);
        MazeBarrier mazeBarrier35 = new MazeBarrier();
        addObject(mazeBarrier35,9*50,0);
        MazeBarrier mazeBarrier36 = new MazeBarrier();
        addObject(mazeBarrier36,8*50,0);
        MazeBarrier mazeBarrier37 = new MazeBarrier();
        addObject(mazeBarrier37,9*50,2*50);
        MazeBarrier mazeBarrier38 = new MazeBarrier();
        addObject(mazeBarrier38,9*50,5*50);
        MazeBarrier mazeBarrier39 = new MazeBarrier();
        addObject(mazeBarrier39,6*50,9*50);
        MazeBarrier mazeBarrier40 = new MazeBarrier();
        addObject(mazeBarrier40,8*50,11*50);
        MazeBarrier mazeBarrier41 = new MazeBarrier();
        addObject(mazeBarrier41,10*50,10*50);
        mazeBarrier10.setLocation(6*50,8*50);
        MazeBarrier mazeBarrier42 = new MazeBarrier();
        addObject(mazeBarrier42,8*50,10*50);
        mazeBarrier31.setLocation(8*50,3*50);
        mazeBarrier30.setLocation(7*50,5*50);
        mazeBarrier38.setLocation(9*50,6*50);
        mazeBarrier24.setLocation(7*50,1*50);
        MazeBarrier mazeBarrier43 = new MazeBarrier();
        addObject(mazeBarrier43,5*50,11*50);
        MazeBarrier mazeBarrier44 = new MazeBarrier();
        addObject(mazeBarrier44,4*50,11*50);
        MazeBarrier mazeBarrier45 = new MazeBarrier();
        addObject(mazeBarrier45,0,2*50);
        MazeBarrier mazeBarrier46 = new MazeBarrier();
        addObject(mazeBarrier46,0,3*50);
        MazeBarrier mazeBarrier47 = new MazeBarrier();
        addObject(mazeBarrier47,0,4*50);
        MazeBarrier mazeBarrier48 = new MazeBarrier();
        addObject(mazeBarrier48,0,1*50);
        MazeBarrier mazeBarrier49 = new MazeBarrier();
        addObject(mazeBarrier49,6*50,0);
        MazeBarrier mazeBarrier50 = new MazeBarrier();
        addObject(mazeBarrier50,2*50,7*50);
        mazeBarrier50.setLocation(4*50,3*50);
        mazeBarrier17.setLocation(1*50,2*50);
        mazeBarrier17.setLocation(1*50,0);
        mazeBarrier13.setLocation(1*50,4*50);
        mazeBarrier44.setLocation(6*50,10*50);
        MazeBarrier mazeBarrier51 = new MazeBarrier();
        addObject(mazeBarrier51,10*50,5*50);
        MazeBarrier mazeBarrier52 = new MazeBarrier();
        addObject(mazeBarrier52,11*50,6*50);
        mazeBarrier31.setLocation(10*50,3*50);
        MazeRunner mazeRunner = new MazeRunner();
        addObject(mazeRunner,38,326);
        mazeRunner.setLocation(26,330);
        mazeBarrier7.setLocation(288,588);
        mazeBarrier7.setLocation(315,585);
        mazeBarrier29.setLocation(404,142);
        mazeBarrier35.setLocation(535,11);
        mazeRunner.setLocation(44,329);
        mazeRunner.setLocation(44,329);
        mazeRunner.setLocation(44,329);
        mazeRunner.setLocation(44,329);
        mazeRunner.setLocation(44,329);
        mazeBarrier17.setLocation(8,10);
        MazeBarrier mazeBarrier53 = new MazeBarrier();
        addObject(mazeBarrier53,573,199);
    }
}
