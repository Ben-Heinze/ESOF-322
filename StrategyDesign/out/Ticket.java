public abstract class Ticket {
    private double price;
    DiscountBehavior disc;

    public abstract void displayPrice();


    public void setPrice(double p){
        this.price = p;
    }
    public double getPrice(){
        return this.price;
    }


}
