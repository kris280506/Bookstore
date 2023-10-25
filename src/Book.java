public class Book extends BookStore{
    private Author author= new Author();
    private BookType type;
    private int numAvailable;
    private double price;
    public double getPrice(){
        return this.price;
    }
    public int getAv(){
        return this.numAvailable;
    }
    public void setAv(int ab){
        this.numAvailable=ab;
    }
}
