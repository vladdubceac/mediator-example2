package learning.vladdubceac.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer buyer1=new AuctionBuyer(mediator,"Tal Baum");
        Buyer buyer2=new AuctionBuyer(mediator,"Elad Shamailov");
        Buyer buyer3=new AuctionBuyer(mediator,"John Smith");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        System.out.println("\nWelcome to the auction. Tonight we are selling a vacation to Vegas. Please make some offers.");
        System.out.println("---------------------");
        System.out.println("Waiting for the buyer's offers...");

        // Making bids
        buyer1.bid(1800);
        buyer2.bid(2000);
        buyer3.bid(780);

        System.out.println("--------------------");
        mediator.findHighestBidder();

        buyer2.cancelBid();
        System.out.print(buyer2.getName()+" Has canceled his/her bid! In this case ...");

        mediator.findHighestBidder();
    }
}
