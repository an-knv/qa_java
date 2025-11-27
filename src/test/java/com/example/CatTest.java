package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CatTest {
    @Mock
    private Feline feline;

    @Test
    void getSoundTest() {

            Cat cat = new Cat(feline);
            assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFood() {
        Cat cat = new Cat(feline);
        assertAll(
                () -> Mockito.when(feline.eatMeat()).thenReturn(List.of("x", "y", "z")),
                () -> assertEquals(List.of("x", "y", "z"), cat.getFood())
        );
    }
}