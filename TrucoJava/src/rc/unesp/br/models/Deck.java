package rc.unesp.br.models;

import rc.unesp.br.resources.enums.Rank;
import rc.unesp.br.resources.enums.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class to represent the deck of cards of the game.
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 * @author lucas Pinheiro @lucaspin
 */
public class Deck {
    private List<Card> cards = new ArrayList<>();
    private Random randomGenerator = new Random();

    public Deck() {
        // Create new cards
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit, false);
                this.cards.add(card);
            }
        }
    }

    /**
     * Return and remove a random card from the deck
     * @return {Card}
     */
    public Card drawRandomCard() {
        int index = this.randomGenerator.nextInt(cards.size());
        Card card = this.cards.get(index);
        cards.remove(index);
        return card;
    }

    /**
     * Return _numberOfCardsToDraw and remove them from the deck
     * @param _numberOfCardsToDraw {int}
     * @return {List<Card>}
     */
    public List<Card> drawRandomCards(int _numberOfCardsToDraw) {
        List<Card> cardArray = new ArrayList<>();
        for (int i = 0; i < _numberOfCardsToDraw; i++){
            int index = this.randomGenerator.nextInt(this.cards.size());
            Card card = this.cards.get(index);
            cardArray.add(card);
            this.cards.remove(index);
        }
        return cardArray;
    }

    /**
     * Reset the deck
     */
    public void resetDeck() {
        this.cards.clear();
        //Create new cards
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit, false);
                this.cards.add(card);
            }
        }
    }
}
