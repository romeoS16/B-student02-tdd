package de.ba.experiment.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI,
    // bevor Sie eine KI um Hilfe bitten (siehe README.md).

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }
    @Test
    public void fizzBuzzTest_arrayLengthCorrect(){
        String[] result = FizzBuzz.fizzBuzz(100);
        int length_result = result.length;
        assertEquals(100, length_result);
    }

    @Test
    public void fizzBuzzTest_divisibleByThree(){
        String[] result = FizzBuzz.fizzBuzz(3);
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, result);
    }
    @Test
    public void fizzBuzzTest_divisibleByFive(){
        String[] result = FizzBuzz.fizzBuzz(5);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, result);
    }
    @Test
    public void fizzBuzzTest_divisibleByThreeAndFive(){
        String[] result = FizzBuzz.fizzBuzz(15);
        String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertArrayEquals(expected, result);
    }
    @Test
    public void fizzBuzzTest_onlyNumberAsString() {
        String[] result = FizzBuzz.fizzBuzz(2);
        assertArrayEquals(new String[]{"1", "2"}, result);
    }
    @Test
    public void fizzBuzzTest_zeroTest(){
        String[] result = FizzBuzz.fizzBuzz(0);
        assertArrayEquals(new String[0], result);
    }
    @Test
    public void fizzBuzzTest_negativeTest(){
        String[] result = FizzBuzz.fizzBuzz(-2);
        assertArrayEquals(new String[0], result);
    }
    // TODO: weitere Tests schreiben
}
