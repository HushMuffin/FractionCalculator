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
 * The MixedFraction class is a template for a fraction that has the form: whole numerator/denominator.
 * <p>
 * Authors:
 * @author Ang, Julienne
 * @author Angobung, Charles Jacob
 * @author Bacasen, Katelyn Ann
 * @author Dacanay, Kurt Jonas
 * @author Nonato, Marius Glenn
 * @author Santos, Lourdene Eira
 */
package prog2.midgroup06;

import prog2_prelimgroup06.Fraction;

public class MixedFraction extends Fraction {
    // Declare the objects for MixedFraction class.
    /**
     * MixedFraction field representing the whole integer part.
     */
    private int whole;
    /**
     * Default Constructor that creates a default construction of the MixedFraction object.
     */
    public MixedFraction() {
        super(0, 1);
        this.whole = 0;
    } // end of MixedFraction default constructor

    /**
     * Constructor similar to the previous, but creates a Mixed Fraction with a specified whole number
     * and a Fraction object as its initial value. <br>
     *
     * @param whole receives the whole number part for the Mixed Fraction
     * @param fraction receives the Fraction part for the Mixed Fraction
     */
    public MixedFraction(int whole, Fraction fraction) {
        setNumerator(fraction.getNumerator());
        setDenominator(fraction.getDenominator());
        this.whole = whole;
    } // end of MixedFraction constructor

    /**
     * Constructor that creates a MixedFraction with a specified whole number, numerator,
     * and denominator as its initial value. <br>
     *
     * @param whole receives the whole number for the Mixed Fraction
     * @param numerator receives the numerator for the Mixed Fraction
     * @param denominator receives the denominator for the Mixed Fraction
     * @throws ZeroDenominatorException
     */
    public MixedFraction(int whole, int numerator, int denominator) throws ZeroDenominatorException {
        super(numerator, denominator);
        this.whole = whole;
    } // end of MixedFraction constructor

    /**
     * Constructor that receives a given Fraction which sets the numerator of a
     * Mixed Fraction to a given numerator of a Fraction and sets the denominator
     * of a Mixed Fraction to a given denominator of a Fraction. <br>
     *
     * @param fraction receives a given Fraction
     */
    public MixedFraction(Fraction fraction) {
        fraction.setNumerator(fraction.getNumerator());
        fraction.setDenominator(fraction.getDenominator());
    } // end of MixedFraction constructor

    /**
     * Mutator/Setter Method that sets a number to the whole number
     * part of a Mixed Fraction. <br>
     *
     * @param whole sets the value of the whole number for a Mixed Fraction
     */
    public void setWholePart(int whole) {
        this.whole = whole;
    } // end of setWholePart method

    /**
     * Mutator/Setter Method that sets the rational part of a MixedFraction. <br>
     *
     * @param fraction receives a Fraction
     */
    public void setFractionPart(Fraction fraction) {
        this.setNumerator(fraction.getNumerator());
        this.setDenominator(fraction.getDenominator());
    } // end of setFractionPart method

    /**
     * Accessor/Getter Method that returns the whole part of the MixedFraction. <br>
     *
     * @return whole of a MixedFraction
     */
    public int getWhole() {
        return whole;
    } // end of getWhole method

    /**
     * Accessor/Getter Method that returns the rational part of the MixedFraction. <br>
     *
     * @return fraction object
     */
    public Fraction getFraction() {
        return new Fraction(this.getNumerator(), this.getDenominator());
    } // end of getFraction method

    /**
     * Method that converts a mixed fraction to an improper fraction.
     */
    public void toFraction() {
        setNumerator(getWhole() * getDenominator() + getNumerator());
        setDenominator(getDenominator());
        setWholePart(0);
    } // end of toFraction method

    /**
     * Method that converts an improper fraction to a mixed fraction.
     */
    public void toMixedFraction() {
        setWholePart(getNumerator() / getDenominator());
        setNumerator(getNumerator() % getDenominator());
    } // end of toMixedFraction method

