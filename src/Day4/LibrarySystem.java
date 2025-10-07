package Day4;

class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
class TextBook extends Book{
    int grade;
    TextBook(String title,String author,double price,int grade) {
        super(title,author,price);
        this.grade=grade;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Grade: "+grade);
    }
}
class Magazine extends Book{
    int issueNumber;
    Magazine(String title,String author,double price,int issueNumber) {
        super(title,author,price);
        this.issueNumber=issueNumber;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Issue: "+issueNumber);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book=new TextBook("Alchemist","John Paulo",100,5);
        book.display();
        System.out.println("------------------");
        book=new Magazine(book.title,book.author,book.price,5);
        book.display();
    }
}
