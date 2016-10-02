package pl.ania;

public class Main {

    public static void main(String[] args) {

        People<Kid> kids = new People<>();
        People<Adult> adults = new People<>();
        Kid kidOne = new Kid();
        Adult adultOne = new Adult();

        kids.addPerson(kidOne);
        adults.addPerson(adultOne);

//        for (int i = 0; i < kids.getAll().size(); i++) {
//            System.out.println(kids.getAll().get(i));
//
//        }

        People<Human> person = new People<>();
        person.addPerson(kidOne);
        person.addPerson(adultOne);
//
//        for (int i = 0; i <person.getAll().size() ; i++) {
//            System.out.println(person.getAll().get(i));
//
//        }

        People<Grownup> grownup = new People<>();
        addGrownup(kidOne, grownup);
        addGrownup(adultOne, grownup);


//        if (kidOne.isAdult()) {
//            grownup.addPerson(kidOne);
//        }
//        if (adultOne.isAdult()) {
//            grownup.addPerson(adultOne);
//        }

        for (int i = 0; i < grownup.getAll().size(); i++) {
            System.out.println(grownup.getAll().get(i));
        }





    }
    static public void addGrownup(Grownup person, People<Grownup> grownup){

        if (person.isAdult()){
            grownup.addPerson(person);
        }

    }
}
