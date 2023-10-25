public class ComicBook extends Book{
    private String charecterName;

    public double getPrice(){
        System.out.println("item is on 60% sale");
        double originalPrice = super.getPrice();
        return (originalPrice*60)/100;
    }
}
