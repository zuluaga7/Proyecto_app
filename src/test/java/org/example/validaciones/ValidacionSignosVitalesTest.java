package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSignosVitalesTest {
   ValidacSignoVital validacSignoVital;
    @BeforeEach
    public void prepararPruebas(){
        this.validacSignoVital=new ValidacSignoVital();
    }
    @Test
  public void ValidarIdCorrectoSignoV(){
        Integer idPruebaSigno=17;
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacSignoVital.validarId(idPruebaSigno));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarIdIncorrectoSignoV(){
        Integer idPruebaSigno=-100;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacSignoVital.validarId(idPruebaSigno));
        Assertions.assertEquals("el id no puede ser negativo",resultado.getMessage());
    }
    @Test
    public  void validarNombrePacienteCorrecto(){
        String nombrePacientePrueba="mateo zuluaga";
        Boolean resultados=Assertions.assertDoesNotThrow(()->this.validacSignoVital.validarNombrePaciente(nombrePacientePrueba));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarNombrePacienteIncorrectoPorTipoCaracteres(){
        String nombrePacientePrueba="Mateo125653";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacSignoVital.validarNombrePaciente(nombrePacientePrueba));
        Assertions.assertEquals("el nombre no cumple los parametros",resultado.getMessage());

    }
    @Test
    public void validarNombrePacienteIncorrectoPorLongitud(){
        String nombrePacientePrueba="dfsdfasdasdasdfdsgfdsfgdfghd" +
                "dfgdfghdfghdfgdfghdfghdfghfdghdfghdfghfghdfghdfghdfghfghfdghd" +
                "fghdsdasdsdfdsghdfgjfhfhfghfghjgasdasdsadasdasdasdas";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacSignoVital.validarNombrePaciente(nombrePacientePrueba));
        Assertions.assertEquals("el nombre debe tener entre 3 y 40 caracteres",resultado.getMessage());
    }
    @Test
    public void validarUnidadDeMedidaCorrecta(){
        Integer idPruebaMedida=21;
        Boolean resultados= Assertions.assertDoesNotThrow(()->this.validacSignoVital.validarId(idPruebaMedida));
        Assertions.assertTrue(resultados);
    }
    @Test
    public void validarUnidadDeMedidaIncorrecto(){
        Integer idPruebaMedida=1;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacSignoVital.validarId(idPruebaMedida));
        Assertions.assertEquals("el id no puede ser negativo",resultado.getMessage());
    }
}
