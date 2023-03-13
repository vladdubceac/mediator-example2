package learning.vladdubceac.mediator;

public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelBid();
    public void auctionHasEnded() {
        System.out.println(name + " received message that the auction is over");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
