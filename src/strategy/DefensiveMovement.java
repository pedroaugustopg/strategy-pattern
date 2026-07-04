package strategy;

public class DefensiveMovement
        implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("Moving defensively!!");
    }
}
