package impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {



    public static void main(String[] args) {
        System.out.printf("" +
                "<>---------<> TEMA 2 <>---------<>\n" +
                "+-------------------------------+\n" +
                "|          Ejercicio 1          |\n"+
                "+-------------------------------+\n");

        System.out.printf("Escribe el precio sin IVA ");

        //Crear el inputstream reader y buffered reader para recoger los datos del teclado
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double precioSinIVA=0.0;
        double precioConIVA=0.0, precioConIVAReducido10=0.0, precioConIVAReducido4=0.0;
        try
        {
            System.out.printf("Valor sin IVA: ");
            precioSinIVA = Double.parseDouble(br.readLine());

            //Operaciones
            precioConIVA = precioSinIVA * 0.21 +precioSinIVA;
            precioConIVAReducido10 = precioSinIVA * 0.10 +precioSinIVA;100
            precioConIVAReducido4 = precioSinIVA * 0.04 +precioSinIVA;

            System.out.println("----------------------------------------------------------------");
            System.out.println ("El precio con IVA general: " +precioConIVA+"€");
            System.out.println ("El precio con IVA reducido 10%: " +precioConIVAReducido10+"€");
            System.out.println ("El precio con IVA reducido 4%: " +precioConIVAReducido4+"€");
            System.out.println ("El precio sin IVA: " +precioSinIVA+"€");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }



}
