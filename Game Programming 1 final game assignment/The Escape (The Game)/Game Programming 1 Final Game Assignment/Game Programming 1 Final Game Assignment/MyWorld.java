import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        sideJailBar sideJailBar = new sideJailBar();
        addObject(sideJailBar,28,247);
        sideJailBar sideJailBar2 = new sideJailBar();
        addObject(sideJailBar2,86,245);
        sideJailBar sideJailBar3 = new sideJailBar();
        addObject(sideJailBar3,143,244);
        sideJailBar sideJailBar4 = new sideJailBar();
        addObject(sideJailBar4,198,244);
        topViewJailBar topViewJailBar = new topViewJailBar();
        addObject(topViewJailBar,234,242);
        topViewJailBar topViewJailBar2 = new topViewJailBar();
        addObject(topViewJailBar2,234,293);
        topViewJailBar topViewJailBar3 = new topViewJailBar();
        addObject(topViewJailBar3,235,335);
        topViewJailBar topViewJailBar4 = new topViewJailBar();
        addObject(topViewJailBar4,235,388);
        topViewJailBar topViewJailBar5 = new topViewJailBar();
        addObject(topViewJailBar5,234,452);
        topViewJailBar topViewJailBar6 = new topViewJailBar();
        addObject(topViewJailBar6,233,509);
        topViewJailBar6.setLocation(226,581);
        removeObject(topViewJailBar4);
        prisonerMarcus prisonerMarcus = new prisonerMarcus();
        addObject(prisonerMarcus,83,432);
        removeObject(topViewJailBar6);
        removeObject(topViewJailBar5);
        removeObject(sideJailBar2);

        topViewJailBar topViewJailBar7 = new topViewJailBar();
        addObject(topViewJailBar7,233,512);
        topViewJailBar topViewJailBar8 = new topViewJailBar();
        addObject(topViewJailBar8,235,396);
        topViewJailBar topViewJailBar9 = new topViewJailBar();
        addObject(topViewJailBar9,235,456);
        removeObject(sideJailBar3);
        wall wall = new wall();
        addObject(wall,436,30);
        wall wall2 = new wall();
        addObject(wall2,436,89);
        wall wall3 = new wall();
        addObject(wall3,436,150);
        wall wall4 = new wall();
        addObject(wall4,436,206);
        wall wall5 = new wall();
        addObject(wall5,435,256);
        wall wall6 = new wall();
        addObject(wall6,435,309);
        wall wall7 = new wall();
        addObject(wall7,436,368);
        wall wall8 = new wall();
        addObject(wall8,436,424);
        wall wall9 = new wall();
        addObject(wall9,436,482);
        wall9.setLocation(436,504);
        wall wall10 = new wall();
        addObject(wall10,436,504);
        wall9.setLocation(434,468);
        weakPrisonGuard weakPrisonGuard = new weakPrisonGuard();
        addObject(weakPrisonGuard,234,57);
        obliviousPrisonGuard obliviousPrisonGuard = new obliviousPrisonGuard();
        addObject(obliviousPrisonGuard,516,79);
        prisonerGeorge prisonerGeorge = new prisonerGeorge();
        addObject(prisonerGeorge,164,426);
        prisonerGeorge.knockOut();
        topViewJailBar topViewJailBar10 = new topViewJailBar();
        addObject(topViewJailBar10,235,568);
    }
}
