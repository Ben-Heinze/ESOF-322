public class AARPDiscount implements DiscountBehavior {


    public void Determine(Ticket x) {
        x.setPrice(x.getPrice()*.80);
        System.out.println("This ticket has a 20% discount.");
    }
}
