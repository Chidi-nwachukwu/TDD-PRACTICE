package Arithmetics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {

    @Test
    void testThatFirstNumberCanBeCollected() {
        //given
        Arithmetics arithmetics = new Arithmetics();

        //when
        int firstNumber = 6;
        arithmetics.setFirstNumber(firstNumber);

        //assert
        assertEquals(6, arithmetics.getFirstNumber());
    }

    @Test
    void testThatSecondNumberCanBeCollected() {
        Arithmetics arithmetics = new Arithmetics();

        int secondNumber = 8;

        arithmetics.setSecondNumber(secondNumber);

        assertEquals(8, arithmetics.getSecondNumber());
    }

    @Test
    void testToFindTheSumOfTwoNumbersCollected() {
        Arithmetics arithmetics = new Arithmetics();
        int firstNumber = 6;
        int secondNumber = 8;

        arithmetics.addNumbers(firstNumber, secondNumber);

        assertEquals(14, arithmetics.getSum());

    }

    @Test
    void testTOGetTheMultiplesOfTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();

        int firstNumber = 6;
        int secondNumber = 8;

        arithmetics.multiplyNumbers(firstNumber, secondNumber);

        assertEquals(48, arithmetics.getMultiple());

    }

    @Test
    void testToDivideTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();

        int firstNumber = 6;
        int secondNumber = 8;

        arithmetics.divideNumbers(firstNumber, secondNumber);

        assertEquals(0.75, arithmetics.getDivision());
    }

    @Test
    void testToCheckTheMinimumOfTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();

        int firstNumber = 6;
        int secondNumber = 8;


        arithmetics.setMinimumOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(6, arithmetics.getMinimum());
    }

    @Test
    void testToCheckIfTheSecondNumberCanBeTheSmallestNumber() {
        Arithmetics arithmetics = new Arithmetics();

        int firstNumber = 8;
        int secondNumber = 6;

        arithmetics.setMinimumOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(6, arithmetics.getMinimum());
    }

    @Test
    void testToCheckWhenTwoNumbersAreEqual() {

        Arithmetics arithmetics = new Arithmetics();

        int firstNumber = 6;
        int secondNumber = 6;

        arithmetics.setMinimumOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(6, arithmetics.getMinimum());
    }

    @Test
    void testToCheckTheMaximumOfTwoNumbers() {
        Arithmetics arithmetics = new Arithmetics();
        int firstNumber = 8;
        int secondNumber = 6;

        arithmetics.setmaximumNumberOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(8, arithmetics.getMaximum());
    }

    @Test
    void testToCheckIfTheSecondNumberCanBeTheLargest() {
        Arithmetics arithmetics = new Arithmetics();
        int firstNumber = 6;
        int secondNumber = 8;

        arithmetics.setmaximumNumberOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(8, arithmetics.getMaximum());
    }

    @Test
    void testToGetTheSquareOfANumber() {
        Arithmetics arithmetics = new Arithmetics();
        int number = 8;


        arithmetics.calculateSquare(number);
        assertEquals(64, arithmetics.getSquare());


    }

    @Test
    void testToCheckIfTheSquareOfANegativeNumberCanGiveYouAPositiveNumber() {
        Arithmetics arithmetics = new Arithmetics();
        int number = -4;

        arithmetics.calculateSquare(number);
        assertEquals(16, arithmetics.getSquare());


    }

    @Test
    void testToCheckIfTheSquareOfZeroIsZero() {
        Arithmetics arithmetics = new Arithmetics();
        int number = 0;

        arithmetics.calculateSquare(number);
        assertEquals(0, arithmetics.getSquare());
    }

    @Test
    void testToGetCubeOfANumber() {
        Arithmetics arithmetics = new Arithmetics();
        int number = 2;

        arithmetics.calculateCube(number);
        assertEquals(8, arithmetics.getCube());

    }

    @Test
    void testToCheckForANegativeNumberOfACube() {
        Arithmetics arithmetics = new Arithmetics();
        int number = 4;

        arithmetics.calculateSquare(number);
        assertEquals(16, arithmetics.getSquare());


    }

}