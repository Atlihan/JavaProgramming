package day40_FinalKeyword;

import day39_Recap.shape.Circle;
import day39_Recap.shape.Square;

public class EncapsulationReview {

    private Circle circle;
    public Circle getCircle(){
        return circle;
    }

    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void setCircle(Circle circle){
        if (circle.getRadius()<5){
            return;
        }
        this.square = square;
    }

}
