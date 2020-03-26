package lambda.homework;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> listOfPerson = Person.createListOfPerson(Person.readFromFile("D:\\JAVA EX\\scoala-informala-homework\\Lambda-Homework\\src\\lambda\\homework\\persons.txt"));

        List<Person> checkBirthdayMonth = Person.checkBirthdayMonth(listOfPerson, 3);

        Person.writeInTheFile(checkBirthdayMonth);

     // checkBirthdayMonth.forEach(System.out::println);

    }
}
