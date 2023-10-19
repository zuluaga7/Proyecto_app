package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionExamenesG {
    Utilidad utilidad = new Utilidad();

    public ValidacionExamenesG() {
    }

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception(Mensajes.ID_NEGATIVO.getMensaje());
        }
        return true;
    }

    public Boolean validarNombresExamen(String nombreExamen) throws Exception {
        if (nombreExamen.length() < 10 || nombreExamen.length() > 150) {
            throw new Exception(Mensajes.NOMBRES_LONGITUD.getMensaje());

        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombreExamen)) {
            throw new Exception(Mensajes.NOMBRES_FORMATO.getMensaje());
        }
        return true;
    }


    public Boolean validarImagenExamen(String ImagenExamen) throws Exception {
        if (ImagenExamen.length() < 50) {
            throw new Exception(Mensajes.IMAGEN_LONGITUD.getMensaje());
        }
       String expresionRegular = ".*\\.(jpg|jpeg|png|gif|bmp|svg)$";
        Pattern pattern= Pattern.compile((ImagenExamen));
        Matcher matcher= pattern.matcher(ImagenExamen);

        return matcher.matches();

    }

}


