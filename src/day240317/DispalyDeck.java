package day240317;

public class DispalyDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS/* 1*/; suit <= Card.SPADES/* 4*/; suit++) {
            System.out.println();
            for (int rank = Card.ACE/* 1*/; rank <= Card.KING/* 13*/; rank++) {
                Card card = deck.getCard(suit, rank);

                System.out.print(Card.suitToString(card.getSuit()) + " - " + Card.rankToString(card.getRank())+" ");
            }
        }
    }
}
