package strategy;

public class NormalMovement
        implements MovementStrategy {

    @Override
    public void move(){
        System.out.println("Moving normally!!");
    }
}