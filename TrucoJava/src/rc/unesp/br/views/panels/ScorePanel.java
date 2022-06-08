package rc.unesp.br.views.panels;

import rc.unesp.br.resources.ResourseString;

import javax.swing.*;
import java.awt.*;

/**
 * Class for the score panel of the application
 * @author lucas Pinheiro @lucaspin
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 */
public class ScorePanel extends JPanel {
    private JLabel player1GameScore = new JLabel();
    private JLabel player2GameScore = new JLabel();
    private JLabel player1RoundScore = new JLabel();
    private JLabel player2RoundScore = new JLabel();
    private Color backgroundColor = new Color(255, 255, 255);

    /**
     * Constructor of the class
     */
    ScorePanel() {
        super();
        this.setInitialOpts();
        this.setLabelsOptions();
        this.setInitialScores();
    }

    private void setInitialScores() {
        this.setPlayer1GameScore(0);
        this.setPlayer2GameScore(0);
        this.setPlayer1RoundScore(0);
        this.setPlayer2RoundScore(0);
    }

    public void setPlayer1RoundScore(int score) {
        this.player1RoundScore.setText(ResourseString.PANEL_PLAYER_ONE + ResourseString.ARROW + score);
    }

    public void setPlayer2RoundScore(int score) { this.player2RoundScore.setText(ResourseString.PANEL_PLAYER_TWO + ResourseString.ARROW + score); }

    private void setLabelsOptions() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;

        this.add(new JLabel(ResourseString.GAME_SCORE), constraints);

        constraints.gridy = 1;
        this.add(this.player1GameScore, constraints);

        constraints.gridy = 2;
        this.add(this.player2GameScore, constraints);

        constraints.gridy = 3;
        this.add(new JLabel(" "), constraints);

        constraints.gridy = 4;
        this.add(new JLabel(ResourseString.ROUND_SCORE), constraints);

        constraints.gridy = 5;
        this.add(this.player1RoundScore, constraints);

        constraints.gridy = 6;
        this.add(this.player2RoundScore, constraints);
    }

    /**
     * Display the new player 1 score
     * @param score {int}
     */
    public void setPlayer1GameScore(int score) {
        this.player1GameScore.setText(ResourseString.PANEL_PLAYER_ONE + ResourseString.ARROW + score);
    }

    /**
     * Set the new player 1 score
     * @param score {int}
     */
    public void setPlayer2GameScore(int score) {
        this.player2GameScore.setText(ResourseString.PANEL_PLAYER_TWO + ResourseString.ARROW + score);
    }

    private void setInitialOpts() {
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(GamePanel.DEFAULT_PANEL_WIDTH, GamePanel.DEFAULT_PANEL_HEIGHT));
        this.setBackground(backgroundColor);
    }
}
