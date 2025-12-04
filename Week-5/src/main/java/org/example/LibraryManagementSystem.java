package org.example;

import java.util.ArrayList;

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    LibraryManagementSystem(){
    }

//    static {
//        addBook("ISBN001","java programming","harish karri");
//        addBook("ISBN002","DSA","arun");
//    }

    public static void addBook(String isbn, String title, String author){
        if(isbn == null || title==null || author==null){
            throw new IllegalArgumentException("All fields are important to fill");
        }
        if(books!=null){
            for(Book book:books){
                if(book.getIstbn().equals(isbn)){
                    System.out.println("already exits ");
                    return;
                }
            }
        }
        Book newBook = new Book(isbn,title,author);
        books.add(newBook);
        System.out.println("successfully added ");
    }

    public static void removeBook(String isbn){
        if (isbn==null){
            throw new IllegalArgumentException("isbn cannot be null");
        }
        if(books.isEmpty()){
            throw new IllegalArgumentException("there is no book to remove ");
        }
        for(int i=0;i<books.size();i++){
            if(books.get(i).getIstbn().equals(isbn)){
                books.remove(i);
                System.out.println("suceessfully removed the book " + isbn);
                return;
            }
            return;
        }
        System.out.println("book not found :" +isbn);
    }

    public static void searchBook(String title){
        if (title==null) throw new IllegalArgumentException("title cannot be null");
        ArrayList<Book> results =new ArrayList<>();
        for(Book book:books){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                results.add(book);
            }
        }
        if (results.isEmpty()){System.out.println("no book contain with the title given : " + title);
        } else {
            results.stream().forEach(book -> {
                System.out.println("book id :" + book.getIstbn());
                System.out.println("book title :" + book.getTitle());
                System.out.println("book author :" + book.getAuthor());
            });
        }
    }

    public static Book searchByISBN(String isbn){
        if (isbn==null) throw new IllegalArgumentException("ISBN cannot be null");
        for(Book book:books ){
            if (book.getIstbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public static boolean checkavailability(String isbn) throws BookNotFoundException {
        if (isbn==null) throw new IllegalArgumentException("ISBN cannot be null");
        Book book = searchByISBN(isbn);
        if (book == null){
            throw new BookNotFoundException("book with isbn number does not found ");
        }else {
            System.out.println("Book details");
            if (!book.isAvailable()){
                System.out.println("book is available for you");
            }else {
                System.out.println("book is borrowed by someone else : ");
                System.out.println("borrowed by : " + book.getBorrowedBy());
            }
            System.out.println("book id :" + book.getIstbn());
            System.out.println("book title :" + book.getTitle());
            System.out.println("book author :" + book.getAuthor());
            return false;
        }
    }

    public static void dispalyAllBooks(){
        System.out.println("Dispaly All Books : ");
        books.stream().forEach(book -> {
            System.out.println("book id :" + book.getIstbn());
            System.out.println("book title :" + book.getTitle());
            System.out.println("book author :" + book.getAuthor());
        });
    }

    public static void dispalyAvailableBooks(){
        books.stream().forEach(book -> {
            if(book.isAvailable()){
                System.out.println("book id :" + book.getIstbn());
                System.out.println("book title :" + book.getTitle());
                System.out.println("book author :" + book.getAuthor());
            }
        });
    }
    public static void displaySingleBook(Book book){
        if(book==null) {
            throw new IllegalArgumentException("book is null");
        }
        System.out.println("book id :" + book.getIstbn());
        System.out.println("book title :" + book.getTitle());
        System.out.println("book author :" + book.getAuthor());
    }

    public static void show() throws BookNotFoundException {
        while (true){
            System.out.println("1.add new book");
            System.out.println("2.remove book");
            System.out.println("3.search book");
            System.out.println("4.check Availability");
            System.out.println("5.display all books");
            System.out.println("6.display all available books");
            System.out.println("7.exit");
            int option = Common.getValidInteger("Enter your option here : ");
            switch (option){
                case 1:
                    String bookTile=Common.getValidString("Enter a book title : ");
                    String bookAuthor = Common.getValidString("Enter a book author : ");
                    String bookISBN = Common.getValidStringAndNumber("Enter a ISBN");
                    addBook(bookISBN,bookTile,bookAuthor);
                    break;
                case 2:
                    String isbn = Common.getValidStringAndNumber("Enter a book ISBN : ");
                    removeBook(isbn);
                    break;
                case 3:
                    String isbnForSearch = Common.getValidStringAndNumber("Enter a book ISBN : ");
                    Book book = searchByISBN(isbnForSearch);
                    displaySingleBook(book);
                    break;
                case 4:
                    String isbnForAvailability = Common.getValidStringAndNumber("Enter a book ISBN : ");
                    System.out.println(isbnForAvailability +" -------");
                    checkavailability(isbnForAvailability);
                    break;
                case 5:
                    dispalyAllBooks();
                    break;
                case 6:
                    dispalyAvailableBooks();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("choose valid option.....");
            }
        }
    }
}
