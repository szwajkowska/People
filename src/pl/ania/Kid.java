package pl.ania;

public class Kid implements Human, Grownup {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAdult() {
        return false;
    }
    @Override
    public String toString(){
        return "Jestem dzieckiem ";
    }
}
