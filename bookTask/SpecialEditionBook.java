package bookTask;
// see class bookTask.BookTest

public class SpecialEditionBook extends Book{
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
