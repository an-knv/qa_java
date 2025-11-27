package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {



    @Test
    void eatMeat() {
        assertDoesNotThrow(() ->
        {
            Feline feline = new Feline();
            assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        });
    }

    @Test
    void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittens() {

        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
        assertEquals(5, feline.getKittens(5));
    }

}