package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacSignoVital {
    Utilidad utilidad = new Utilidad();

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(Mensajes.ID_NEGATIVO.getMensaje());
        }
return true;
    }



    public Boolean validarNombrePaciente(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() > 100) { //lo que no debe de hacer
            throw new Exception(Mensajes.NOMBRES_LONGITUD.getMensaje());

        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception(Mensajes.NOMBRES_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedidad) throws Exception {
        if (unidadMedidad < 3 || unidadMedidad > 47) {
            throw new Exception(Mensajes.UNIDADDEM_LONGITUD.getMensaje());

        }
        String expresionRegular="^[0-9]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,String.valueOf(unidadMedidad))){
            throw new Exception(Mensajes.UNIDADDEM_FORMATO.getMensaje());
        }
        return true;
    }
}






