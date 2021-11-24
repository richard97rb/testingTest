package com.njug.junitsdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaDeServicioDeCalculadora {

    @Autowired
    ServicioDeCalculadora calculadoraServicio;

    @Test
    public void pruebaDeSuma() {
        System.out.println("pruebaDeSuma");
        int a = 3;
        int b = 4;

        int resultado = calculadoraServicio.sumar(a, b);

        assertEquals(7, resultado);
    }
}
