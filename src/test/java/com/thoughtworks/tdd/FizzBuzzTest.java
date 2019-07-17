package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {

    @Test
    public void should_show_Fizz_when_number_is_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(3);

        //then
        assertThat(actual, is("Fizz"));
    }

    @Test
    public void should_show_Buzz_when_number_is_multiple_of_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(5);

        //then
        assertThat(actual, is("Buzz"));
    }

    @Test
    public void should_show_Whizz_when_number_is_multiple_of_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(7);

        //then
        assertThat(actual, is("Whizz"));
    }

    @Test
    public void should_show_FizzBuzz_when_number_is_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(15);

        //then
        assertThat(actual, is("FizzBuzz"));
    }


    @Test
    public void should_show_FizzWhizz_when_number_is_multiple_of_3_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(21);

        //then
        assertThat(actual, is("FizzWhizz"));
    }


    @Test
    public void should_show_BuzzWhizz_when_number_is_multiple_of_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(35);

        //then
        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    public void should_show_FizzBuzzWhizz_when_number_is_multiple_of_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(105);

        //then
        assertThat(actual, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_show_number_when_number_is_not_multiple_of_3_or_5_or_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.eachTime(13);

        //then
        assertThat(actual, is("13"));
    }
}
