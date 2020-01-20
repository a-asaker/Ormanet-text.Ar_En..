// Coded By :: A_Asaker
package ornament;

import com.sun.webkit.graphics.GraphicsDecoder;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main{
    public static void main(String[] args) {
            Ornament form = new Ornament(); 
           form.setVisible(true);
           ImageIcon img = new ImageIcon("iaco.jpg");
         form.setIconImage(img.getImage());
       }
    
}
