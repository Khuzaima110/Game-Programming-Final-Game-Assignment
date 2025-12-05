import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class weakPrisonGuard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class weakPrisonGuard extends Actor
{
    private int dx=3;  
    private int dy=3;
    /**
     * Act - do whatever the weakPrisonGuard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   bounceAtEdge();
        setLocation(getX() +dx, getY()+dy);
        wanderingAround();
        moveAwayFromWall();
    }

    public void bounceAtEdge(){
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();

        // Hit left or right edge
        if (x <= 0 || x >= width - 1) {
            dx = -dx;     // reverse horizontal direction
        }

        // Hit top or bottom edge
        if (y <= 0 || y >= height - 1) {
            dy = -dy;     // reverse vertical direction
        }
    }

    public void wanderingAround(){
        if (Greenfoot.getRandomNumber(100) < 2) {
            dx = Greenfoot.getRandomNumber(5) - 2; // random between -2 and 2
            dy = Greenfoot.getRandomNumber(5) - 2;
        }
    }

    public void moveAwayFromWall(){
        if(isTouching(sideJailBar.class)|| isTouching(topViewJailBar.class) ||
        isTouching(wall.class)) {
            dx= Greenfoot.getRandomNumber(5)-5;
            dy= Greenfoot.getRandomNumber(5)-5;
        }
    }

}
