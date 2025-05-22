import java.util.ArrayList;

class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String isbn){
        books.removeIf(b -> b.getIsbn().equals(isbn));
    }

    public Book[] searchBook(String title){
        ArrayList<Book> results = new ArrayList<>();
        for (Book b : books){
            if (b.getTitle().equalsIgnoreCase(title)){
                results.add(b);
            }
        }
        return results.toArray(new Book[0]);
    }

    public Book[] displayBooks(){
        return books.toArray(new Book[0]);
    }
}
