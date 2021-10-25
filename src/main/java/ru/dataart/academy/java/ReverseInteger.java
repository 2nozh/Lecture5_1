package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * 1463847412>input
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) throws OutOfRangeError {
        //Task implementation
        //output is for result
        long input = inputNumber;
        long output = 0;
        //temp is for storing negative value if input<0
        int temp = 1;
        //case checks, if input is negative
        //if so, input flips and its minus "stores" in temp

        if (input < 0) {
            input = input * -1;
            temp = -1;
        }
        //cycle keeps on dividing input by 10, writing residue as a result
        do {
            output = output * 10 + input % 10;
            input = input / 10;
        } while (input > 0);
        //returning possible minus
        output = output * temp;

        if ((Integer.MIN_VALUE < output) && (output < Integer.MAX_VALUE)) {
            return (int) output;
        } else {
            throw new OutOfRangeError("Out of range");
        }
    }
}
