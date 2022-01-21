package lambda.homework;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
public void checkBirthdayMonthTest(){
        List<Person> personList = new ArrayList<>();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        personList.add(new Person("Popa","Ana", LocalDate.parse("1990-06-20", format)));
        personList.add(new Person("Popescu","Maria", LocalDate.parse("1990-03-20", format)));
        personList.add(new Person("Rusu","Marian", LocalDate.parse("1991-03-13", format)));
        personList.add(new Person("Tudor","Ana", LocalDate.parse("1993-09-20", format)));

        List<Person> birthdayList = Person.checkBirthdayMonth(personList, 3);
        Assert.assertEquals(birthdayList.size(), 2);
    }
}