    /**
     * Method that adds two Mixed Fractions and overrides the add method of Fraction. <br>
     *
     * @param other receives the passed Fraction instance
     * @return sum of a MixedFraction object and a Fraction object
     */
    /*
        Algorithm:
        1. Create a new MixedFraction object to hold this object's improper fraction form
        2. Create a new MixedFraction object to hold the sum.
        3. If both denominators are equal:
           - Set denominator equal to the denominator of the first fraction
           - Add numerators of the current object instance and the passed Fraction other
        4. If both denominators are not equal:
           - Compute the LCM of the denominators
           - Set denominator to the LCM
           - Compute for the sum of the MixedFraction instance and the passed Fraction other
        5. Set numerator of the resulting MixedFraction object
        6. Set denominator of the resulting MixedFraction object
        7. Convert the sum to mixed fraction form
        8. Reduce the fraction to the lowest terms
        9. Return the Fraction sum
     */
    public MixedFraction add(Fraction other) {
        var sum = new MixedFraction();
        int denominator, numerator;
        toFraction();

        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            numerator = getNumerator() + other.getDenominator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            numerator = denominator / getDenominator() * getNumerator()
                    + denominator / other.getDenominator() * other.getDenominator();
        }

        toMixedFraction();
        sum.setNumerator(numerator);
        sum.setDenominator(denominator);
        sum.reduceFraction();
        sum.toMixedFraction();
        return sum;
    } // end of sum override method

    /**
     * Method that adds two Mixed Fractions and overloads the add method of Fraction. <br>
     *
     * @param other receives the passed MixedFraction instance
     * @return sum of two MixedFraction objects
     */
    /*
        Algorithm:
        1. Create a new MixedFraction object to hold this object's improper fraction form
        2. Create a new MixedFraction object to hold the sum
        3. If both denominators are equal:
           - Set denominator equal to the denominator of the first fraction then
           - Add numerators of the current object instance and the passed Fraction other
        4. If both denominators are not equal:
           - Compute the LCM of the denominators
           - Set denominator to the LCM
           - Compute for the sum of the MixedFraction instance and the passed Fraction other
        5. Set the whole number of the resulting MixedFraction instance
           equal to the sum of the passed MixedFraction other's whole
           and this MixedFraction object's whole
        6. Set numerator of the resulting MixedFraction object
        7. Set denominator of the resulting MixedFraction object
        8. Convert the sum into Mixed fraction form
        9. Reduce the sum object to the lowest terms
        10. Return the MixedFraction sum
     */
    public MixedFraction add(MixedFraction other) {
        var sum = new MixedFraction();
        int denominator, numerator;
        toFraction();
        other.toFraction();

        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            numerator = getNumerator() + other.getNumerator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            numerator = denominator / getDenominator() * getNumerator()
                    + denominator / other.getDenominator() * other.getNumerator();
        }

        toMixedFraction();
        other.toMixedFraction();
        sum.setWholePart(this.getWhole() + other.getWhole());
        sum.setNumerator(numerator);
        sum.setDenominator(denominator);
        sum.reduceFraction();
        sum.toMixedFraction();
        return sum;
    } // end of sum overload method

    /**
     * Method that computes for the difference of two Fractions and overrides subtract method. <br>
     *
     * @param other other Fraction to subtract
     * @return difference of this Mixed Fraction and another Fraction
     */
    /*
        Algorithm:
        1. Create a new MixedFraction object to hold this object's improper fraction form
        2. Create a new MixedFraction object to hold the difference
        3. If both denominators are equal:
           - Set denominator equal to the denominator of the first fraction
           - Add numerators of the current object instance and the passed Fraction other
        4. If both denominators are not equal:
           - Compute the LCM of the denominators
           - Set denominator to the LCM
           - Compute for the difference of the MixedFraction instance and the passed Fraction other
        5. Set numerator of the resulting MixedFraction object
        6. Set denominator of the resulting MixedFraction object
        7. Convert the difference to mixed fraction form
        8. Reduce the fraction to the lowest terms
        9. Return the Fraction difference
     */
    public MixedFraction subtract(Fraction other) {
        var subtract = new MixedFraction();
        int denominator, numerator;
        toFraction();

        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            numerator = getNumerator() + other.getDenominator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            numerator = denominator / getDenominator() * getNumerator()
                    - denominator / other.getDenominator() * other.getDenominator();
        }

        toMixedFraction();
        subtract.setNumerator(numerator);
        subtract.setDenominator(denominator);
        subtract.reduceFraction();
        subtract.toMixedFraction();

        return subtract;
    } // end of subtract override method

    /**
     * Method that computes for the difference of two Fractions and overloads subtract method. <br>
     *
     * @param other receives a Mixed Fraction to subtract
     * @return difference of two Mixed Fractions
     */
    /*
        Algorithm:
        1. Create a new MixedFraction object to hold this object's improper fraction form
        2. Create a new MixedFraction object to hold the difference
        3. If both denominators are equal:
           - Set denominator equal to the denominator of the first fraction then
           - Add numerators of the current object instance and the passed Fraction other
        4. If both denominators are not equal:
           - Compute the LCM of the denominators
           - Set denominator to the LCM
           - Compute for the difference of the MixedFraction instance and the passed Fraction other
        5. Set the whole number of the resulting MixedFraction instance
           equal to the difference of the passed MixedFraction other's whole
           and this MixedFraction object's whole
        6. Set numerator of the resulting MixedFraction object
        7. Set denominator of the resulting MixedFraction object
        8. Convert the difference into Mixed fraction form
        9. Reduce the difference object to the lowest terms
        10. Return the MixedFraction difference
     */
    public MixedFraction subtract(MixedFraction other) {
        var subtract = new MixedFraction();
        int denominator, numerator;
        toFraction();
        other.toFraction();
        if (getDenominator() == other.getDenominator()) {
            denominator = getDenominator();
            numerator = getNumerator() - other.getNumerator();
        } else {
            denominator = computeLCM(getDenominator(), other.getDenominator());
            numerator = denominator / getDenominator() * getNumerator()
                    - denominator / other.getDenominator() * other.getNumerator();
        }
        toMixedFraction();
        subtract.setNumerator(numerator);
        subtract.setDenominator(denominator);
        subtract.reduceFraction();
        subtract.toMixedFraction();

        return subtract;
    } // end of subtract overload method

    /**
     * Method that computes the product of a Mixed Fraction and another Fraction, and overrides multiplyBy method. <br>
     *
     * @param other other Fraction to multiply with
     * @return product of a Mixed Fraction and another Fraction
     */
    /*
        Algorithm:
        1. Create a new object to hold Mixed Fraction object
        2. Initialize num as an int variable to hold product of the two numerator
        3. Initialize den as an int variable to hold product of the two denominator
        4. Invoke the setNumerator method to set the value of the product of the numerator
           to the numerator of variable product
        5. Invoke the setDenominator method to set the value of the product of the denominator
           to the denominator of variable product
        6. Return the Fraction product
     */
    public MixedFraction multiplyBy(Fraction other) {
        var product = new MixedFraction();

        int numerator = getNumerator() * other.getNumerator();
        int denominator = getDenominator() * other.getDenominator();

        product.setNumerator(numerator);
        product.setDenominator(denominator);
        product.reduceFraction();
        return product;
    } // end of multiplyBy override method

    /**
     * Method that computes the product of two Mixed Fractions and overloads multiplyBy method. <br>
     *
     * @param other other Mixed Fraction to multiply with
     * @return product of two Mixed Fractions
     */
    /*
        Algorithm:
        1. Create a new object to hold Mixed Fraction object
        2. Initialize variables
        3. Convert the Mixed Fractions to improper Fractions
        4. Compute for the product of the two improper Fractions
        5. Convert the product to a Mixed Fraction
        6. Return the Mixed Fraction product
     */
    public MixedFraction multiplyBy(MixedFraction other) {
        var product = new MixedFraction();
        int numerator, denominator, whole, numerator2, denominator2, whole2;

        whole = getWhole();
        numerator = getNumerator();
        denominator = getDenominator();

        numerator = (whole * denominator) + numerator;

        whole2 = other.getWhole();
        numerator2 = other.getNumerator();
        denominator2 = other.getDenominator();

        numerator2 = (whole2 * denominator2) + numerator2;
        numerator = numerator * numerator2;
        denominator = denominator * denominator2;
        whole = numerator / denominator;
        numerator = numerator % denominator;

        product.setWholePart(whole);
        product.setNumerator(numerator);
        product.setDenominator(denominator);
        product.reduceFraction();
        return product;
    } // end of multiplyBy overload method

    /**
     * Method that computes for the quotient of a Mixed Fraction and other Fraction, and overrides divideBy method. <br>
     *
     * @param other Fraction to divide by
     * @return quotient of a Mixed Fraction and another Fraction
     */
    /*
        Algorithm:
        1. Create a new object to hold Mixed Fraction object
        2. Initialize variables
        3. Convert the Mixed Fractions to improper Fractions
        4. Compute for the quotient of two improper Fractions
        5. Convert the quotient to a Mixed Fraction
        6. Return the Mixed Fraction quotient
     */
    public MixedFraction divideBy(Fraction other) {
        var quotient = new MixedFraction();

        // numerator into improper
        int numerator = (getDenominator() * getWhole()) + getNumerator();
        int denominator;
        int whole;

        // dividing two fractions
        numerator = numerator * other.getDenominator();
        denominator = getDenominator() * other.getNumerator();

        // into mixed fraction
        whole = numerator / denominator;
        numerator = numerator % denominator;

        quotient.setNumerator(numerator);
        quotient.setDenominator(denominator);
        quotient.setWholePart(whole);
        quotient.reduceFraction();

        return quotient;
    } // end of the divideBy override method

    /**
     * Method that computes for the quotient of two Mixed Fractions and overloads divideBy method. <br>
     *
     * @param other other Mixed Fraction to divide by
     * @return quotient of two Mixed Fractions
     */
    /*
        Algorithm:
        1. Create a new object to hold Mixed Fraction object
        2. Initialize variables
        3. Convert the Mixed Fractions to improper Fractions
        4. Compute for the quotient of two improper Fractions
        5. Convert the quotient to a Mixed Fraction
        6. Return the Mixed Fraction quotient
     */
    public MixedFraction divideBy(MixedFraction other) {
        var quotient = new MixedFraction();

        // numerators into improper
        toFraction();
        int numerator = getNumerator();
        other.toFraction();
        int otherNumerator = other.getNumerator();
        int denominator;

        // dividing the two fractions
        numerator = numerator * other.getDenominator();
        denominator = getDenominator() * otherNumerator;

        // into mixed fraction
        if (denominator != 0) {
            quotient.setDenominator(denominator);
            quotient.setWholePart(0);
            quotient.setNumerator(numerator);
            quotient.reduceFraction();
            quotient.toMixedFraction();
        }

        return quotient;
    } // end of the divideBy overload method

    /**
     * Method that overrides toString method. <br>
     *
     * @return string containing the mixed fraction
     */
    /*
        Algorithm:
        1. If whole part of Mixed Fraction is equal to 0, the program does the following:
           - Display the numerator/denominator only
        2. If denominator of Mixed Fraction is equal to 0 or 1, the program does the following:
           - Add the whole part of Mixed Fraction to the numerator of Mixed Fraction
           - Display the result
        3. If the numerator of Mixed Fraction is equal to 0, the program does the following:
           - Display the whole part only
        4. If neither applies, the program does the following:
           - Display the Mixed Fraction in the form: whole numerator/denominator
     */
    public String toString() {
        // If denominator is 0 or 1, return only the sum of whole part and numerator
        if (this.getDenominator() == 1)
            return String.format("%d", this.getNumerator());

            // If numerator is 0, return only the whole part
       else if (this.getNumerator() == 0)
            return String.format("%d", this.getWhole());

        // If whole part is 0, return only the rational part
        else if (this.getWhole() == 0)
            return String.format("%d/%d", this.getNumerator(), this.getDenominator());

        else // Otherwise, return the entire representation of the mixed fraction.
            return String.format("%d %d/%d", this.getWhole(), this.getNumerator(), this.getDenominator());
    } // end of the toString override method

    /**
     * Method that returns the MixedFraction in double format <br>
     *
     * @return double format of a Mixed Fraction
     * @throws ZeroDenominatorException
     */
    public double toDouble() throws ZeroDenominatorException {
        if (this.getDenominator() == 0) {
            throw new ZeroDenominatorException();
        }
        return (this.whole + 1.0 * this.getNumerator() / this.getDenominator());
    } // end of toDouble method
} // end of MixedFraction class