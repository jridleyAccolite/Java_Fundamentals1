package part3;

// *** see part3_super_keyword for context ***
public class Dog extends Animal {
    protected String classification = "Mammal";

    public Dog(){
        // call the default constructor for an part3.Animal
        super();
        // additional behaviour for creation of part3.Dog class
        System.out.println("part4.A dog was created.");
    }

    public void getClassification(){
        // uses subclasses variable 'classification'
        System.out.println("I am a " + classification);
        System.out.println("I am an " + super.classification);
    }

    @Override
    public void speak(){
        // call the superclasses method speak()
        super.speak();
        // additional subclass behaviour
        System.out.println("WOOF! WOOF!");
    }

}
