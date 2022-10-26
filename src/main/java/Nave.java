public abstract class Nave {

    private String name;
    public Nave(){}

    public void SubirTripulantes(){
        System.out.println("Los Tripulantes se subieron");
    }

    public abstract void mision();
    public abstract void EngineState();

    public void nombre () {
        System.out.println("NOMBRE DE LA NAVE: "+ name);
    }

    public void setName(String s){
        name = s;
    }

    public String getName() {
        return name;
    }
}
