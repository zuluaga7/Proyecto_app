
package org.example.entidades;

import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;

public class Afiliado {
    private Integer id;
   private String documento;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;

    private Integer ciudad;
    private Integer departamento;
    private String correoElectronico;
    private String telefono;

    private ValidacionAfiliado validacionAfiliado=new ValidacionAfiliado(); //inyectar dependencias

    public Afiliado() {
    }
    //constructor vacio

    public Afiliado(Integer id, String documento, String nombres, String apellidos, LocalDate fechaNacimiento, Integer ciudad, Integer departamento, String correoElectronico, String telefono) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
       try{  //intento
      this.validacionAfiliado.validarId(id);
      this.id=id;
           System.out.println("id cargado con exito");
       }catch (Exception error){ // si no fui capaz capturo el por qué?...
           System.out.println(error.getMessage());
       }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        try{
            this.validacionAfiliado.validarDocumento(documento);
            this.documento=documento;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try{
            this.validacionAfiliado.validarNombres(nombres);
            this.nombres=nombres;
        }catch (Exception error){
            System.out.println(error.getMessage());

        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
      try {
          this.validacionAfiliado.validarApeliidos(apellidos);
          this.apellidos=apellidos;
      }catch (Exception error){
          System.out.println(error.getMessage());
      }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        try{
            this.validacionAfiliado.ValidarCiudad(ciudad);
            this.ciudad=ciudad;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        try{
            this.validacionAfiliado.ValidarCiudad(departamento);
            this.departamento=departamento;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        try{
            this.validacionAfiliado.ValidarCiudad(Integer.valueOf(correoElectronico));
            this.correoElectronico=correoElectronico;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        try{
            this.validacionAfiliado.validarTelefono(telefono);
            this.telefono=telefono;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
