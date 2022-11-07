/*
Create a class Book with the data members bno,bname,price.
Create a class SpecialEditionBook which is subclass of Book and with a data member
discount. Create a class BookTest with main() to test the above classes
Note
- Use constructors to give the values to the data members
- create a method display() in Book class which displays bno,bname and price
and override the same display() of Book class in SpecialEditionBook which displays
bno,bname,price using super.display() and display the value of discount.
 */

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
        System.out.println("\nBook details:\nBook Number: " + getNo() + "\nBook Name: " + this.getName() +
                "\nBook Price: £" + this.price);
    }
}

class SpecialEditionBook extends Book{
    private float discount;

    public SpecialEditionBook(int number, String name, float price, float discount){
        super(number, name, price);
        this.discount = discount;
    }

    public float getDiscount(){ return this.discount; }

    @Override
    public void display(){
        super.display();
        System.out.println("Discount: " + getDiscount() + "%\nValue of Discount: £" +
                (getPrice() * (getDiscount() / 100.0f)) + "\nPrice After Discount: £" + (getPrice() -
                (getPrice() * (getDiscount() / 100.0f))));
    }
}

class BookTest {
    public static void main(String[] args){
        Book book1 = new Book(1, "The Complete Works of Shakespeare", 20.0f);
        SpecialEditionBook book2 = new SpecialEditionBook(2, "The Great Gatsby", 15, 60);
        SpecialEditionBook book3 = new SpecialEditionBook(3, "Intro to Java", 200, 5);

        book1.display();
        book2.display();
        book3.display();
    }
}
