package pl.ania;

public class Adult implements Human, Grownup {

    private String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAdult() {
        return true;
    }
    @Override
    public String toString(){
        return "Jestem dorosłym ";
    }

}
