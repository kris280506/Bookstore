public class ChildrenBook extends Book{
    private int age;

    public double getPrice(){
        System.out.println("item is on 60% sale");
        double originalPrice = super.getPrice();
        return (originalPrice*70)/100;
    }
}