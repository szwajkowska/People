package pl.ania;

import java.util.ArrayList;
import java.util.List;

public class People<T> {

    private List<T> list = new ArrayList<T>();

    public List<T> getAll(){
        return list;

    }



    public void addPerson(T person){
        list.add(person);
    }
}
