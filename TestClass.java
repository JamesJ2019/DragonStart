import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
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
       Scanner input = new Scanner(System.in);
    
    do{
        System.out.println("How many Dragons would you like to create");
        num = input.nextInt();
    }
    while(num <= 0);
    
    for(int i = 1; i <= num; i++){
        Dragon temp = new Dragon(90 * i + 25, 90 * i + 50,1 , new Color(50 * i, 50 * i, 50 * i),1, "#" + i);
        dragons.add(temp);
    }
    
    for(int i = 0; i < dragons.size(); i++){
        dragons.get(i).drawDragon(g);
        /*dragons.get(i).dragonSayHello(g);*/
    }
}
}



