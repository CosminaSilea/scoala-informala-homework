package concurrency;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> personInfo = new ArrayList<>();

        //read information from the file 1
        try (BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA EX\\scoala-informala-homework\\ConcurrencyHomework\\file1.txt")))) {
            String s = null;
            while ((s = file1.readLine()) != null) {
                personInfo.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read information from the second file 2
        try (BufferedReader file2 = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JAVA EX\\scoala-informala-homework\\ConcurrencyHomework\\file2.txt")))) {
            String s = null;
            while ((s = file2.readLine()) != null) {
                personInfo.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<Person> femaleBirthday = new ArrayList<>();

        for (int i = 0; i < personInfo.size(); i++) {
            String info = personInfo.get(i);
            String[] personInformation = info.split(",");
            LocalDate birthDate = LocalDate.parse(personInformation[1], format);
            Person p = new Person(personInformation[0], birthDate, personInformation[2]);

            if (p.getGender().equals(Gender.FEMALE)) {
                if (p.getDate().getMonth().equals(LocalDate.now().getMonth())) {
                    if (p.getDate().getDayOfMonth() == LocalDate.now().getDayOfMonth())
                        femaleBirthday.add(p);
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("birthdayFemale.txt")))) {
            for (Person p : femaleBirthday) {
                writer.write("Happy birthday " + p.getName() + " " + " (" + p.getDate().getYear() + ")!");
                writer.newLine();
            }
        }
    }
}
// am incercat sa fac doua threduri pentru a citi informatiile din fiesire dar nu am reusit sa le sincronizez si sa
// sa ruleze mai intai thredurile si dupa restul codului ce este in main. aveam mereu array out of bounds exception



