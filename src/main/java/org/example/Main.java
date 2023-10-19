package org.example;


import org.example.entidades.Afiliado;
import org.example.entidades.ExamenesGenerales;
import org.example.entidades.SignoVital;
import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Afiliado afiliado = new Afiliado();


        Scanner entradaTeclado = new Scanner(System.in);


        System.out.println("Digita el id del usuario");
        afiliado.setId(entradaTeclado.nextInt());

        System.out.println("digita el nombre del usuario");
        afiliado.setNombres(entradaTeclado.nextLine());

        System.out.println("digita el apellido del usuario");
        afiliado.setApellidos(entradaTeclado.nextLine());

        System.out.println("digite el documento");
        afiliado.setDocumento(entradaTeclado.nextLine());

        System.out.println("digita la ciudad");
        afiliado.setCiudad(entradaTeclado.nextInt());

        System.out.println("digite el departamento");
        afiliado.setDepartamento(entradaTeclado.nextInt());

        System.out.println("digite el correo electronico");
        afiliado.setCorreoElectronico(entradaTeclado.nextLine());

        System.out.println("Digite el teléfono");
        afiliado.setTelefono(entradaTeclado.nextLine());


        ExamenesGenerales ExamenesGenerales = new ExamenesGenerales();


        System.out.println("Digita el id del Examen");
        afiliado.setId(entradaTeclado.nextInt());

        System.out.println("digite el nombre del examen");
        ExamenesGenerales.setNombreExamen(entradaTeclado.nextLine());

        System.out.println("Digite la fecha del examen");
        //ExamenesGenerales.setFechaExamen(entradaTeclado.);

        System.out.println("Inserte la imagen del examen");
        ExamenesGenerales.setImagenExamen(entradaTeclado.nextLine());


        SignoVital SignoVital = new SignoVital();


        System.out.println("Digita el id del SignoV");
        SignoVital.setId(entradaTeclado.nextInt());

        System.out.println("digite el nombre del SignoV");
        SignoVital.setNombre(entradaTeclado.nextLine());

        System.out.println("Digite la Unidad de medida");
        SignoVital.setUnidadMedida(entradaTeclado.nextInt());

    }
}







       /*//escribir un id en el objeto afiliado
        afiliado.setId(-15);
        afiliado.setDocumento("1037073201");
        afiliado.setNombres("mateo");
        afiliado.setApellidos("zuluaga");
        afiliado.setFechaNacimiento(LocalDate.now());
        afiliado.setCiudad(1);
        afiliado.setCorreoElectronico("mateo@gmail.com");
        afiliado.setTelefono("5227757");

        SignoVital SignoVital=new SignoVital();
        SignoVital.setId(-13);
        SignoVital.setNombre("Kevin");
        SignoVital.setUnidadMedida(2);
        SignoVital.setMaximoNormal(3.50);
        SignoVital.setMinimoNormal(2.45);
        SignoVital.setFechaMedida(LocalDate.now());

        ExamenesGenerales ExamenesGenerales=new ExamenesGenerales();
        ExamenesGenerales.setId(-12);
        ExamenesGenerales.setNombreExamen("Resultados");
        ExamenesGenerales.setFechaExamen(LocalDate.now());
        ExamenesGenerales.setDiagnostico("esta de muerte");
        ExamenesGenerales.setImagenExamen("vuelve");*/

       /* ValidacionAfiliado validacionAfiliado = new ValidacionAfiliado();
        validacionAfiliado.trabajarFechas(); --  trabajo de clase con las fechas
        /*
        */
