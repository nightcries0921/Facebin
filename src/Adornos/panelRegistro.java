/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adornos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author NIGHTMARE
 */
public class panelRegistro extends javax.swing.JPanel{
    
    public panelRegistro(){
        setSize(400, 570);
    }
    @Override
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("fondoRegistro.jpg"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
