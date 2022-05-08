package pl.interview.tasks;

public class Main {

    /**
     Created by xciechan
     on 2022-05-06

     The application finds the difference between the sum of the squares
     of the first one hundred natural numbers and the square of the sum.
     */

    public static void main(String[] args) {
        int naturalNumber = 100;
        System.out.println("Difference is equal: " + differenceBetweenSumOfSquaresAndSquareOfSum(naturalNumber));

    }

    public static int differenceBetweenSumOfSquaresAndSquareOfSum (int number){
        int sumOfSquares = 0;
        int squareOfSum = 0;

        for (int i=1; i<=number; i++){
            sumOfSquares = sumOfSquares + i*i;
            squareOfSum = squareOfSum + i;
        }
        squareOfSum = squareOfSum * squareOfSum;

        return squareOfSum - sumOfSquares;
    }

}
