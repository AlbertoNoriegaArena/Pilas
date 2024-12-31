package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PilaTest {
    @Test
    void testAdd() {
        Pila pila = new Pila();

        pila.add("primera");
        pila.add("segunda");
        pila.add("tercera");

        // ver que salen en orden(LIFO)
        assertEquals("tercera", pila.get());
        assertEquals("segunda", pila.get());
        assertEquals("primera", pila.get());
        
        // Pila vacia
        assertNull(pila.get());

    }

    @Test
    void testElementosRepetidos() {
        Pila pila = new Pila();

        pila.add("Hola");
        pila.add("Hola");
        pila.add("Hola");

        assertEquals("Hola", pila.get());
        assertEquals("Hola", pila.get());
        assertEquals("Hola", pila.get());
        assertNull(pila.get());
    }
}