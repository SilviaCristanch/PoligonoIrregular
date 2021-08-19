package poligonos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP AMD RYZEN 3
 */
public class Poligonos extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int[] x ={50, 50, 90, 90, 150, 90, 90};
        int[] y ={55, 85, 85, 110, 70, 30, 55};
        g.setColor(Color.orange);
        g.drawPolygon(x, y, 7);
        
    }
    public static void main(String []args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Poligono");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.black);
        ventana.setSize(300, 200);
        
        Poligonos panel = new Poligonos();
        ventana.add(panel);
        
        ventana.setVisible(true);
        
    }
}
