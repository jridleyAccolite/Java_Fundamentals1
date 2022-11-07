// ** see part4_final_modifier for context**

public class A {
    // final keyword means that this method cannot be overridden in any subclasses
    public final void do_something(){
        System.out.println("Doing something");
    }
}

final class B extends A {
    // error because do_something method in superclass is declared final and can therefore not be overriden
//    @Override
//    public void do_something(){
//        System.out.println("error method");
//    }
}

// error because class B is declared final and can therefore not be extended
//class C extends B {
//    // error class
//}
