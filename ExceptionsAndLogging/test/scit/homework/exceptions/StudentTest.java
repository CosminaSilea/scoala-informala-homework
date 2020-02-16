package scit.homework.exceptions;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    @Test
    public void checkFirstName() {
        Student mara = new Student("Mara", "Amm", "05 02 2000", 'f', "5656565656");
        String name = mara.getFirstName();
        assertEquals("Mara", name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkGender() throws Exception {
        Student mara = new Student("", "Amm", "05 02 2000", 'f', "5656565656");
        char gender = mara.getGender();
        assertEquals('f', gender);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDateOfBirth_wrongDate() {
        Student mara = new Student("Mara", "Amm", "05 02 1800", 'f', "5656565656");
        LocalDate dateOfBirth = mara.getDateOfBirth();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate expectedDate = LocalDate.parse("05 02 1890", f);
        assertEquals(expectedDate, dateOfBirth);
    }

    @Test
    public void checkDateBirth() {
        Student mara = new Student("Mara", "Amm", "05 02 1999", 'f', "5656565656");
        LocalDate dateOfBirth = mara.getDateOfBirth();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate expectedDate = LocalDate.parse("05 02 1999", f);
        assertEquals(expectedDate, dateOfBirth);
    }

    @Test
    public void getAge() {
        Student mara = new Student("Mara", "Amm", "05 02 1999", 'f', "5656565656");
        int age = mara.getAge(mara);
        assertEquals(21, age);
    }

    @Test(expected = IllegalArgumentException.class)
    public void student_emptyCnp(){
        Student mara = new Student("Mara", "Amm", "05 02 1999", 'f', "");
        String cnp = mara.getCnp();
        assertEquals("343434343", cnp);
    }

}