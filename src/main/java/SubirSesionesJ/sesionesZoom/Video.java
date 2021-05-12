/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirSesionesJ.sesionesZoom;

import java.time.LocalTime;
import java.util.Comparator;

/**
 *
 * @author luiss
 */
public class Video {
    private String ruta;
    private String nombreArchivo;
    private LocalTime horaInicio;
    private int ID;
    
    
    public static Comparator<Video> compVideos = new Comparator<Video>() {
        @Override
        public int compare(Video o1, Video o2) {
            LocalTime h1 = o1.getHoraInicio();
            LocalTime h2 = o2.getHoraInicio();
            
            return h1.compareTo(h2);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
}
