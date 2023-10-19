package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionesExamenesGTest {
    ValidacionExamenesG validacionExamenesG;
    @BeforeEach

    public void prepararPruebas() {
        this.validacionExamenesG = new ValidacionExamenesG();
    }
    @Test
    public void validarIdCorrectoDeExamen(){
        Integer idPruebaExamenes=37;
        Boolean resultados= Assertions.assertDoesNotThrow(()->this.validacionExamenesG.validarId(idPruebaExamenes));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarIdIncorrectoExamen(){
        Integer idPruebaExamenes=-97;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenesG.validarId(idPruebaExamenes));
        Assertions.assertEquals("el id no puede ser negativo",resultado.getMessage());
    }
    @Test
    public  void validarNombreCorrectoExamen(){
        String nombrePruebaExamenes="examen de ojos";
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacionExamenesG.validarNombresExamen(nombrePruebaExamenes));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarNombreIncorrectoEPorTipoCaracteresExamen(){
        String nombrePruebaExamenes="Mateo12-5653";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenesG.validarNombresExamen(nombrePruebaExamenes));
        Assertions.assertEquals("el nombre no cumple los parametros",resultado.getMessage());

    }
    @Test
    public void validarNombreIncorrectoPorLongitudExamen(){
        String nombrePruebaExamenes="dfsdfasdasdasdasdsdfdsghdfgjfhfhfghfghjgaxcfgsdfgsdfgsdfgsdfgds" +
                "fgdsfgdsfgdsfgdsfgsdfgfdgfdgdfgdfgsdfgdfgdfsgdsfdfgdfgdfgdfgddsfgdsfgsdfsdasdsadasdasdasdas";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenesG.validarNombresExamen(nombrePruebaExamenes));
        Assertions.assertEquals("el nombre debe tener entre 10 y 150 caracteres",resultado.getMessage());
    }
    @Test
    public void validarImagenCorrecta(){
        String imagenPrueba="157";
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacionExamenesG.validarImagenExamen(imagenPrueba));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarImagenIncorrecta(){
        Integer imagenPruebaIncorrectaPorTamaño=-97;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionExamenesG.validarImagenExamen(String.valueOf(imagenPruebaIncorrectaPorTamaño)));
        Assertions.assertEquals("La imagen no cumple con los parametros",resultado.getMessage());
    }
}
