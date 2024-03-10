public class TesterClass
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(1,1);
        Fraction f2 = new Fraction(1, 2);
        System.out.println(f1);
        System.out.println(f2);
        //System.out.println(f2.numerator / f2.denominator);
    }
}

/** Class Fraction */
class Fraction
{
    //  instance variables
    private int numerator;
    private int denominator;

    // constructor: set instance variables to default values
    public Fraction()
    {
        int d = 1;
        numerator = d;
        denominator = d;
    }

    // constructor: set instance variables to init parameters
    public Fraction(int initNumerator, int initDenominator)
    {
        numerator = initNumerator;
        denominator = initDenominator;
    }

    public String toString()
    {
        // if the denominator is 1, then just return the numerator
        if (denominator == 1)
        {
            int numerator = 1;
        }
        return numerator + "/" + denominator;
    }
}