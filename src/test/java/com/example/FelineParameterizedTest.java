package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void getKittens(int kittensCount) {

            Feline feline = new Feline();
            assertEquals(kittensCount, feline.getKittens(kittensCount));

    }
}