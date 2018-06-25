/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import com.sun.webkit.graphics.GraphicsDecoder;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.misc.Resource;

/**
 *
 * @author A-M
 */
public class P2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   try {
            
            UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
        }catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(P2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(P2.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            Ormanet form = new Ormanet(); 
           form.setVisible(true);
           ImageIcon img = new ImageIcon("C:/Users/A-M/Desktop/iaco.png");
         form.setIconImage(img.getImage());
       }
    
}
