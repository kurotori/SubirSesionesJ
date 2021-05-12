/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirSesionesJ.sesionesZoom;

import SubirSesionesJ.herramientas.Archivos;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.*;

/**
 *
 * @author luiss
 */
public class DirectorioZoom {
    private String ruta;
    private ArrayList<Sesion> sesiones = new ArrayList<Sesion>();
    private int cantSesiones;
    //private Archivos herramientasArchivos =  new Archivos();
    
    private void analizarDirectorio(String ruta){
        List<File> listaArchivos = null;
        
        try {
            listaArchivos = Files.list(Paths.get(ruta))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } 
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        Pattern patron = Pattern.compile(
                "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}\\.[0-9]{2}\\.[0-9]{2} .* [0-9]*",
                Pattern.CASE_INSENSITIVE);
        
        
        for (File archivo : listaArchivos) {
            //System.out.println(archivo.getPath());
            if(archivo.isDirectory()){
                String nombreDir = archivo.getName();
                Matcher compRegex = patron.matcher(nombreDir);
                if (compRegex.find()) {
                    String[] elementos = nombreDir.split(" ");
                    String id = elementos[elementos.length - 1];
                    String fecha = elementos[0];
                    String hora = elementos[1];
                    hora = hora.replace(".", ":");
                    String tema = "";
                    for (int i = 2; i < elementos.length - 1; i++) {
                        tema += elementos[i]+" ";
                    }
                    String rutaArch = archivo.getPath();
                    System.out.println(id);
                    
                    Sesion s = new Sesion(id, fecha, hora, tema, rutaArch);
                    agregarSesion(s);
                }
                
            }
            
        }
    }
    
    private void agregarSesion(Sesion sesion){
        this.sesiones.add(sesion);
        System.out.println("Num de sesiones:" + this.sesiones.size());
    }
    
    
    public DirectorioZoom(String ruta){
        this.ruta = ruta;
        analizarDirectorio(ruta);
        this.cantSesiones = sesiones.size();
    }
}
