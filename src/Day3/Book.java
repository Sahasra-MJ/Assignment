package Day3;

public class Book {
    String title;
    String author;
    double price;
    Book(){
        this.title="";
        this.author="";
        this.price=0;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Alchemist","Paulo Coelho",160);
        Book b3=new Book("Twisted Series","Ana Huang",400);
        b1.display();
        b2.display();
        b3.display();
    }
}
