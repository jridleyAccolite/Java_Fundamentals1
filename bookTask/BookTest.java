package bookTask;

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(1, "The Complete Works of Shakespeare", 20.0f);
        SpecialEditionBook book2 = new SpecialEditionBook(2, "The Great Gatsby", 15, 60);
        SpecialEditionBook book3 = new SpecialEditionBook(3, "Intro to Java", 200, 5);

        book1.display();
        book2.display();
        book3.display();
    }
}
