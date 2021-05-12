/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirSesionesJ.GUI;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author luiss
 */
public class herramientas {
    
    public String abrirDirectorio(JFrame ventana){
        String dir="";
        
        final JFileChooser fc = new JFileChooser("/");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = fc.showOpenDialog(ventana);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File dirSel = fc.getSelectedFile();
            String[] array = {"algo", "otra cosa"};
            
        }
        
        return dir;
    }
    
    
}
