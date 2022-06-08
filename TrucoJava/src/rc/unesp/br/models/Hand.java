package rc.unesp.br.models;

import java.util.List;

/**
 * Class to represent a player's hand.
 * @author Dalton Lima @daltonbr
 * @author lucas Pinheiro @lucaspin
 * @author Bruno Vedovetto @bleandro
 */
public class Hand {
    private List<Card> cards;

    /**
     * Constructor of the class
     */
    public Hand(List<Card> _cards) {
        this.cards = _cards;
    }

    /**
     * Draw the next card of the hand
     * @return {Card}
     */
    public Card drawNextCard() {
        return this.cards.remove(0);
    }

    /**
     * Get the current cards of the hand.
     * @return {List<Card>}
     */
    public List<Card> getCards() {
        return this.cards;
    }

    /**
     * Get a card by its index.
     * Similar to drawCard, but it does not remove the card from the hand.
     * @param _position {int} - the index of the card
     * @return {Card}
     * @throws IndexOutOfBoundsException
     */
    public Card getCard(int _position) throws IndexOutOfBoundsException {
        return cards.get(_position);
    }
}
