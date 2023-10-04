package org.example.entidades;

import org.example.validaciones.ValidacionAfiliado;
import org.example.validaciones.ValidacionExamenesG;

import java.time.LocalDate;

public class ExamenesGenerales {
    private Integer id;
    private String nombreExamen;
    private LocalDate fechaExamen;
    private String imagenExamen;
    private ValidacionExamenesG ValidacionExamenesG =new ValidacionExamenesG();

    public ExamenesGenerales() {
    }

    public ExamenesGenerales(Integer id, String nombreExamen, LocalDate fechaExamen, String diagnostico, String imagenExamen) {
        this.id = id;
        this.nombreExamen = nombreExamen;
        this.fechaExamen = fechaExamen;
        this.imagenExamen = imagenExamen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try{  //intento
            this.ValidacionExamenesG.validarId(id);
            this.id=id;
            System.out.println("id cargado con exito");
        }catch (Exception error){ // si no fui capaz capturo el por qué?...
            System.out.println(error.getMessage());
        }

    }


    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        try{
            this.ValidacionExamenesG.validarNombresExamen(nombreExamen);
            this.nombreExamen=nombreExamen;
        }catch (Exception error){
            System.out.println(error.getMessage());

        }
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        try{
            //this.ValidacionExamenesG.validarfechaExamen(fechaExamen);
            this.fechaExamen=fechaExamen;
        }catch (Exception error){
            System.out.println(error.getMessage());

        }
    }

    public String getImagenExamen() {
        return imagenExamen;
    }

    public void setImagenExamen(String imagenExamen) {
        try{
            this.ValidacionExamenesG.validarImagenExamen(imagenExamen);
            this.imagenExamen=imagenExamen;
        }catch (Exception error){
            System.out.println(error.getMessage());

        }
    }
}
