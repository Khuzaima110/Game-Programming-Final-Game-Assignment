import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class prisonerMarcus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prisonerMarcus extends Actor
{
    /**
     * Act - do whatever the prisonerMarcus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx= 0;
    int dy= 0;
    int speed= 3;

    public void act()
    {
        controls();
        knockOut();
    }

    public void controls() {
        int dx = 0;
        int dy = 0;

        if (Greenfoot.isKeyDown("left"))  dx = -3;
        if (Greenfoot.isKeyDown("right")) dx = 3;
        if (Greenfoot.isKeyDown("up"))    dy = -6;
        if (Greenfoot.isKeyDown("down"))  dy = 6;

        movePredictive(dx, dy);
    }

    private void movePredictive(int dx, int dy) {
        // Horizontal movement
        if (!willCollide(getX() + dx, getY())) {
            setLocation(getX() + dx, getY());
        }

        // Vertical movement 
        if (!willCollide(getX(), getY() + dy)) {
            setLocation(getX(), getY() + dy);
        }
    }

    private boolean willCollide(int nextX, int nextY) {
        // Temporarily move to the predicted position
        int currentX = getX();
        int currentY = getY();
        setLocation(nextX, nextY);

        boolean touchingWall = isTouching(sideJailBar.class) || isTouching(topViewJailBar.class)||
        isTouching(wall.class);

        // Move back to original location
        setLocation(currentX, currentY);

        return touchingWall;
    }
    
    public void knockOut()
    {
        if ( isTouching(obliviousPrisonGuard.class) ) 
        {
            removeTouching(obliviousPrisonGuard.class);
        }
    }
}     
