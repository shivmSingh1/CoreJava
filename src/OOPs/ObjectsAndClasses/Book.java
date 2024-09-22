package OOPs.ObjectsAndClasses;

public class Book {
    String title;
    String Author;
    int isbn;
    boolean isAvailable=true;
    static int totalBooks;

    static{
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    Book(String title,String Author,int isbn){
        this.title="MeraBharat";
        this.Author="Shivam singh";
        this.isbn=isbn;
    }

    Book(int isbn){
        this("unknown","unknown",isbn);
    }



    void borrowBook(){
        if(isAvailable) {
            System.out.println("Book is borrowed by id "+this.isbn +" "+ this.title);
            isAvailable = false;
        }else {
            System.out.println("Book is not available "+this.isbn +" "+ this.title);
        }
    }

    void returnBook(){
        if(isAvailable){
            System.out.println("book is already in library "+this.isbn +" "+ this.title);
        }else {
            System.out.println("book is returned "+this.isbn +" "+ this.title);
            isAvailable = true;
        }
    }

    public static void main(String[] args) {
        Book myBook1 = new Book(1);
        Book myBook2= new Book(2);
        Book myBook3= new Book(3);
        myBook1.borrowBook();
        myBook2.borrowBook();
        myBook2.borrowBook();
        myBook1.returnBook();
        myBook1.returnBook();
        System.out.println(Book.totalBooks);
    }

}
