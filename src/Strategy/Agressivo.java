package Strategy;

public class Agressivo implements Comportamento {

    @Override
    public void mover(){
        System.out.println("Movendo de forma agressiva!!");
    }

}
