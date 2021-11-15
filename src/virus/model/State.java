package virus.model;

import javafx.scene.paint.Color;

public enum State {
    SUSCEPTIBLE {
        public Color getColor() {
            return Color.YELLOW;
        }
    }, INFECTED {
        public Color getColor() {
            return Color.RED;
        }
    }, RECOVERED {
        public Color getColor() {
            return Color.BLUE;
        }
    };

    public abstract Color getColor();
}