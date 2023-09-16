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
 * Problem Description:
 * Create a program that facilitates addition, subtraction, multiplication and division of mixed numbers
 * (similar with the first activity) but this time all the inputs/outputs may involve fractions, mixed
 * fractions or combination.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * Inputs:
 * whole number of a mixed fraction
 * numerator of a fraction
 * denominator of a fraction
 * <p>
 * Outputs:
 * sum of two fractions
 * difference of two fractions
 * product of two fractions
 * quotient of two fractions
 * fraction in its lowest terms
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 * The FractionArithmetic Class is the main class that is the super class for the
 * Fraction and MixedFraction subclasses.
 * <p>
 * General Algorithm:
 * 1. Define the FractionArithmetic class with appropriate data members and methods.
 * 2. Define a constructor that takes in the numerator and denominator of a fraction,
 *    as well as the whole number (if any) of a mixed fraction. Store these values as data members.
 * 3. Define a method to convert a mixed fraction to an improper fraction.
 *    This method should take in the whole number, numerator, and denominator, and
 *    return the equivalent improper fraction as a tuple (numerator, denominator).
 * 4. Define a method to reduce a fraction to its lowest terms.
 *    This method should divide the numerator and denominator by their greatest common divisor (GCD).
 *    Use Euclid's algorithm to find the GCD.
 * 5. Define methods to perform the four arithmetic operations (addition, subtraction, multiplication, and division)
 *    on fractions. These methods should take in another fraction as input, perform the appropriate operation, and
 *    return the result as a new FractionArithmetic object in its lowest terms.
 * 6. In each arithmetic method, if either of the fractions is a mixed fraction,
 *    convert it to an improper fraction before performing the operation.
 * 7. Define a method to print the fraction as a string in the form "numerator/denominator".
 *    This method should be used for debugging purposes.
 * 8. Define a method to print the fraction as a mixed fraction string in the form "whole_num numerator/denominator".
 *    This method should be used to display the fraction to the user.
 * 9. Write a main method that creates two FractionArithmetic objects, performs all four arithmetic operations on them,
 *    and displays the results to the user as mixed fraction strings.
 * <p>
 * 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
 * <p>
 *  Authors:
 *  @author Ang, Julienne
 *  @author Angobung, Charles Jacob
 *  @author Bacasen, Katelyn Ann
 *  @author Dacanay, Kurt Jonas
 *  @author Nonato, Marius Glenn
 *  @author Santos, Lourdene Eira
 */
