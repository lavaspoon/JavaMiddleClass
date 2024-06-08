package ex.extend;

public class Book extends Item {
    private String author;
    private String isbn;

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + ", isbn:" + this.isbn);
    }

    public Book(String name, Integer price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
}
