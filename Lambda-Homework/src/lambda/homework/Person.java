package lambda.homework;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate date;

    public Person(String firstName, String lastName, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                '}';
    }

    /**
     * the method read the information from a file and put them in a list
     * @param filePath the string that contains the path of te file to read from
     * @return the list with the information read from the file
     */

    public static List<String> readFromFile(String filePath) {
        List<String> personsInfo = new ArrayList<>();

        BufferedReader file1 = null;
        try {
            file1 = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s = null;
        while (true) {
            try {
                if (!((s = file1.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            personsInfo.add(s);
        }
        return personsInfo;
    }

    /**
     * the method takes the information from the List and creates Objects of type Person with the information
     * @param personsInfo takes as parameter the list where there are the information read from the files
     * @return the new list of type Person
     */
    public static List<Person> createListOfPerson(List personsInfo) {
        List<Person> listOfPersons = new ArrayList<>();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < personsInfo.size(); i++) {
            String info = (String) personsInfo.get(i);
            String[] personInformation = info.split(",");
            LocalDate dateOfBirth = LocalDate.parse(personInformation[2], format);
            Person p = new Person(personInformation[0], personInformation[1], dateOfBirth);
            listOfPersons.add(p);
        }
        return listOfPersons;


    }

    /**
     * method check the month birthday of every Person and if matches with the param month it will
     * put the person in a new list
     * @param personList list of all the Person
     * @param month the month for which to do the check
     * @return the new list with the Person that have the birthday only in the month given as parameter
     */
    public static List<Person> checkBirthdayMonth(List<Person> personList, Integer month) {
        List<Person> monthBirthday = personList
                .stream()
                .filter(person -> person.getDate().getMonthValue() == month)
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        return monthBirthday;
    }

    /**
     * the method write the first name and hte last name in a file
     * @param pList list of Person
     */
    public static void writeInTheFile(List<Person> pList) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("monthBirthdayFile.txt")))) {
//
            pList.forEach(p -> {
                try {
                    writer.write(p.getFirstName() + " " + p.getLastName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
