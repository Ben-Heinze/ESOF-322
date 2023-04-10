public class ChildTicket extends Ticket{

    public ChildTicket() {
        this.setPrice(10);
        this.disc = new NoDiscount();
        disc.Determine(this);
    }


    public void displayPrice() {
        System.out.println("This child's ticket will cost $"+ getPrice());
    }

}
