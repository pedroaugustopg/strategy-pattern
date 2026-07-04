package strategy;

public class Robot {

    private MovementStrategy movement;

    public void setStrategy(
            MovementStrategy movement) {
        this.movement = movement;
    }

    public void move(){
        movement.move();
    }
}
