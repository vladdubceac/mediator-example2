package learning.vladdubceac.mediator;

public class AuctionBuyer extends Buyer {

    public AuctionBuyer(Mediator mediator, String name ) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelBid() {
        price=-1;
    }
}
