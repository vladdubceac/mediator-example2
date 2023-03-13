package learning.vladdubceac.mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    List<Buyer> buyerList;

    public AuctionMediator() {
        buyerList = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyerList.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        Buyer winner = buyerList.get(0);
        for(int i=0;i<buyerList.size();i++){
            if(buyerList.get(i).getPrice() > winner.getPrice()){
                winner = buyerList.get(i);
            }
        }
        System.out.println("The auction winner is "+winner.getName()+". He/she paid "+winner.getPrice()+"$ for the item.");
        for(Buyer buyer:buyerList){
            buyer.auctionHasEnded();
        }
    }
}
