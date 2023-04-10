public class NoDiscount implements DiscountBehavior {


    public void Determine(Ticket x) { System.out.println("There is no discount for this ticket."); }
}
