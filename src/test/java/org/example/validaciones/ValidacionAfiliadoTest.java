package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {
    //para ejecutar una prueba debo instanciar un objeto de la clase que voy a probar
    ValidacionAfiliado validacionAfiliado;
    @BeforeEach //establecer las condiciones iniciales de cada prueba

    public void prepararPruebas(){
        this.validacionAfiliado=new ValidacionAfiliado();
    }


    @Test
    public void validarIdCorrecto(){
        //1 preparar 2 ejecutar 3 verificar
        Integer idPrueba=50;
        Boolean resultados= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarIdIncorrecto(){
        //1 preparar 2 ejecutar 3 verificar
        Integer idPrueba=-100;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertEquals("el id no puede ser negativo",resultado.getMessage());
    }
    @Test
public  void validarNombreCorrecto(){
        //preparar
        String nombrePrueba="mateo zuluaga";
        //ejecutar
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarNombres(nombrePrueba));
        //verificar
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarNombreIncorrectoPorTipoCaracteres(){
        String nombrePrueba="Mateo125653";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals("el nombre no cumple los parametros",resultado.getMessage());

    }
    @Test
    public void validarNombreIncorrectoPorLongitud(){
        String nombrePrueba="dfsdfasdasdasdasdsdfdsghdfgjfhfhfghfghjgasdasdsadasdasdasdas";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals("el nombre debe tener entre 3 y 40 caracteres",resultado.getMessage());
    }
    @Test
    public void validarApeliidosCorrecto(){
        //preparar
        String apellidoPrueba="zuluaga rincon";
        //ejecutar
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarApeliidos(apellidoPrueba));
        //verificar
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarApellidosIncorrectoPorTipoCaracteres(){
        String apellidoPrueba="Zuluaga13223";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApeliidos(apellidoPrueba));
        Assertions.assertEquals("el apellido no cumple los parametros",resultado.getMessage());
    }
    @Test
            public void validarApellidoIncorrectoPorLongitud(){
        String apellidoPrueba="dfsdfasdasdasdasdsdfdsghdfgjfhfhfghfghjgasdasdsadasdasdasdas";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombres(apellidoPrueba));
        Assertions.assertEquals("el nombre debe tener entre 3 y 40 caracteres",resultado.getMessage());
    }

    @Test
    public void validarDocumentoCorrecto(){
        String documentoPrueba="1037073201";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarDocumentoIncorrecto(){
        String documentoPrueba="-121323323";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertEquals("revise el formato ingresado",resultado.getMessage());


    }
    /*
    @Test
    public void ValidarFechaDeNacimiento Correcta(){

    }
     */
    @Test
    public void validarCiudadCorrecta(){
        String ciudadPrueba="21";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.ValidarCiudad(Integer.valueOf(ciudadPrueba)));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarCiudadIncorrecta(){
        String ciudadPrueba="-27";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.ValidarCiudad(Integer.valueOf(ciudadPrueba)));
        Assertions.assertEquals("ciudad con longitud invalida",resultado.getMessage());
    }
    @Test
    public void validarDepartamentoCorrecto(){
        String departamentoPrueba="10";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDepartamento(Integer.valueOf(departamentoPrueba)));
    Assertions.assertTrue(resultado);
    }
@Test
    public void validarDepartamentoIncorrecto(){
      String departamentoPrueba="-13";
      Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDepartamento(Integer.valueOf(departamentoPrueba)));
    Assertions.assertEquals("departamento con longitud invalida",resultado.getMessage());
}
@Test
    public void validarCorreoElectronicoCorrecto(){
        String correoPrueba="mateozulu2122@gmail.com";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCorreoElectronico(correoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarCorreoIncorrecto(){
        String correoPrueba="asde34sdfgsdf aagl.com";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDepartamento(Integer.valueOf(correoPrueba)));
        Assertions.assertEquals("no cumplen con el minimo o maximo de caracteres",resultado.getMessage());
    }
    @Test
    public void validarTelefonoCorrecto(){
        String telefonoPrueba="3152758601";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertTrue(resultado);

    }
    @Test
    public void validarTelefonoIncorrectoPorLongitud(){
        String telefonoPrueba="3152758";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertEquals("telefono con longitud invalida",resultado.getMessage());

    }
    @Test
    public void validarTelefonoIncorrectoPorLetras(){
        String telefonoPrueba="2s df";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefono((telefonoPrueba)));
        Assertions.assertEquals("telefono con longitud invalida",resultado.getMessage());

    }


}