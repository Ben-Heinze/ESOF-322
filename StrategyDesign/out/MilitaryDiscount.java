public class MilitaryDiscount implements DiscountBehavior {


    public void Determine(Ticket x) {
        x.setPrice(x.getPrice()*.90);
        System.out.println("This ticket has a 10% discount.");
    }
}
