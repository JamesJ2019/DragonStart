import java.awt.*;
public class ScaledDragon extends Dragon
{
    // instance variables 
    private Color scaleColor;

    public ScaledDragon(int x,int y, int size, Color c, String n,Color sC)
    {
        super(x,y,size,c,n);
        scaleColor = sC;
    }
    
    private void drawScales(Graphics g)
    {
        g.setColor(scaleColor);
        for(int y = super.getBodyY(); y < super.getBodyY() + super.getBodyHeight() - 15; y +=14){
            for(int x = super.getBodyX(); x < super.getBodyX() + super.getBodyWidth() - 15; x += 14){
                g.drawLine(x, y, x+5, y+5);
            }
        }
     
    }
    public void drawDragon(Graphics g){
        super.drawDragon(g);
        drawScales(g);
    }
    
}