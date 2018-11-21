public class Main {
    public static void main(String[] args){
        PersonsRepository pr = new PersonsRepository();
        Person p = new Person(1, "Rudin P.I.", "male","1940-11-12" ,"green");
        p.setEyeColor("green");
        pr.add(p);
        p = new Person(1, "Brudin P.I.", "male", "1940-11-12","green");
        pr.add(p);
        p = new Person(2, "Titova N.A..", "female","1940-11-12" ,"blue");
        p.getAge();
        pr.add(p);
        System.out.println(pr.printPersons());
        // pr.removeLast();
        System.out.println(pr.printPersons());
        // mavon compiler plugin
        // Добавление через Pom file
    }
}
