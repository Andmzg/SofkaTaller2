public class NaveNoTripulada extends Nave {

    public NaveNoTripulada(){
        super();
        setName("Apolo 15");
    }

    public void mision() {
        System.out.println("La mision de esta nave es dejar un satelite");
    }

    public void EngineState() {
        System.out.println("Estado del motor: Motores Apagado");
    }
}
