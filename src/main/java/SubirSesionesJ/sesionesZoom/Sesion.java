/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirSesionesJ.sesionesZoom;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author luiss
 */
public class Sesion {
    private long ID;
    private LocalDate fecha;
    private LocalTime hora;
    private String descr;
    private String ruta;
    private ArrayList<Video>  videos = new ArrayList<Video>();
    
    public Sesion(String ID, String fecha,String hora, String descr, String ruta){
        this.ID = Long.parseLong(ID);
        this.fecha = LocalDate.parse(fecha);
        this.hora = LocalTime.parse(hora);
        this.descr = descr;
        this.ruta = ruta;
    }

    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @return the videos
     */
    public ArrayList<Video> getVideos() {
        return videos;
        
    }

    /**
     * @return the descr
     */
    public String getDescr() {
        return descr;
    }
    
    /**
     * Agrega un video y da la opción de ordenar la lista de acuerdo a la fecha
     * @param video El video a agregar a la lista de esta sesión
     * @param ordenar true para ordenar el ArrayList por hora de inicio de los videos
     * @return La cantidad de videos de esta sesión
     */
    public int agregarVideo(Video video, boolean ordenar){
        this.videos.add(video);
        
        if(ordenar){
            Collections.sort(videos, Video.compVideos);
        }
        
        return this.videos.size();
    }
    
    /**
     * Comparador
     */
    public static Comparator<Sesion> compVideos = new Comparator<Sesion>() {
        @Override
        public int compare(Sesion o1, Sesion o2) {
            LocalDate d1 = o1.getFecha();
            LocalDate d2 = o2.getFecha();
            
            return d1.compareTo(d2);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    
    
    
}
