/**
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Team Number: 6
 * Members:
 * Ang, Julienne - 2232357
 * Angobung, Charles Jacob - 2232594
 * Bacasen, Katelyn Ann - 2212033
 * Dacanay, Kurt Jonas - 2232981
 * Nonato, Marius Glenn - 2232731
 * Santos, Lourdene Eira - 2233120
 * <p>
 * CLASS CODE & Schedule: 9301 CS 122 7:30 - 8:30 & 9:00 - 10:30 TF
 * Date of Programming: March-1-2023
 * Activity Name: Midterm Project 1
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * The Fraction class is a template for a fraction that has the form: numerator/denominator.
 * <p>
 * Authors:
 * @author Ang, Julienne
 * @author Angobung, Charles Jacob
 * @author Bacasen, Katelyn Ann
 * @author Dacanay, Kurt Jonas
 * @author Nonato, Marius Glenn
 * @author Santos, Lourdene Eira
 */
package prog2_prelimgroup06;

import prog2.midgroup06.ZeroDenominatorException;

public class Fraction {
    // Declare the objects for Fraction class.
    /**
     * Holds the numerator of this fraction.
     */
    private int numerator;

    /**
     * Holds the denominator of this fraction.
     */
    private int denominator;

    /**
     * Default No-Argument Constructor that creates a fraction with numerator = 0 and denominator = 1 by default.
     */
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    } // end of Fraction default constructor

    /**
     * Constructor that creates a Fraction x / 1 if the only argument given is a whole number. <br>
     *
     * @param wholeNumVal sets an entered value of a number to the Fraction's whole number
     */
    public Fraction(int wholeNumVal) {
        this.numerator = wholeNumVal;
        denominator = 1;
    } // end of Fraction constructor

    /**
     * Constructor that creates a Fraction from the two given integer values for numerator and denominator. <br>
     *
     * @param numerator   sets an entered value of numerator to the Fraction's numerator
     * @param denominator sets an entered value of denominator to the Fraction's denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    } // end of Fraction constructor

    /**
     * Accessor/Getter Method to get the numerator value of the fraction. <br>
     *
     * @return the value of the numerator of this fraction
     */
    /*
       Algorithm:
       1. Return the numerator of the fraction.
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Accessor/Getter Method to get the denominator value of the fraction. <br>
     *
     * @return the value of the denominator of this fraction
     */
    /*
       Algorithm:
       1. Return the denominator of the fraction.
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * Mutator/Setter Method to set the numerator value of the fraction. <br>
     *
     * @param numerator sets the value of the numerator of this fraction to numerator
     */
    /*
       Algorithm:
       1. Accept the numerator as input from the user.
       2. Set the numerator of the fraction to the entered value.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Mutator/Setter Method to set the denominator value of the fraction. <br>
     *
     * @param denominator sets the value of the denominator of this fraction to denominator
     */
    /*
       Algorithm:
       1. Accept the denominator as input from the user.
       2. Set the denominator of the fraction to the entered value.
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Method to return the fraction object as a string form. <br>
     *
     * @return string form of the fraction of the format numerator/denominator
     */
    /*
        Algorithm:
        1. If denominator of Fraction is equal to 1, the program does the following:
           - Display the numerator only
        2. If the numerator of Fraction is equal to 0, the program does the following:
           - Display the whole part only
        3. If neither applies, the program does the following:
           - Display the Fraction in the form: numerator/denominator
     */
    public String toString() {
        // If denominator is 1, return only the numerator
        if (this.getDenominator() == 1)
            return String.valueOf(this.getNumerator());

            // If numerator is 0, return only 0
        else if (this.getNumerator() == 0)
            return String.format("%d", 0);

            // Otherwise, return the entire representation of the fraction.
        else return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    } // end of the toString override method

    /**
     * Method to get the decimal equivalent of the fraction. <br>
     *
     * @return rounded of decimal equivalent of the fraction in double format
     */
    /*
        Algorithm:
        1. Convert the numerator and the denominator into a double data type.
        2. Divide the numerator to the denominator to get its decimal equivalent.
    */
    public double toDouble() {
        double decimal = (double)this.numerator / (double)this.denominator;
        return Math.round(decimal*100.0) /100.0;
    }

    /**
     * Method to add the Fraction and the other. <br>
     *
     * @param other other Fraction to add with
     * @return sum of a Fraction and another Fraction
     * @throws ZeroDenominatorException
     */
    /*
        Algorithm:
        1. Find the commonDenominator of the 2 fractions by declaring the leastCommonMultiple method.
        2. Find the numerator of each fraction.
           - Multiply the first numerator to the quotient of the commonDenominator and the first denominator.
           - Multiply the second numerator to the quotient of the commonDenominator and the second denominator.
        3. Find the addedNumerator by adding the 2 new numerators computed.
        4. Declare "sum" as a Fraction variable with addedNumerator and commonDenominator as its parameters.
        5. Call the reduceFraction method.
        6. Return the "sum" variable.
    */
    public Fraction add(Fraction other) throws ZeroDenominatorException {
        int commonDenominator = this.computeLCM(this.denominator, other.denominator);
        int numerator1 = this.numerator * (commonDenominator / this.denominator);
        int numerator2 = other.numerator * (commonDenominator / other.denominator);
        int addedNumerator = numerator1 + numerator2;
        Fraction sum = new Fraction(addedNumerator, commonDenominator);
        sum.reduceFraction();
        return sum;
    }

    /**
     * Method to subtract the Fraction and the other. <br>
     *
     * @param other other Fraction to subtract with
     * @return difference of a Fraction and another Fraction
     */
    /*
        Algorithm:
        1. Find the commonDenominator of the 2 fractions by declaring the leastCommonMultiple method.
        2. Find the numerator of each fraction.
           - Multiply the first numerator to the quotient of the commonDenominator and the first denominator.
           - Multiply the second numerator to the quotient of the commonDenominator and the second denominator.
        3. Find the subtractedNumerator by subtracting the 2 new numerators computed.
        4. Declare "difference" as a Fraction variable with subtractedNumerator and commonDenominator as its parameters.
        5. Call the reduceFraction method.
        6. Return the "difference" variable.
    */
    public Fraction subtract(Fraction other) {
        int commonDenominator = this.computeLCM(this.denominator, other.denominator);
        int numerator1 = this.numerator * (commonDenominator / this.denominator);
        int numerator2 = other.numerator * (commonDenominator / other.denominator);
        int subtractedNumerator = numerator1 - numerator2;
        Fraction difference = new Fraction(subtractedNumerator, commonDenominator);
        difference.reduceFraction();
        return difference;
    }

    /**
     * Method to multiply the Fraction and the other. <br>
     *
     * @param other another Fraction to multiply with
     * @return product of a Fraction and another Fraction
     */
    /*
        Algorithm:
        1. Declare "product" as a Fraction variable with int numerator and int denominator.
        2. Multiply the value of Fraction numerator to the other numerator.
        3. Multiply the value of Fraction denominator to the other denominator.
        4. return the "product" variable.
    */

    public Fraction multiplyBy(Fraction other) {
        Fraction product = new Fraction();
        product.numerator = this.numerator * other.numerator;
        product.denominator = this.denominator * other.denominator;
        return product;
    }

    /**
     * Method to divide the Fraction and the other. <br>
     *
     * @param other another Fraction that serves as the divisor
     * @return quotient of a Fraction and another Fraction
     * @throws ZeroDenominatorException
     */
    /*
        Algorithm:
        1. Declare "quotient" as a Fraction variable with int numerator and int denominator.
        2. Multiply the value of Fraction numerator to the other denominator.
        3. Multiply the value of Fraction denominator to the other numerator.
        4. return the "quotient" variable.
    */

    public Fraction divideBy(Fraction other)  throws ZeroDenominatorException {
        Fraction quotient = new Fraction();
        quotient.numerator = this.numerator * other.denominator;
        quotient.denominator = this.denominator * other.numerator;
        return quotient;
    } // end of divideBy method

    /**
     * Method to reduce the fraction to its lowest form.
     *
     * @return
     */
    /*
        Algorithm:
        1. Check if the numerator of the fraction is equal to zero. If it is, then the fraction is already
           in its simplest form, so you can skip the rest of the steps.
        2. Find the greatest common divisor (GCD) of the numerator and denominator of the fraction. There
           are different methods to compute the GCD, such as Euclid's algorithm or prime factorization.
        3. Divide both the numerator and denominator of the fraction by their GCD.
        4. Set the new value of the numerator and denominator of the fraction to the results obtained.
    */
    public void reduceFraction(){
        if (getNumerator() != 0) {
            int gcd = computeGCD(numerator, denominator); // determine the greatest common divisor of numerator and denominator
            int newNumerator = numerator / gcd; //compute newNumerator, the numerator of the simplest form of this fraction
            int newDenominator = denominator / gcd; //compute newDenominator, the denominator of the simplest form of this fraction
            setNumerator(newNumerator); // set the value of the new numerator for this fraction
            setDenominator(newDenominator); // set the value of the new denominator for this fraction
        }
    } // end of reduceFraction method

    /**
     * Recursive method for computing the greatestCommonDivisor of the 2 numbers. <br>
     *
     * @param firstNumber receive value assigned to a data member of the first number
     * @param secondNumber receive value assigned to a data member of the second number
     * @return greatest common divisor (gcd) of the first number and second number
     */
    /*
        Algorithm:
        1. If the firstNumber is equal to 0 return secondNumber.
        2. Else make a recursion method by calling the computerGCD method with the following as its parameters:
           - secondNumber modulo '%' by firstNumber
           - firstNumber
    */
    protected static int computeGCD(int firstNumber, int secondNumber) {
        if (firstNumber == 0)
            return secondNumber;
        return computeGCD(secondNumber % firstNumber, firstNumber);
    } // end of computeGCD method

    /**
     * Method for computing the least common multiple of the 2 numbers. <br>
     *
     * @param firstNumber receive value assigned to a data member of the first number
     * @param secondNumber receive value assigned to a data member of the second number
     * @return least common multiplier (lcm) of the first number and second number
     */
    /*
        Algorithm:
        1. return the value of the following formula:
           - firstNumber multiplied by the secondNumber divided by the GCD of the first and second number.
    */
    protected int computeLCM(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber / this.computeGCD(firstNumber, secondNumber);
    } // end of computeLCM method
} // end of Fraction class