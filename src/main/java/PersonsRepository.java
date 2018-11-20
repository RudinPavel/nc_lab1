//package com.company;

public class PersonsRepository {
    private int size = 0;
    private Person[] persons = new Person[size];

    public void add(Person p) {
        if (checkCurrentId(p.getId())) {
            Person[] newPersons = new Person[size + 1];
            for (int i = 0; i < persons.length; i++) {
                newPersons[i] = persons[i];
            }
            newPersons[size-1] = p;
            persons = newPersons;
            size++;
        }
    }

    private boolean checkCurrentId(int id) {
        for (Person p : persons) {
            if (p.getId() == id) { // допустимо сравнивать по Integer
                System.out.println("Current id already exist!");
                return false;
            }
        }
        return true;
    }

    public Person getPerson(String full_name) {
        for (Person p : persons) {
            if (p.getFullName() == full_name) // Недопустимо сравнение строк таким образом
                return p;
        }
        return null;
    }

    public Person getPerson(int id) {
        for (Person p : persons) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public void removeLast() {
        this.persons[size] = null;
        size--;
    }

    public int returnIndexById(int id){
        for (int i =0; i < persons.length; i++) {
            if (persons[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void removeById(int id)
    {
        Person [] newPersons = new Person[size - 1];
        int j = 0;
        for (int i = 0; i < persons.length; i++){
            if (persons[i].getId() == id){
                continue;
            }
            newPersons[j] = persons[i];
            j++;
        }
        size--;
    }

    public String printPersons() {
        String result = "";
        int i = 0;
        for (Person p : persons) {
            i++;
            result += Integer.toString(i) + "." + p.getFullName() + " id:" + Integer.toString(p.getId())+ '\n';
        }
        return result;
    }
}
