package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {
    @Mock
    private Feline feline;

    @Test
    void getKittens() {
        assertDoesNotThrow(() ->
        {
            Lion l = new Lion("Самец", feline);
            assertAll(
                    () -> Mockito.when(feline.getKittens()).thenReturn(2),
                    () -> assertEquals(2, l.getKittens())
            );
            assertAll(
                    () -> Mockito.when(feline.getKittens()).thenReturn(5),
                    () -> assertEquals(5, l.getKittens())
            );
        });
    }

    @Test
     void doesHaveMane() {
        assertDoesNotThrow(() ->
        {
            Lion l = new Lion("Самец", feline);
            assertTrue(l.doesHaveMane());
        });
        assertDoesNotThrow(() ->
        {
            Lion l = new Lion("Самка", feline);
            assertFalse(l.doesHaveMane());
        });
        assertThrows(Exception.class,() ->
            new Lion("Пол", feline)
        );
    }

    @Test
    void getFood() {
        assertDoesNotThrow(() ->
        {
            Lion l = new Lion("Самец", feline);
            assertAll(
                    () -> Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("x", "y")),
                    () -> assertEquals(l.getFood(), List.of("x", "y"))
            );
        });
    }
}