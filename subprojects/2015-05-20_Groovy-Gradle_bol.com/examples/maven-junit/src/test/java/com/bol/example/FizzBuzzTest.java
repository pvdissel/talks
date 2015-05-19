package com.bol.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzOnMultiplyOfThree() {
        List<Integer> input = Arrays.asList(3, 6, 9, 12, 18, 21);

        List<String> result = new FizzBuzz().convert(input);

        assertEquals(6, result.size());
        assertEquals("Fizz", result.get(0));
        assertEquals("Fizz", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("Fizz", result.get(3));
        assertEquals("Fizz", result.get(4));
        assertEquals("Fizz", result.get(5));
    }

    @Test
    public void buzzOnMultiplyOfFive() {
        List<Integer> input = Arrays.asList(5, 10, 20, 25, 35);

        List<String> result = new FizzBuzz().convert(input);

        assertEquals(5, result.size());
        assertEquals("Buzz", result.get(0));
        assertEquals("Buzz", result.get(1));
        assertEquals("Buzz", result.get(2));
        assertEquals("Buzz", result.get(3));
        assertEquals("Buzz", result.get(4));
    }

    @Test
    public void fizzBuzzOnMultiplyOfBothThreeAndFive() {
        List<Integer> input = Arrays.asList(15, 30, 45, 60, 75);

        List<String> result = new FizzBuzz().convert(input);

        assertEquals(5, result.size());
        assertEquals("FizzBuzz", result.get(0));
        assertEquals("FizzBuzz", result.get(1));
        assertEquals("FizzBuzz", result.get(2));
        assertEquals("FizzBuzz", result.get(3));
        assertEquals("FizzBuzz", result.get(4));
    }
}
