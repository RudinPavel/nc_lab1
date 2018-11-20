//package com.company;
//import org.joda.time.LocalDate;
//import java.util.Date;
enum Gender {male, female}

public class Person {
    private int id;
    private String fullName;
    private Gender gender;
    //private LocalDate birthday;
    private String eyeColor;

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender.toString();
    }

    //public LocalDate getBirthday(){ return birthday; }
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }


    public Person(int id, String fullName, String gender, String eyeColor) {
        this.id = id;
        this.fullName = fullName;
        this.gender = Gender.valueOf(gender);
        this.eyeColor = eyeColor; // comm
    }
}
/*
    Person(LocalDate birthday){
        this.birthday = birthday;
    }

    public int getAge(){ return LocalDate.now().getYear() - birthday.getYear();} // использовать класс периода
}
*/