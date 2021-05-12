/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirSesionesJ.herramientas;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author luiss
 */
public class Archivos {
    
    public List<File> contenidoDelDir(String ruta){
        List<File> lista = null;
        
        //try {
           // lista = Files.list(Paths.get(ruta))
             //       .map(Path::toFile)
               //     .collect(Collectors.toList());
       // } 
        //catch (IOException e) {
          //  System.out.println("ERROR: " + e.getMessage());
        //}
         return lista;
    }
    
}
