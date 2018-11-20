public class Main {
    public static void main(String[] args){
        PersonsRepository pr = new PersonsRepository();
        Person p = new Person(1, "Rudin P.I.", "male", "green");
        p.setEyeColor("green");
        pr.add(p);
        p = new Person(1, "Brudin P.I.", "male", "green");
        pr.add(p);
        p = new Person(2, "Titova N.A..", "female", "blue");
        pr.add(p);
        pr.printPersons();
        pr.removeLast();
        pr.printPersons();
        // mavon compiler plugin
        // Добавление через Pom file
    }
}
