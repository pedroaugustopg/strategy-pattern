package strategy;

public class AggressiveMovement
        implements MovementStrategy {

    @Override
    public void move(){
        System.out.println("Moving aggressively!!");
    }
}