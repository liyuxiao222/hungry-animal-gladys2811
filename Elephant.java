import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant.
 * 
 * @author Gladys 
 * @version December 2022
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound ("elephantcub.mp3");
    
    public void act()
    {
        if (Greenfoot.isKeyDown ("left"))
        {
            move (-2);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        //Remove apple if elephant eats it
        eat();
    }
    
    /**
     * Eat the apple and spawn new apple if an apple is eaten
     */
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
