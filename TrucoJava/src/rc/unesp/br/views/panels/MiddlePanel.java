package rc.unesp.br.views.panels;

import rc.unesp.br.models.Card;
import rc.unesp.br.controllers.GameController;
import rc.unesp.br.views.buttons.CardButton;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Class for the view section of the app.
 * @author lucas Pinheiro @lucaspin
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 */
public class MiddlePanel extends JPanel {
    // TODO: Investigate which is the best component to hold the cards
    private java.util.List<JButton> cards = new ArrayList<>();
    private GameController controller;
    private Color backgroundColor = new Color(0, 120, 0);

    private CardButton lastChosenCard;
    private CardButton turnedCard;

    /**
     * Constructor of the class
     */
    MiddlePanel() {
        super();
        this.setInitialOpts();
    }

    private void setInitialOpts() {
        this.setPreferredSize(new Dimension(GamePanel.DEFAULT_PANEL_WIDTH, GamePanel.DEFAULT_PANEL_HEIGHT));
        this.setBackground(backgroundColor);
    }

    public void updateLastChosenCard(Card lastChosenCard) {
        CardButton newCardButton = CreateCardButton(lastChosenCard);
        this.lastChosenCard = newCardButton;
        this.addNewCardsToPanel();
    }

    public void updateTurnedCard(Card card) {
        CardButton newCardButton = CreateCardButton(card);
        this.turnedCard = newCardButton;
        this.addNewCardsToPanel();
    }

    private CardButton CreateCardButton(Card card) {
        CardButton newCardButton = new CardButton(card, false);
        newCardButton.setRank(card.getRank());
        newCardButton.setSuit(card.getSuit());
        newCardButton.setManilha(card.isManilha());

        this.removeOldCardsFromPanel();
        return newCardButton;
    }

    private void removeOldCardsFromPanel() {
        if (this.turnedCard != null) {
            this.remove(this.turnedCard);
        }

        if (this.lastChosenCard != null) {
            this.remove(this.lastChosenCard);
        }
    }

    private void addNewCardsToPanel() {
        if (this.turnedCard != null) {
            this.add(this.turnedCard);
        }

        if (this.lastChosenCard != null) {
            this.add(this.lastChosenCard);
        }

        this.revalidate();
        this.repaint();
    }
}