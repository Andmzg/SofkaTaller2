public class NaveTripulada extends Nave implements Tripulacion {

    public NaveTripulada() {
        super();
        setName("Stralus68");
    }
    public void mision() {
        System.out.println("Esta mision es dejar tripulantes en estacion espacial");

    }

    public void EngineState() {
        System.out.println("Motores apagado");
    }


    @Override
    public void CantidadTripulantes() {
        System.out.println("Hay un total de tres tripulantes");
    }
}
