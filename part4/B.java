package part4;

final public class B extends A {
    // error because do_something method in superclass is declared final and can therefore not be overriden
//    @Override
//    public void do_something(){
//        System.out.println("error method");
//    }
}

// error because class part4.B is declared final and can therefore not be extended
//class C extends part4.B {
//    // error class
//}

