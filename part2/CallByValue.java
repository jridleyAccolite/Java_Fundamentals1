package part2;

public class CallByValue {
    /* In Java, all arguments are passed to functions by value.

    This means that when a variable is passed to a function, what actually happens is a *new* copy
    of that variable is made that is then passed to the function. Therefore, any changes or operations
    made to the variable inside the function will not appear outside. Since the variable is not actually
    being changed, it is just being used to initialise a new, separate value that is then used within
    the function.

    For example:
   */

    public static void changeNumber(int n) {
        // n is a *copy* of the int passed into the function
        n += 1;
        // n has now been incremented by 1, however the original int is unchanged
        System.out.println("within the function, n is: " + n);
    }

    public static void main(String[] args) {
        int a = 1;

        System.out.println("before the function, a is: " + a);

        changeNumber(a);

        System.out.println("after the function, a is: " + a);

        // even though variable a is passed to a function, its value remains unchanged
    }
}
