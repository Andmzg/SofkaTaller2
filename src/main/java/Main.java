import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean out = false;

        while (!out) {
            Scanner nave = new Scanner(System.in);
            int TipoDeNave;

            System.out.println("\n" + "--------------------------------------" + "\n" +
                    "Escoge un tipo de nave:              |" + "\n" +
                    "1.- Si e suna nave Lanzadera         |" + "\n" +
                    "2.- Si es una nave No propulada      |" + "\n" +
                    "3.- Si es una nave tripulada         |" + "\n" +
                    "4.- Exit                             |" + "\n" +
                    "                                     |") ;

            System.out.println("Ingrese tipo de nave:                |");
            TipoDeNave = nave.nextInt();

            switch (TipoDeNave) {
                case 1:
                    Nave NaveL = new NaveLanzadera();
                    NaveL.nombre();
                    NaveL.mision();
                    NaveL.EngineState();
                    NaveL.SubirTripulantes();
                    break;

                case 2:
                    Nave n = new NaveNoTripulada();
                    n.nombre();
                    n.SubirTripulantes();
                    n.mision();
                    break;

                case 3:
                    Nave NaveT = new NaveTripulada();
                    NaveT.nombre();
                    NaveT.SubirTripulantes();
                    NaveT.mision();


                    break;

                case 4:
                    out = true;
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Salimos del programa!");
                    break;

                default:
                    System.out.println("Error. La opcion no existe           |");
                    break;
            }
        }

    }
}