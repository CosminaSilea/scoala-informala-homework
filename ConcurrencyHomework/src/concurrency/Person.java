package concurrency;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate date;
    private Gender gender;

    public Person(String name, LocalDate date, String gender) {
        this.name = name;
        this.date = date;
        if (gender.equals("male"))
            this.gender = Gender.MALE;
        if(gender.equals("0"))
            this.gender = Gender.MALE;
        if (gender.equals("female"))
            this.gender = Gender.FEMALE;
        if(gender.equals("1"))
            this.gender = Gender.FEMALE;
    }



    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                '}';
    }
}
