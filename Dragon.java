import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private int health;
    private String attack;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.GREEN;
        health = 25;
        attack = "fire";
    }
    
    /**
     * Overloaded Constructors go here
     */
    public Dragon(int x, int y, int size, Color c, int health, String attack){
    this.x = x;
    this.y = y;
    this.size = size;
    this.c = c;
    this.health = health;
    this.attack = attack;
}

    /** 
     * Accessor Methods
     */
    /**
     
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y , size * 25, size * 25);
        g.fillRect(x + size * 25, y + size * 25, size * 60, size * 50);
        g.fillRect(x + size * 25,(y + size * 25) + size * 50, size * 10, size * 25);
        g.fillRect(x + size * 75,(y + size * 25) + size * 50, size * 10, size * 25);
        g.fillRect(x + size * 85, y + size * 25, size * 30, size * 10);
        g.fillRect(x + size * -150, y + size * 130, size * 100, size * 10);
    }
    public void attack (Graphics g){
        if(attack.equals("fire"))
            drawFire(g);    
    }
    private void drawFire(Graphics g){
        g.setColor(Color.RED);
        for(int i = 1; i < size * 3; i++)
        g.fillOval(x + i * -30, y + size * 20, i * 25, i * 25);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size;
    }
}
