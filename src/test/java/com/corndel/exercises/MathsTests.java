package com.corndel.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathsTests {
    @Test
    public void positiveMathMax() {

        assertEquals(8.0,Maths.max(3,8));
    }
    @Test
    public void negativeMathMax() {

        assertEquals(-8.0,Maths.max(-93,-8));
    }
    @Test
    public void mixedMathMax() {
        assertEquals(93.0,Maths.max(93,-8));
    }
    @Test
    public void getPi() {
        // act
        double expectedPI = 3.14;

        // assert
        assertEquals(expectedPI,Maths.PI);
    }

    @Test
    public void mathsRoundUP() {
        // arrange
        double expectedRound = 29.67;

        // assert && act
        assertEquals(30,Maths.round(expectedRound));
    }
    @Test
    public void mathsRoundDown() {
        // arrange
        double expectedRound = 29.27;

        // assert && act
        assertEquals(29,Maths.round(expectedRound));
    }
    @Test
    public void mathsFloor() {
        // arrange
        double expectedRound = 2.77;

        // assert && act
        assertEquals(2,Maths.floor(expectedRound));
    }

    @Test
    public void mathsCeil() {
        // arrange
        double expectedRound = 9.1;
        // assert && act
        assertEquals(10,Maths.ceil(expectedRound));
    }


    @Test
    public void absolute() {
        // arrange
        // assert && act
        assertEquals(7,Maths.absolute(-7));
    }
    @Test
    public void positiveabs() {
        // arrange
        // assert && act
        assertEquals(7,Maths.absolute(7));
    }

}
