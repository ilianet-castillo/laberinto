package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaminoTest {

    @Test
    void testHacer(){
        Camino c1 = new Camino();
        Assertions.assertEquals(7, c1.hacer());
    }

    @Test
    void shouldCaminar(){
        Camino c2 = new Camino();
        Assertions.assertTrue(c2.caminar(4));
        Assertions.assertFalse(c2.caminar(3));
    }

}
