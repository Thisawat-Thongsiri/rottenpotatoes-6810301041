package th.ac.cdti.rottenpotatoes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void returnsNumberAsStringWhenNotDivisibleByThreeOrFive() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void returnsFizzWhenDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void returnsBuzzWhenDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void returnsFizzBuzzWhenDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}
