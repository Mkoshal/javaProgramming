package day40_FinalKeyword;


import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;
    private Square square;

    private Circle getCircle() {
        return circle;
    }

    void setCircle(Circle circle){
        if(circle.getRadius() < 5){
            return;
        }

        this.circle = circle;
    }


    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;

    }


}
