package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionExamenesG {
    Utilidad utilidad = new Utilidad();

    public ValidacionExamenesG() {
    }

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception("el id no puede ser negativo");
        }
        String expresionRegular = "^[1-9][0-9]*$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, String.valueOf(id))) {
            throw new Exception("revise el formato ingresado");
        }
        return true;
    }

    public Boolean validarNombresExamen(String nombreExamen) throws Exception {
        if (nombreExamen.length() < 10 || nombreExamen.length() > 150) {
            throw new Exception("el nombre debe tener entre 10 y 150 caracteres");

        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombreExamen)) {
            throw new Exception("el nombre no cumple los parametros");
        }
        return true;
    }


    public Boolean validarImagenExamen(String ImagenExamen) throws Exception {
        if (ImagenExamen.length() < 200) {
            throw new Exception("La imagen no cumple con los parametros");
        }
       String expresionRegular = ".*\\.(jpg|jpeg|png|gif|bmp|svg)$";
        Pattern pattern= Pattern.compile((ImagenExamen));
        Matcher matcher= pattern.matcher(ImagenExamen);

        return matcher.matches();

    }

}


