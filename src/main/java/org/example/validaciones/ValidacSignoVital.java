package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacSignoVital {
    Utilidad utilidad = new Utilidad();

    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception("el id no puede ser negativo");
        }
        String expresionRegular = " ^[1-9]\\d*$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, String.valueOf(id))) {

            throw new Exception("revise el formato ingresado");
        }
        return true;
    }

    public Boolean validarNombrePaciente(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() > 100) {
            throw new Exception("el nombre debe tener entre 3 y 40 caracteres");

        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception("el nombre no cumple los parametros");
        }
        return true;
    }

    public Boolean validarUnidadMedida(Integer unidadMedidad) throws Exception {
        if (unidadMedidad < 3 || unidadMedidad > 47) {
            throw new Exception("usted está paila");

        }
        String expresionRegular = "^[A-Za-z]+$";
        if(!this.utilidad.buscarCoincidencia(expresionRegular,String.valueOf(unidadMedidad))){
            throw new Exception("no cumple con la medida");
        }
        return true;
    }
}






