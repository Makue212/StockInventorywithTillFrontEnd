/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.kc;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
/**
 *
 * @author BRIAN
 */
public class progress extends JPanel {
    int progress_value;
    public void abc(int b){
       
        progress_value = b;
        
        
    }
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g2.rotate(Math.toRadians(270));
        
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Double(0, 0, 80, 80);
        arc.setFrameFromCenter(new Point(0,0), new Point(90,90));
        circle.setFrameFromCenter(new Point(0,0), new Point(80,80));
        
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress_value*3.6);
        g2.setColor(Color.BLUE);
        g2.draw(arc);
        g2.fill(arc);
        
        g2.setColor(Color.GRAY);
        g2.draw(circle);
        g2.fill(circle);
        
        g2.setColor(Color.WHITE);
        g2.rotate(Math.toRadians(90));
        g2.setFont(new Font(TOOL_TIP_TEXT_KEY,Font.PLAIN,50));
        
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(progress_value + "%", g);
        
        int x = (0-(int)r.getWidth()/2);
        int y = (0-(int)r.getHeight()/2 + fm.getAscent());
        
        g2.drawString(progress_value + "%",x, y);
        
       
        
        
        
    }
}
