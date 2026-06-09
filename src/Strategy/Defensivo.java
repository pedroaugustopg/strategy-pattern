package Strategy;

public class Defensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo de forma defensiva!!");
    }
}
