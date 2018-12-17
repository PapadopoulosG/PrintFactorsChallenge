package eu.georgiospapadopoulos;

/*
Challenge info:

Write a method named printFactors with one parameter of type int named number.
If number < 1 the method should print "Invalid Value"
The method should print all factors of the given number.
A factor of a number is an integer which divides that number wholly.
 */
public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    
    /**
     * Takes a number and prints all its factors.
     * @param number (int) Number to find factors of.
     */

    private static void printFactors(int number)
    {
        if (number<1)
            System.out.println(INVALID_VALUE_MESSAGE);

        for(int i=1;i<=number;i++)
        {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}
