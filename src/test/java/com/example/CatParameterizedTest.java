package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class CatParameterizedTest {
    @Mock
    private Feline feline;

        @ParameterizedTest
        @CsvSource({
                "1, 'Мяу'",
                "3, 'Мяу'",
                "10, 'Мяу'"
        })
        void testGetSound(int callCount, String expectedSound) {
            Cat cat = new Cat(feline);

            for (int i = 0; i < callCount; i++) {
                assertEquals(expectedSound, cat.getSound());
            }
        }
    }
