package brickbreaker;

/**
 * Required imports
 */
import java.awt.Color;

/**
 * Globals.java - classes can contain "properties" which are essentially "global
 * variables" to that class - but can also be thought of as "things about that
 * class" (or "descriptors" or even "adjectives"). This class is using
 * properties which are "global" to all the other classes in the project.
 *
 * @author Abhishek Shah
 * @since Jan. 5, 2020
 */
public class Globals {
    //Some global variables  to transfer them class by class easily.

    public static final String APPLICATION_TITLE = "Brick Breaker";
    public static final Color FORM_COLOR = Color.black;

    public static final Color PADDLE_COLOR = Color.blue;
    public static final int PADDLE_SPEED = 14;  
    public static final int PADDLE_AMOUNT = 12;                          

    public static final Color BALL_COLOR = Color.yellow;                     
    public static final int BALL_DELAY = 10;                            
    public static final int BALL_SPEED = 18; 
    public static final int BALL_AMOUNT = 4;                             

    public static final int BRICK_AMOUNT = 10;
    public static final int BRICK_WIDTH = 50;
    public static final int BRICK_HEIGHT = 30;
}
