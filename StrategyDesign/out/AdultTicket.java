public class AdultTicket extends Ticket{

    public AdultTicket(String discount) {
        this.setPrice(20);

        if (discount.compareToIgnoreCase("yes")==0) {this.disc = new MilitaryDiscount();}
        else{ this.disc = new NoDiscount(); }

        disc.Determine(this);
    }

    public void displayPrice() {
        System.out.println("This Senior's ticket will cost $"+ getPrice());
    }

}
