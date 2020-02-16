package scit.homework.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private char gender;
    private String cnp;


    public Student(String firstName, String lastName, String dateOfBirth, char gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName.equals("") || lastName.equals("")) {
            throw new IllegalArgumentException("The first name and/ or the last name cannot be empty");
        }

        if (Character.toUpperCase(gender) == 'F' || Character.toUpperCase(gender) == 'M') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("The gender is not valid, has to be 'M' or 'F'");
        }

        this.cnp = cnp;

        if (cnp.equals("")) {
            throw new IllegalArgumentException("The cnp cannot be empty");
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse(dateOfBirth, f);
        this.dateOfBirth = date;
        LocalDate limitDate = LocalDate.parse("01 01 1900", f);
        LocalDate today = LocalDate.now();
        if (date.isBefore(limitDate) || today.minusYears(18).isBefore(date)) {
            throw new IllegalArgumentException("The date is not valid");
        }
    }

    /**
     * addStudent() method that adds students in a treeSet
     *
     * @param student1    object student that has to be added in the treeSet
     * @param setStudents the name of the treeSet where to insert the student
     */
    public void addStudent(Student student1, TreeSet<Student> setStudents) {
        setStudents.add(student1);
    }

    /**
     * deleteStudent() method that that deletes a student from the treeSet
     *
     * @param cnp         the cnp of the student that needs to be deleted, the field cannot be empty, it will throw
     *                    an IllegalArgumentException
     * @param setStudents the treeSet where to delete the student
     */
    public void deleteStudent(String cnp, TreeSet<Student> setStudents) {
        if (cnp.equals("")) {
            throw new IllegalArgumentException("The field is empty, the student cannot be found");
        }

        Student student = new Student(this.firstName, this.lastName, "14 05 1992", this.gender, cnp);
        setStudents.remove(student);

    }

    /**
     * retrieveStudentByAge() method create a new list of students that have the same age
     *
     * @param age1        the age of the students to insert in the new list, if the have is negative it will throw
     *                    an IllegalArgumentException
     * @param setStudents the list where to search for the students
     */
    public void retrieveStudentByAge(int age1, TreeSet<Student> setStudents) {

        if (age1 < 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        }

        List<Student> listByAge = new ArrayList<>();
        for (Student s : setStudents) {
            int ageStudent;
            ageStudent = getAge(s);
            if (ageStudent == age1) {
                listByAge.add(s);
            }
        }
        System.out.println("The students that are " + age1 + " years old are:");
        for (Student o : listByAge) {
            System.out.println(o);
        }
    }

    /**
     * getAge() calculate the age of a student based of current year
     *
     * @param student name of the student
     * @return the age of the student given as parameter
     */
    public int getAge(Student student) {
        int yearOfBirth = student.dateOfBirth.getYear();
        int yearNow = LocalDate.now().getYear();
        int age = yearNow - yearOfBirth;
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public char getGender() {
        return gender;
    }

    public String getCnp() {
        return cnp;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", CNP='" + cnp + '\'' +
                '}';
    }

}




