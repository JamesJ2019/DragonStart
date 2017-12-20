import java.awt.*;
import java.util.ArrayList;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{    
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       int num;  
    
    do{
        System.out.println("How many Dragons would you like to create");
        num = input.nextInt();
    }
    while(num <= 0);
    
    for(int i = 1; i <= num; i++){
        Dragon temp = new Dragon(90 * i + 25, 90 * i +50,1 , new Color(50 * i, 50 * i, 50 * i), "#" + i);
        dragon.add(temp);
    }
    
    for(int i; i = 0; i < dragons.size() i++;){
        dragons.get(i).drawDragon(g);
        dragons.get(i).dragonSayHello(g);
    }
}
}

Dragon jen = new Dragon();
       jen.drawDragon(g);
       jen.attack(g);    
       System.out.println(jen);
       
       Dragon james = new Dragon(300,300,2, Color.BLUE, 25,"fire");
       james.drawDragon(g);
       james.attack(g);
       
       Backround bop = new Backround();
       bop.drawBackround(g, panel);

