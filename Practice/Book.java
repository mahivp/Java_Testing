package Practice;

public class Book {

    String title;
    String author;
    int publicationYear;
    String genre;
    double price;

    public void getTitle() {
        System.out.println("Title of the Book is: " + title);
    }

    public void getAuthor() {
        System.out.println("Author of the Book is: " + author);
    }

    public void getPublicationYear() {
        System.out.println("Publication Year: " + publicationYear);
    }

    public void getGenre() {
        System.out.println("Genre: " + genre);
    }

    public void getPrice() {
        System.out.println("Price: " + price+"Rs");
    }

    public static void main(String[] args) {

        Book myBook = new Book();

        myBook.title = "Harry Potter";
        myBook.author = "J. K. Rowling";
        myBook.publicationYear = 1997;
        myBook.genre = "Fiction";
        myBook.price = 899.25;

        myBook.getTitle();
        myBook.getAuthor();
        myBook.getPublicationYear();
        myBook.getGenre();
        myBook.getPrice();
    }
}

