

package org.example.utilidades;

public enum Mensajes {

    ID_NEGATIVO("el id no puede ser negativo"),
    NOMBRES_LONGITUD("el nombre debe tener entre 3 y 70 caracteres"),
    NOMBRES_FORMATO("el nombre no cumple los parametros"),
    APELIIDOS_LONGITUD("los empleados no cumplen con el minimo o maximo de caracteres"),
    APELLIDOS_FORMATO("el apellido no cumple los parametros"),
    DOCUMENTOS_LONGITUD("documento con longitud invalida"),
    DOCUMENTOS_FORMATO("revise el formato ingresado"),
    CIUDAD_LONGITUD("ciudad con longitud invalida"),
    CIUDAD_FORMATO("Revise el formato ingresado"),
    DEPARTAMENTO_LONGITUD("departamento con longitud invalida"),
    DEPARTAMENTO_FORMATO("Revise el formato ingresado"),
    CORREOELECTRONICO_LONGITUD("no cumplen con el minimo o maximo de caracteres"),
    CORREOELECTRONICO_FORMATO("por favor, revise el formato"),
    TELEFONO_LONGITUD("telefono con longitud invalida"),
    IMAGEN_LONGITUD("La imagen no cumple con los parametros"),
    UNIDADDEM_LONGITUD("usted está paila"),
    UNIDADDEM_FORMATO("no cumple con la medida");







    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}