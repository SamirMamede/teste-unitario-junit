package com.testesunitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testesunitarios.com.testesunitarios.Retangulo;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalcularArea()
    {
        Retangulo retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 20;

        int resultado = retangulo.calculaArea();

        assertTrue(resultado == resultadoEsperado);

    }
}