package prog2.midgroup06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractionArithmetic extends JFrame {
    // Declare the objects for FractionArithmetic.
    /**
     * Holds the first fraction label.
     */
    private JLabel firstL;

    /**
     * Holds the second fraction label.
     */
    private JLabel secondL;

    /**
     * Holds the result label.
     */
    private JLabel resultL;

    /**
     * Holds the first fraction text field.
     */
    private JTextField firstTF;

    /**
     * Holds the second fraction text field.
     */
    private JTextField secondTF;

    /**
     * Holds the result text field.
     */
    private JTextField resultTF;

    /**
     * Holds the addition button.
     */
    private RoundRectangleButton addB;

    /**
     * Holds the subtraction button.
     */
    private RoundRectangleButton subtractB;

    /**
     * Holds the multiplication button.
     */
    private RoundRectangleButton multiplyB;

    /**
     * Holds the division button.
     */
    private RoundRectangleButton divideB;

    /**
     * Holds the reduce button for the first fraction.
     */
    private RoundRectangleButton reduceF;

    /**
     * Holds the reduce button for the second fraction.
     */
    private RoundRectangleButton reduceS;

    /**
     * Holds the clear button.
     */
    private RoundRectangleButton clearB;

    /**
     * Holds the exit button.
     */
    private RoundRectangleButton exitB;

    /**
     * Holds the handler of addition button.
     */
    private AddButtonHandler addHandler;

    /**
     * Holds the handler of subtraction button.
     */
    private SubtractButtonHandler subtractHandler;

    /**
     * Holds the handler of multiplication button.
     */
    private MultiplyButtonHandler multiplyHandler;

    /**
     * Holds the handler of division button.
     */
    private DivideButtonHandler divideHandler;

    /**
     * Holds the handler of reduce button of the first fraction.
     */
    private ReduceFirstButtonHandler reduceFHandler;

    /**
     * Holds the handler of reduce button of the second fraction.
     */
    private ReduceSecondButtonHandler reduceSHandler;

    /**
     * Holds the handler of clear button.
     */
    private ClearButtonHandler clearHandler;

    /**
     * Holds the handler of exit button.
     */
    private ExitButtonHandler ebHandler;

    /**
     * Holds the default width.
     */
    private static int WIDTH = 430;

    /**
     * Holds the height width.
     */
    private static int HEIGHT = 450;

    /**
     * Holds the colors used in the GUI of the program.
     */
    static Color pink = new Color(255, 175, 204);
    static Color peach = new Color(255, 229, 212);
    static Color darkPurple = new Color(105, 79, 93);
    static Color lightBlue = new Color(184, 193, 236);
    static Color navy = new Color(58, 79, 122);
    static Color purple = new Color(205, 180, 219);

    /**
     * Constructor that creates the main window of the fraction arithmetic calculator application.
     * It initializes all the GUI components (labels, text fields, buttons) and sets their
     * properties, event handlers, and layout.
     */
    public FractionArithmetic() {
        JLabel headerLabel = new JLabel("Fraction Arithmetic Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
        headerLabel.setForeground(pink);
        headerLabel.setBackground(navy);
        headerLabel.setOpaque(true);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        firstL = new JLabel("Enter the First Fraction: ", SwingConstants.RIGHT);
        firstL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        secondL = new JLabel("Enter the Second Fraction: ", SwingConstants.RIGHT);
        secondL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        resultL = new JLabel("Result: ", SwingConstants.RIGHT);
        resultL.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));

        firstTF = new JTextField(10);
        secondTF = new JTextField(10);
        resultTF = new JTextField(10);
        resultTF.setDisabledTextColor(Color.black);
        resultTF.setEnabled(false);

        addB = new RoundRectangleButton("Add");
        buttonDesign(addB);
        addHandler = new AddButtonHandler();
        addB.addActionListener(addHandler);

        subtractB = new RoundRectangleButton("Subtract");
        buttonDesign(subtractB);
        subtractHandler = new SubtractButtonHandler();
        subtractB.addActionListener(subtractHandler);

        multiplyB = new RoundRectangleButton("Multiply");
        buttonDesign(multiplyB);
        multiplyHandler = new MultiplyButtonHandler();
        multiplyB.addActionListener(multiplyHandler);

        divideB = new RoundRectangleButton("Divide");
        buttonDesign(divideB);
        divideHandler = new DivideButtonHandler();
        divideB.addActionListener(divideHandler);

        reduceF = new RoundRectangleButton("Reduce First Fraction");
        buttonDesign(reduceF);
        reduceFHandler = new ReduceFirstButtonHandler();
        reduceF.addActionListener(reduceFHandler);

        reduceS = new RoundRectangleButton("Reduce Second Fraction");
        buttonDesign(reduceS);
        reduceSHandler = new ReduceSecondButtonHandler();
        reduceS.addActionListener(reduceSHandler);

        clearB = new RoundRectangleButton("Clear");
        buttonDesign(clearB);
        clearHandler = new ClearButtonHandler();
        clearB.addActionListener(clearHandler);

        exitB = new RoundRectangleButton("Exit");
        buttonDesign(exitB);
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);

        setTitle("Fraction Arithmetic Program");

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.add(headerLabel, BorderLayout.CENTER);

        JPanel gridPanel = new JPanel(new GridLayout(7, 2, 13, 10));
        gridPanel.setBackground(lightBlue);
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gridPanel.add(firstL);
        gridPanel.add(firstTF);
        gridPanel.add(secondL);
        gridPanel.add(secondTF);
        gridPanel.add(resultL);
        gridPanel.add(resultTF);
        gridPanel.add(addB);
        gridPanel.add(subtractB);
        gridPanel.add(multiplyB);
        gridPanel.add(divideB);
        gridPanel.add(reduceF);
        gridPanel.add(reduceS);
        gridPanel.add(clearB);
        gridPanel.add(exitB);

        Container pane = getContentPane();
        pane.setBackground(lightBlue);
        pane.setLayout(new BorderLayout());
        pane.add(headerPanel, BorderLayout.NORTH);
        pane.add(gridPanel, BorderLayout.CENTER);

        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } // end of FractionArithmetic constructor

    /**
     * A class that handles the addition of two mixed fractions and displays the result.
     */
     /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String fdata,
           a MixedFraction object first, and three integers firstWholeNumber, firstNumerator, and
           firstDenominator.
        2. Try to get the input string from the first text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the firstWholeNumber,
           firstNumerator, and firstDenominator variables.
        4. Create a new MixedFraction object first using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of theMixedFraction class.
      */
    private class AddButtonHandler implements ActionListener {

        /**
         * Method to handle the action of getting the sum of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "", secondEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null, second = null, result = null;
            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0, secondWholeNumber = 0,
                    secondNumerator = 0, secondDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }

                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);

            } catch (NumberFormatException x){
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (firstDenominator == 0 || secondDenominator == 0) {
                denominatorWarningPanel();
            } else {
                result = first.add(second);
                showResult(result);
            }
        } // end of actionPerformed method
    }// end of AddButtonHandler class

    /**
     * A class that handles the subtraction of two mixed fractions and displays the results.
     */
    /*
        Algorithm:
        1. Get the input for the first mixed fraction from the user.
        2. Parse the input into the whole number, numerator, and denominator
           parts and create a MixedFraction object with them.
        3. Get the input for the second mixed fraction from the user.
        4. Parse the input into the whole number, numerator, and denominator
           parts and create a MixedFraction object with them.
        5. Check for zero denominators. If either denominator is zero, show a warning message.
        6. Subtract the second mixed fraction from the first and store the result in a new MixedFraction object.
        7. Show the result in the output area using the showResult method.
     */
    private class SubtractButtonHandler implements ActionListener {

        /**
         * Method to handle the action of getting the difference of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "", secondEntry = "";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null, second = null, result = null;
            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0, secondWholeNumber = 0,
                    secondNumerator = 0, secondDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if (fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if (fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if (sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if (sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch (NumberFormatException x) {
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (firstDenominator == 0 || secondDenominator == 0) {
                denominatorWarningPanel();
            } else {
                result = first.subtract(second);
                showResult(result);
            }
        } // end of actionPerformed method
    }// end of SubtractButtonHandler class

    /**
     * A class that handles the multiplication of two mixed fractions and displays the result.
     */
    /*
        Algorithm:
        1. Get the input for the first mixed fraction from the text field.
        2. Parse the input into the whole number, numerator, and denominator
        parts and create a MixedFraction object with them.
        3. Get the input for the second mixed fraction from the text field.
        4. Parse the input into the whole number, numerator, and denominator
        parts and create a MixedFraction object with them.
        5. If either denominator is zero, show a warning message.
        6. Multiply the two mixed fractions using the multiplyBy method of the
        MixedFraction class and store the result in a new MixedFraction object.
        7. Show the result in the output area using the showResult method.
     */
    private class MultiplyButtonHandler implements ActionListener{

        /**
         * Method to handle the action of getting the product of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "", secondEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null, second = null, result = null;
            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0, secondWholeNumber = 0,
                    secondNumerator = 0, secondDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (firstDenominator == 0 || secondDenominator == 0) {
                denominatorWarningPanel();
            } else {
                result = first.multiplyBy(second);
                showResult(result);
            }
        } // end of actionPerformed method
    } // end of MultiplyButtonHandler class

    /**
     * Private class that implements the ActionListener interface to handle the action of dividing two fractions.
     */
    /*
        Algorithm:
        1. Initialize variables and objects:
            entry, secondEntry (strings to hold the user input for the two fractions)
            fdata, sdata (arrays of strings to hold the parsed input for the two fractions)
            first, second, result (MixedFraction objects to hold the two fractions
                and their quotient, respectively)
            firstWholeNumber, firstNumerator, firstDenominator, secondWholeNumber,
            secondNumerator, secondDenominator (integers to hold the values of the
                whole number, numerator, and denominator of the two fractions)
        2. Get user input for the two fractions from the text fields firstTF and secondTF.
        3. Parse the input strings using the split method to separate the whole number,
           numerator, and denominator, and store them in the corresponding integer variables.
        4. Create MixedFraction objects for the two fractions using the values
           of the three integers obtained from parsing the input strings.
        5. Check for division by zero errors by checking if either of the two denominators is zero.
           If so, display an error message using JOptionPane.showMessageDialog().
        6. If there are no division by zero errors, divide the first fraction by the second fraction
           using the divideBy() method of the MixedFraction class and store the result in the result variable.
        7. Pass the result variable to the showResult() method to display the quotient in the result text field.
    */
    private class DivideButtonHandler implements ActionListener{

        /**
         * Method to handle the action of getting the quotient of the two fractions.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "", secondEntry="";
            String[] fdata = new String[3];
            String[] sdata = new String[3];
            MixedFraction first = null, second = null, result = null;
            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0, secondWholeNumber = 0,
                    secondNumerator = 0, secondDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);

                secondEntry = secondTF.getText();
                sdata = secondEntry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }
                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (firstDenominator == 0 || secondDenominator == 0) {
                denominatorWarningPanel();
            } else {
                result = first.divideBy(second);
                showResult(result);
            }
        } // end of actionPerformed method
    } // end of DivideButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of reducing the first fraction entered on the graphical user interface (GUI).
     */
    /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String fdata,
           a MixedFraction object first, and three integers firstWholeNumber, firstNumerator, and
           firstDenominator.
        2. Try to get the input string from the first text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the firstWholeNumber,
           firstNumerator, and firstDenominator variables.
        4. Create a new MixedFraction object first using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of the
           MixedFraction class.
     */
    private class ReduceFirstButtonHandler implements ActionListener{

        /**
         * Method to handle the action of reducing the first fraction its lowest terms.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "";
            String[] fdata = new String[3];
            MixedFraction first = null;
            int firstWholeNumber = 0, firstNumerator = 0, firstDenominator = 0;

            try {
                entry = firstTF.getText();
                fdata = entry.split("/|\\s+");
                if(fdata.length == 1) {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = 0;
                    firstDenominator = 1;
                } else if(fdata.length == 2) {
                    firstWholeNumber = 0;
                    firstNumerator = Integer.parseInt(fdata[0]);
                    firstDenominator = Integer.parseInt(fdata[1]);
                } else {
                    firstWholeNumber = Integer.parseInt(fdata[0]);
                    firstNumerator = Integer.parseInt(fdata[1]);
                    firstDenominator = Integer.parseInt(fdata[2]);
                }

                first = new MixedFraction(firstWholeNumber, firstNumerator, firstDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (firstDenominator == 0) {
                denominatorWarningPanel();
            } else {
                first.reduceFraction();
                showResult(first);
            }
        } // end of actionPerformed method
    } // end of ReduceFirstButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of reducing the second fraction entered on the graphical user interface (GUI).
     */
    /*
        Algorithm:
        1. Declare and initialize variables for the input string entry, an array of String sdata,
           a MixedFraction object second, and three integers secondWholeNumber, secondNumerator, and
           secondDenominator.
        2. Try to get the input string from the second text field and split it into an array
           of strings using the regular expression /|\s+.
        3. Check the length of the array to determine whether the input represents a whole number,
           a proper fraction, or a mixed fraction. Assign the appropriate values to the secondWholeNumber,
           secondNumerator, and secondDenominator variables.
        4. Create a new MixedFraction object second using the extracted values.
        5. If the input is not a valid fraction (e.g., if a decimal number is entered), show a warning
           message using a JOptionPane and return from the method.
        6. If the denominator of the fraction is zero, show a warning message using a JOptionPane.
        7. Otherwise, reduce the fraction using the reduceFraction method of the MixedFraction class
           and display the result in the result text field using the toString method of the
           MixedFraction class.
     */
    private class ReduceSecondButtonHandler implements ActionListener{

        /**
         * Method to handle the action of reducing the second fraction its lowest terms.
         *
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e) {
            String entry = "";
            String[] sdata = new String[3];
            MixedFraction second = null;
            int secondWholeNumber = 0, secondNumerator = 0, secondDenominator = 0;

            try {
                entry = secondTF.getText();
                sdata = entry.split("/|\\s+");
                if(sdata.length == 1) {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = 0;
                    secondDenominator = 1;
                } else if(sdata.length == 2) {
                    secondWholeNumber = 0;
                    secondNumerator = Integer.parseInt(sdata[0]);
                    secondDenominator = Integer.parseInt(sdata[1]);
                } else {
                    secondWholeNumber = Integer.parseInt(sdata[0]);
                    secondNumerator = Integer.parseInt(sdata[1]);
                    secondDenominator = Integer.parseInt(sdata[2]);
                }

                second = new MixedFraction(secondWholeNumber, secondNumerator, secondDenominator);
            } catch ( NumberFormatException x ){
                // Show warning panel if decimal number is entered
                warningPanel();
                return;
            }

            if (secondDenominator == 0) {
                denominatorWarningPanel();
            } else {
                second.reduceFraction();
                showResult(second);
            }
        } // end of actionPerformed method
    } // end of ReduceSecondButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of clearing the values of the first and second fraction on the text fields.
     */
    private class ClearButtonHandler implements ActionListener{

        /**
         * Method to handle the action of resetting the three text fields in the GUI to empty strings.
         *
         * @param e the event to be processed
         */
        /*
            Algorithm:
            1. Set the text of the first text field to an empty string.
            2. Set the text of the second text field to an empty string.
            3. Set the text of the result text field to an empty string.
         */
        public void actionPerformed(ActionEvent e){
            firstTF.setText(""); // Set the text of the first text field to an empty string
            secondTF.setText(""); // Set the text of the second text field to an empty string
            resultTF.setText(""); // Set the text of the result text field to an empty string
        } // end of actionPerformed method
    } // end of ClearButtonHandler class

    /**
     * Private class that implements the ActionListener interface. It is responsible for handling
     * the action of exiting the program through termination.
     */
    private class ExitButtonHandler implements ActionListener {

        /**
         * Method to handle the action of closing the program when the user clicks on the "Exit" button.
         *
         * @param e the event to be processed
         */
        /*
            Algorithm:
            1. Call the showExit method.
            2. Terminate the program and close all its windows.
         */
        public void actionPerformed(ActionEvent e){
            showExit();
            System.exit(0);
        } // end of actionPerformed method
    } // end of ExitButtonHandler class

    /**
     * Method that sets the font, background, and foreground colors of the button, and adds
     * a mouse listener to change the button's background color based on the user's mouse hovers.
     *
     * @param button the button to be designed
     */
    /*
         Algorithm:
         1. Set the font of the button to "Helvetica" with a bold style and size of 13.
         2. Set the background color of the button to a pink color.
         3. Set the foreground color of the button to a navy color.
         4. Add a mouse listener to the button.
         5. In the mouseEntered method of the mouse listener:
            a. Set the cursor to a hand cursor.
            b. Set the background color of the button to purple to indicate that the
               button can be clicked.
         6. In the mouseExited method of the mouse listener:
            a. Set the background color of the button back to pink.
            b. Set the foreground color of the button back to navy to indicate that
               the button is no longer being hovered over.
     */
    private static void buttonDesign(RoundRectangleButton button) {
        button.setFont(new Font("Helvetica", Font.BOLD, 13));
        button.setBackground(pink);
        button.setForeground(navy);
        button.addMouseListener(new MouseAdapter() {

            /**
             * Method that changes the cursor to a hand cursor and sets the background
             * color of the button to purple to indicate that the button can be clicked.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button.setBackground(purple); // set a new color when mouse hovers over the button
            } // end of mouseEntered method

            /**
             * Method that sets the background color of the button back to pink and the
             * foreground color back to navy to indicate that the button is no longer being
             * hovered over.
             *
             * @param e the event to be processed
             */
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setBackground(pink);
                button.setForeground(navy);// set back the original color when the mouse leaves the button
            } // end of mouseExited method
        });
    } // end of buttonDesign method

    /**
     * Method that displays a warning dialog box whenever
     * an invalid input is entered by the user.
     */
    /*
       Algorithm:
       1. Display the warning dialog box in a new pane.
       2. Dispose the dialog box once the "Back" button is clicked or when closed by the user
     */
    private static void warningPanel() {
        JDialog warnDialog = new JDialog();
        warnDialog.setTitle("Warning!");
        warnDialog.setModal(true);

        JLabel warningLabel = new JLabel("<html>Invalid input! <br>" +
                "Please enter a valid fraction.</html>", SwingConstants.CENTER);
        warningLabel.setFont(new Font("Helvetica", Font.BOLD, 17));
        warningLabel.setForeground(darkPurple);

        RoundRectangleButton backButton = new RoundRectangleButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                warnDialog.dispose();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        buttonPanel.setBackground(peach);
        buttonPanel.add(backButton);

        JPanel warningPanel = new JPanel(new BorderLayout());
        warningPanel.setBackground(peach);
        warningPanel.add(warningLabel, BorderLayout.CENTER);
        warningPanel.add(buttonPanel, BorderLayout.SOUTH);

        warnDialog.getContentPane().add(warningPanel);
        warnDialog.setSize(360, 150);
        warnDialog.setLocationRelativeTo(null);
        warnDialog.setVisible(true);
        warnDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    } // end of warningPanel method

    /**
     * Method that displays a warning dialog box whenever
     * an invalid denominator value is entered by the user.
     */
    /*
         Algorithm:
         1. Create a new JDialog object.
         2. Set the title of the dialog to "Warning!" using the setTitle method.
         3. Set the modality of the dialog to true using the setModal method.
         4. Create a new JLabel object with the warning message and center it
            using the SwingConstants.CENTER constant. Set the font and foreground
            color of the label.
         5. Create a new button object with the label "Back".
         6. Style the button using the buttonDesign method.
         7. Create an anonymous ActionListener object and attach it to the
            button using the addActionListener method. When the button is clicked,
            the actionPerformed method should dispose of the dialog using the
            dispose method.
         8. Create a new JPanel object for the button and add the button to it.
         9. Create a new JPanel object for the warning message and add the JLabel
            object to it.
         10. Add the button panel to the warning panel using BorderLayout.SOUTH
             and add the warning panel to the dialog's content pane using the
             getContentPane method and the add method with
             the warning panel as an argument.
         11. Set the size of the dialog using the setSize method.
         12. Set the location of the dialog relative to null using the setLocationRelativeTo method.
         13. Make the dialog visible using the setVisible method.
         14. Set the default close operation of the dialog to DISPOSE_ON_CLOSE using
             the setDefaultCloseOperation method.
     */
    private static void denominatorWarningPanel() {
        JDialog warnDialog = new JDialog();
        warnDialog.setTitle("Warning!");
        warnDialog.setModal(true);

        JLabel warningLabel = new JLabel("<html>Please enter a valid number! <br>" +
                "Denominator cannot be zero for a fraction.</html>", SwingConstants.CENTER);
        warningLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        warningLabel.setForeground(darkPurple);

        RoundRectangleButton backButton = new RoundRectangleButton("Back");
        buttonDesign(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                warnDialog.dispose();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 8));
        buttonPanel.setBackground(peach);
        buttonPanel.add(backButton);

        JPanel warningPanel = new JPanel(new BorderLayout());
        warningPanel.setBackground(peach);
        warningPanel.add(warningLabel, BorderLayout.CENTER);
        warningPanel.add(buttonPanel, BorderLayout.SOUTH);

        warnDialog.getContentPane().add(warningPanel);
        warnDialog.setSize(400, 170);
        warnDialog.setLocationRelativeTo(null);
        warnDialog.setVisible(true);
        warnDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    } // end of denominatorWarningPanel method

    /**
     * Method to print an introduction statement that displays information about the purpose
     * of the program and guidelines for the user.
     */
    /*
       Algorithm:
       1. Display an introduction statement of the program in a new pane.
       2. Dispose the dialog box once the "Next" button is clicked or when closed by the user
     */
    public static void showIntroduction() {
        JDialog introDialog = new JDialog();
        introDialog.setTitle("Fraction Arithmetic Program");
        introDialog.setModal(true);

        JLabel headerLabel = new JLabel("Fraction Arithmetic Application", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 22));
        headerLabel.setForeground(pink);
        headerLabel.setBackground(navy);
        headerLabel.setOpaque(true);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel introLabel = new JLabel("<html>Welcome! This program shows the computation result of the<br>" +
                "addition, subtraction, multiplication, and division of a fraction.<br><br>" +
                "You are required to enter the values of two fractions or mixed fractions and " +
                "buttons are provided from which you can choose to perform arithmetic operations " +
                "such as add, subtract, multiply and divide the fractions. You can also choose to " +
                "reduce a specific fraction, clear the input box, and quit from the application program.</html>",
                SwingConstants.CENTER);
        introLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        introLabel.setForeground(navy);
        introLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        RoundRectangleButton nextButton = new RoundRectangleButton("Next");
        buttonDesign(nextButton);
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                introDialog.dispose();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        buttonPanel.setBackground(navy);
        buttonPanel.add(nextButton);

        JPanel introPanel = new JPanel(new BorderLayout());
        introPanel.setBackground(lightBlue);
        introPanel.add(headerLabel, BorderLayout.NORTH);
        introPanel.add(introLabel, BorderLayout.CENTER);
        introPanel.add(buttonPanel, BorderLayout.SOUTH);

        introDialog.getContentPane().add(introPanel);
        introDialog.setSize(615, 380);
        introDialog.setLocationRelativeTo(null);
        introDialog.setVisible(true);
        introDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    } // end of showIntroduction method

    /**
     * Method to display the result of performing arithmetic operations on two fractions.
     */
    /*
        Algorithm:
        1. Convert the MixedFraction object result to a decimal value using the toDouble() method and
           assign the value to decimalResult.
        2. Format decimalResult to 2 decimal places and assign the value to formattedResult using
           the String.format() method.
        3. Check the components of result MixedFraction object using if-else statements:
            If the denominator is equal to 1, format the result as a whole number and
                assign the value to stringResult using the String.format() method.
            Else if the numerator is equal to 0, format result as a whole number and
                assign the value to stringResult using the String.format() method.
            Else if the whole number is equal to 0, format result as a fraction and
                assign the value to stringResult using the String.format() method.
            Else, format result as a mixed fraction and assign the value to stringResult
                using the String.format() method.
        4. Set the text of resultTF text field to stringResult concatenated with " ~ " and
                formattedResult using the setText() method.
    */
    private void showResult(MixedFraction result) {
        double decimalResult = result.toDouble();
        String formattedResult = String.format("%.2f", decimalResult);
        String stringResult;

        if (result.getDenominator() == 1) {
            stringResult = String.format("%d", result.getNumerator() + result.getWhole());
        } else if (result.getNumerator() == 0) {
            stringResult = String.format("%d", result.getWhole());
        } else if (result.getWhole() == 0) {
            stringResult = String.format("%d/%d", result.getNumerator(), result.getDenominator());
        } else {
            stringResult = String.format("%d %d/%d", result.getWhole(), result.getNumerator(), result.getDenominator());
        }

        resultTF.setText(stringResult + " ~ " + formattedResult);
    } // end of showResult method

    /**
     * Method to display the program closing statement.
     */
    /*
       Algorithm:
       1. Display the program closing statement in a new pane.
       2. Dispose the dialog box when closed by the user
       3. Terminate the program.
     */
    private void showExit() {
        JDialog exitDialog = new JDialog(this, "Fraction Arithmetic Program", true);

        JLabel exitL = new JLabel("Thank you for using the program!", SwingConstants.CENTER);
        exitL.setFont(new Font("Helvetica", Font.BOLD, 20));
        exitL.setForeground(pink);

        JPanel exitPanel = new JPanel(new BorderLayout()); // use BorderLayout for exitPanel
        exitPanel.setBackground(navy);
        exitPanel.add(exitL, BorderLayout.CENTER); // add exitL to the center of exitPanel

        exitDialog.getContentPane().add(exitPanel); // add exitPanel to the content pane of exitDialog
        exitDialog.setSize(400, 120);
        exitDialog.setLocationRelativeTo(null);
        exitDialog.setVisible(true);
        exitDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    } // end of showExit method

    /**
     * Method that runs the program, which shows the introduction to the user and initializes
     * calculatorObject as a new FractionArithmetic object.
     */
    /*
        Algorithm:
        1. Call the method "showIntroduction" within the "run" method.
        2. Instantiate a new object of the class "FractionArithmetic" and assign it to
           a variable named "calculatorObject".
    */
    private static void run(){
        showIntroduction();
        FractionArithmetic calculatorObject = new FractionArithmetic();
    } // end of run method

    /**
     * Main method for running the main functionality of the application program.
     *
     * @param args
     */
    /*
        Algorithm:
        1. Invoke the "run" method.
    */
    public static void main(String[] args){
        run();
    } // end of main method
} // end of FractionArithmetic class
