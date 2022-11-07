public class part3_super_keyword {
    /* The keyword 'super' in Java is used to refer to super-classes. When one class inherits
    from another it is said to be a subclass, and the class it inherits from is a superclass.
    The super keyword can be used to access variables or methods of a superclass from within
    a subclass.

    This is particularly useful when a method might be overridden in a subclass, and therefore
    the super keyword is needed to distinguish between the methods in the subclass and superclass
    that share a name. The same can hold true for variables, where variables differ between sub
    and superclasses but may still need to both be accessible within the subclass.

    The super keyword can also be used to call the default constructor for the superclass from
    within the subclass. This can be used when some additional behaviour is needed within the
    subclass constructor, but the core of the superclass constructor is still needed, to avoid
    unnecessary repetition and increase readability.

    For example:
    */

    public static void main(String[] args){
        // see classes 'Animal' and 'Dog' for full example

        Dog dog = new Dog();    // calls Animal constructor from within Dog constructor

        dog.getClassification();    // accesses classification variable from subclass and superclass

        dog.speak();    // calls superclasses speak method and then adds subclass behaviour
    }
}
