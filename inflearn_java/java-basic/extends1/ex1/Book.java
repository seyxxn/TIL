package extends1.ex1;

public class Book extends Item{
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        super.print(); // 이렇게하는게 더 효율적
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }

}
