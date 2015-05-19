package com.bol.example

class FizzBuzz {
    List<String> convert(List<Integer> input) {
        input.collect { (it % 3 == 0 ? 'Fizz' : '') + (it % 5 == 0 ? 'Buzz' : '') }
    }
}
