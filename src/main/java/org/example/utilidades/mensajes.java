

package org.example.utilidades;

public enum mensajes {

    ID_NEGATIVO("el id no puede ser negativo"),
    NOMBRES_LONGITUD("el nombre debe tener entre 3 y 40 caracteres"),
    NOMBRES_FORMATO("no tenemos coincidencia");
    //CIUDAD_FORMATO("revise el formato ingresado");

    private String mensaje;

    mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}