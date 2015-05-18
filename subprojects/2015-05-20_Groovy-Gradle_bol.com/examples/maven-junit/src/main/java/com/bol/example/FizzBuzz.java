package com.bol.example;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {
    public List<String> convert(List<Integer> input) {
        return input.stream().map(x ->
                        (x % 3 == 0 ? "Fizz" : "") + (x % 5 == 0 ? "Buzz" : "")
        ).collect(Collectors.toList());
    }
}
