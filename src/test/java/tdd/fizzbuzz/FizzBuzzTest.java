package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
/*
    Test Cases:

    1. return normal case
    2. return Fizz if multiple by 3
    3. return Buzz if multiple by 5
    4. return Whizz if multiple by 7

    5. return FizzBuzz if multiple by 3 & 5
    6. return BuzzWhizz if multiple by 5 & 7
    7. return FizzWhizz if multiple by 3 & 7
*/


public class FizzBuzzTest {

    String expectedResult;

    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        //given
        int givenNumber = 1;
        expectedResult = "1";
        FizzBuzz fizzbuzz = new FizzBuzz();

        //when
        String result = fizzbuzz.countOff(givenNumber);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void should_return_fizz_when_count_off_given_multiple_of_3() {
        //given
        int givenNumber = 3;
        expectedResult = "Fizz";
        FizzBuzz fizzbuzz = new FizzBuzz();

        //when
        String result = fizzbuzz.countOff(givenNumber);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void should_return_buzz_when_count_off_given_multiple_of_5() {
        //given
        int givenNumber = 5;
        expectedResult = "Buzz";
        FizzBuzz fizzbuzz = new FizzBuzz();

        //when
        String result = fizzbuzz.countOff(givenNumber);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }


}
