public class SeniorTicket extends Ticket{

    public SeniorTicket(String discount) {
        this.setPrice(15);

        if (discount.compareToIgnoreCase("yes")==0) {this.disc = new AARPDiscount();}
        else{ this.disc = new NoDiscount(); }

        disc.Determine(this);
    }

    public void displayPrice() {
        System.out.println("This Senior's ticket will cost $"+ getPrice());
    }

}
