public class part4_final_modifier {
    /* The 'final' keyword in Java is a non-access modifier that prevents further changes to
    what is assigned to in various ways. For example:

    For variables:
    When final is assigned to a variable, that variable becomes a constant whose value cannot be
    changed.

    For methods:
    When final is assigned to a method, that method cannot be overridden.

    For classes:
    When final is assigned to a class, that class cannot be extended.

    In code:
    */

    public static void main(String[] args){

        final float pi = 3.14159f;  // declaring pi as final means its value cannot be changed

        // uncomment any of the below for an error
        // pi += 1f;
        // pi = 3.14f;

        // for examples of methods and classes see the classes 'A', 'B', and 'C' in A.java
    }
}
