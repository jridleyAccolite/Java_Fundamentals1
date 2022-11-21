package part3;

// *** see part3_super_keyword for context ***
public class Animal {
    protected String classification = "part3.Animal";

    public Animal(){
        System.out.println("An animal was created.");
    }

    public void speak(){
        System.out.println("An animal is speaking...");
    }
}
