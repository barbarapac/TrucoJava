package rc.unesp.br.resources.enums;

/**
 * Class that represents a round of a point of the game.
 * @author Lucas Pinheiro @lucaspin
 * @author Bruno Vedovetto @bleandro
 * @author Dalton Lima @daltonbr
 */
public enum Point {
    ONE(1),
    THREE(3),
    SIX(6),
    NINE(9),
    TWELVE(12);

    private int value;

    Point(int _value) {
        this.value = _value;
    }

    public int getValue() {
        return this.value;
    }
}
