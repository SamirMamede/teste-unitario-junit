package com.testesunitarios.com.testesunitarios;

public class App 
{
    public static void main( String[] args ){

        RetanguloTest teste = new RetanguloTest();

        boolean resultado;

        resultado = teste.testCalcularArea();
        System.out.println("Teste calcular área: " + resultado);

        resultado = teste.testCalcularPerimetro();
        System.out.println("Teste calcular perímetro: " + resultado);
    }
}
