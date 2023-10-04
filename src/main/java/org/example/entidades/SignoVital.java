package org.example.entidades;

import org.example.validaciones.ValidacSignoVital;
import org.example.validaciones.ValidacionExamenesG;

import java.time.LocalDate;

public class SignoVital {
    private Integer id;
    private String nombre;
    private Integer unidadMedida;

    private ValidacSignoVital validacSignoVital = new ValidacSignoVital();

    public SignoVital() {
    }

    public SignoVital(Integer id, String nombre, Integer unidadMedida, Double maximoNormal, Double minimoNormal, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {
            this.validacSignoVital.validarId(id);
            this.id = id;
            System.out.println("id cargado con exito");
        } catch (Exception error) { // si no fui capaz capturo el por qué?...
            System.out.println(error.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacSignoVital.validarNombrePaciente(nombre);
            this.nombre = nombre;
        } catch (Exception error) {
            System.out.println(error.getMessage());

        }
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        try {
            this.validacSignoVital.validarUnidadMedida(unidadMedida);
            this.unidadMedida = unidadMedida;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }
}
