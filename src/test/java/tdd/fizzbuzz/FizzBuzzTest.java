package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

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
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        //given
        int givenNumber = 1;
        FizzBuzzTest fizzbuzz = new FizzBuzzTest();

        //when
        String result = fizzbuzz.countoff(givenNumber);

        //then
        assertThat(result).isEqualTo("1");

    }
}
