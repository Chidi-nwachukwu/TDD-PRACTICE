package Arithmetics;

public class Arithmetics {

    private int firstNumber;
    private int secondNumber;
    private int sum;
    private int multiple;
    private double division;
    private int minimum;
    private int maximum;
    private int square;
    private int cube;


    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void addNumbers(int firstNumber, int secondNumber) {
        sum = firstNumber + secondNumber;
    }


    public int getSum() {
        return sum;
    }

    public void multiplyNumbers(int firstNumber, int secondNumber) {
        multiple = firstNumber * secondNumber;
    }


    public int getMultiple() {
        return multiple;
    }

    public void divideNumbers(int firstNumber, int secondNumber) {
        division = firstNumber / (secondNumber * 1.0);
    }

    public double getDivision() {
        return division;
    }

    public void setMinimumOfTwoNumbers(int firstNumber, int secondNumber) {
//        int firstNumber = 6;
//        int seconNumber = 8;

        if (firstNumber <= secondNumber)
            minimum = firstNumber;
        else
            minimum = secondNumber;

    }

    public int getMinimum() {
        return minimum;
    }

    public void setmaximumNumberOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber)
            maximum = firstNumber;
        else
            maximum = secondNumber;
    }

    public int getMaximum() {
        return maximum;
    }

    public void calculateSquare(int number) {
        square = number * number;
    }

    public int getSquare() {
        return square;
    }

    public void calculateCube(int number) {
        cube = number * number * number;
    }

    public int getCube() {
        return cube;
    }
}
