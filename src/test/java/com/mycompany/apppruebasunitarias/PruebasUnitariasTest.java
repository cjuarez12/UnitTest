package com.mycompany.apppruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para los métodos de la clase Utilidades.
 * Cada prueba verifica casos relevantes para garantizar confiabilidad y mantenibilidad del software.
 */
public class PruebasUnitariasTest {

    Funciones util = new Funciones();

    /**
     * Prueba que verifica la concatenación correcta de dos textos.
     * Se espera que el resultado sea la unión exacta de ambos textos.
     */
    @Test
    void concatenarTexto_DosCadenas_ResultadoEsperado() {
        String resultado = util.concatenarTexto("Hola", " mundo");
        assertEquals("Hola mundo", resultado,"❌ Error: El método concatenarTexto no retorna el valor esperado.");
        System.out.println("✅ Prueba concatenarTexto_DosCadenas_ResultadoEsperado ejecutada correctamente");
    }

    /**
     * Prueba que verifica la suma de dos números positivos.
     */
    @Test
    void sumar_DosNumerosPositivos_ResultadoCorrecto() {
        int suma = util.sumar(5, 7);
        assertEquals(12, suma,"❌ Error: La suma de 5 y 7 debería ser 12.");
        System.out.println("✅ Prueba sumar_DosNumerosPositivos_ResultadoCorrecto ejecutada correctamente");
    }

    /**
     * Prueba que verifica la suma cuando uno de los valores es negativo.
     */
    @Test
    void sumar_NumeroPositivoYNegativo_ResultadoCorrecto() {
        int suma = util.sumar(10, -3);
        assertEquals(7, suma,"❌ Error: La suma de 10 y -3 debería ser 7.");
        System.out.println("✅ Prueba sumar_NumeroPositivoYNegativo_ResultadoCorrecto ejecutada correctamente");
    }

    /**
     * Prueba para verificar si un número positivo retorna true.
     */
    @Test
    void esPositivo_NumeroPositivo_RetornaTrue() {
        assertTrue(util.esPositivo(3),"❌ Error: Se esperaba true para un número positivo.");
        System.out.println("✅ Prueba esPositivo_NumeroPositivo_RetornaTrue ejecutada correctamente");
    }

    /**
     * Prueba para verificar si un número negativo retorna false.
     */
    @Test
    void esPositivo_NumeroNegativo_RetornaFalse() {
        assertFalse(util.esPositivo(-5),"❌ Error: Se esperaba false para un número negativo.");
        System.out.println("✅ Prueba esPositivo_NumeroNegativo_RetornaFalse ejecutada correctamente");
    }

    /**
     * Prueba para verificar si cero es considerado positivo (debería ser false).
     */
    @Test
    void esPositivo_Cero_RetornaFalse() {
        assertFalse(util.esPositivo(0),"❌ Error: Se esperaba false para cero.");
        System.out.println("✅ Prueba esPositivo_Cero_RetornaFalse ejecutada correctamente");
    }

    /**
     * Prueba que verifica que obtenerObjetoNulo retorna null.
     */
    @Test
    void obtenerObjetoNulo_RetornaNull() {
        assertNull(util.obtenerObjetoNulo(),"❌ Error: Se esperaba null al llamar obtenerObjetoNulo.");
        System.out.println("✅ Prueba obtenerObjetoNulo_RetornaNull ejecutada correctamente");
    }

    /**
     * Prueba que verifica que obtenerObjetoNoNulo retorna un objeto no nulo.
     */
    @Test
    void obtenerObjetoNoNulo_RetornaObjetoNoNull() {
        assertNotNull(util.obtenerObjetoNoNulo(),"❌ Error: Se esperaba un objeto no nulo.");
        System.out.println("✅ Prueba obtenerObjetoNoNulo_RetornaObjetoNoNull ejecutada correctamente");
    }

    /**
     * Prueba que verifica que obtenerObjeto retorna un objeto no nulo (objeto nuevo).
     */
    @Test
    void obtenerObjeto_RetornaObjetoNoNull() {
        assertNotNull(util.obtenerObjeto(),"❌ Error: Se esperaba un objeto no nulo.");
        System.out.println("✅ Prueba obtenerObjeto_RetornaObjetoNoNull ejecutada correctamente");
    }

    /**
     * Prueba que verifica que obtenerObjetoNoNulo y obtenerObjeto retornan instancias diferentes.
     * Se prueba para evitar accidentalmente retornar siempre el mismo objeto.
     */
    @Test
    void obtenerObjetoNoNulo_y_obtenerObjeto_SonDiferentes() {
        Object obj1 = util.obtenerObjetoNoNulo();
        Object obj2 = util.obtenerObjeto();
        assertNotSame(obj1, obj2,"❌ Error: Se esperaba que obtenerObjetoNoNulo y obtenerObjeto retornaran instancias diferentes.");
        System.out.println("✅ Prueba obtenerObjetoNoNulo_y_obtenerObjeto_SonDiferentes ejecutada correctamente");
    }
}