package prog2.midgroup06;

/**
 * Exception object in case a Fraction object's denominator is set to zero.
 */
public class ZeroDenominatorException extends RuntimeException {
    ZeroDenominatorException() {
        super("Error: You can't define a fraction whose denominator is zero!");
    }
}
