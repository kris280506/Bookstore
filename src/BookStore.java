import java.util.List;

public class BookStore {
    List<Book> books;
    public void sell(Book b){
        int a=b.getAv()-1;
        b.setAv(a);
    }

}
