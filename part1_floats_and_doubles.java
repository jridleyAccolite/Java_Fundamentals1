public class part1_floats_and_doubles {
    /* Floats and doubles are primitive data types that store numbers with a component after a decimal
    point. They differ in that a float uses 4 bytes (32 bits) to store a value, whilst
    a double uses 8 bytes (64 bits), hence a double has *double* the precision that a float has.

    These data types are comprised of a value representing the sign of the number (+ve or -ve),
    a mantissa (binary representation of the digits of the value as a positive integer) and an
    exponent (2^n) which translates the mantissa to the appropriate scale for the value.
    These data types assign different amounts of space to each of these components. A float assigns
    23 of its 32 bits to the Mantissa and 8 bits to the exponent, whilst a double assigns 52 of its
    64 bits to the Mantissa and 11 bits to the exponent. Both use only 1 bit for the sign (0/1).
    This limited space for each component means that sometimes the Mantissa is truncated if the total
    number of digits exceeds the possible space available.

    Because this data compression is so inherent in float and double, Java truncates any value assigned
    to a float or double with greater precision than this.
    Hence, the following behaviour: */

    public static void main(String[] args){
        float f = 10.1234567890123456789f; // will be truncated to 10.123457
        double d = 10.1234567890123456789; // will be truncated to 10.123456789012346

        System.out.println("10.1234567890123456789 becomes:\n" + f + " as a float\n" + d + " as a double\n");
    }

}
