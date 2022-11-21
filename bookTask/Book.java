package bookTask;/*
Create a class bookTask.Book with the data members bno,bname,price.
Create a class bookTask.SpecialEditionBook which is subclass of bookTask.Book and with a data member
discount. Create a class bookTask.BookTest with main() to test the above classes
Note
- Use constructors to give the values to the data members
- create a method display() in bookTask.Book class which displays bno,bname and price
and override the same display() of bookTask.Book class in bookTask.SpecialEditionBook which displays
bno,bname,price using super.display() and display the value of discount.
 */

// see class bookTask.BookTest

public class Book {
    private int bno;
    private String bname;
    private float price;

    public Book(int number, String name, float price){
        this.bno = number;
        this.bname = name;
        this.price = price;
    }

    public int getNo(){ return this.bno; }
    public String getName(){ return this.bname; }
    public float getPrice(){ return this.price; }

    public void display(){
        System.out.println("\nbookTask.Book details:\nbookTask.Book Number: " + getNo() + "\nbookTask.Book Name: " + this.getName() +
                "\nbookTask.Book Price: £" + this.price);
    }
}




