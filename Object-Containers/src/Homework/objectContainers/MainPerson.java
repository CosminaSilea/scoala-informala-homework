package Homework.objectContainers;

import java.util.*;

public class MainPerson {

    public static void main(String[] args) {

        // exercise 1

        Person maria = new Person("Maria", 23);
        Person andrei = new Person("Andrei", 32);
        Person ion = new Person("Ion", 20);

        PersonAgeComparator p = new PersonAgeComparator();

        Set<Person> setPerson = new TreeSet<>(p);
        setPerson.add(maria);
        setPerson.add(andrei);
        setPerson.add(ion);

        for (Object c : setPerson) {
            System.out.println(c);
        }

        // exercise 2

        /**
         * I created a list of addressed for the hobby Running
         */
        List<Address> runAddress = new ArrayList<>();
        runAddress.add(new Address("aaaa", "Romania"));
        runAddress.add(new Address("xcxcx", "Spain"));
        /**
         * i create the list of addresses for the hobby Dance
         */
        List<Address> danceAddress = new ArrayList<>();
        danceAddress.add(new Address("zzzz", "Romania"));
        /**
         * i created the list of address for the hobby hike
         */
        List<Address> hikeAddress = new ArrayList<>();
        hikeAddress.add(new Address("Tampa", "Romania"));


        Person florin = new Person("Florin", 34);
        Person ioana = new Person("Ioana", 29);

        Hobby run = new Hobby("running", 5, runAddress);
        Hobby dance = new Hobby("dancing", 5, danceAddress);
        Hobby hike = new Hobby("hiking", 3, hikeAddress);

        List<Hobby> hobbyFlorin = new ArrayList<>();
        hobbyFlorin.add(run);
        hobbyFlorin.add(dance);

        List<Hobby> hobbyIon = new ArrayList<>();
        hobbyIon.add(dance);

        List<Hobby> hobbyIoana = new ArrayList<>();
        hobbyIoana.add(dance);
        hobbyIoana.add(hike);

        HashMap<Person, List<Hobby>> newHashHobby = new HashMap<>();

        newHashHobby.put(florin, hobbyFlorin);
        newHashHobby.put(ioana, hobbyIoana);
        newHashHobby.put(ion, hobbyIon);


        HobbyCountryMethod.hobbyMethod(newHashHobby, florin);
        HobbyCountryMethod.hobbyMethod(newHashHobby, ioana);
        HobbyCountryMethod.hobbyMethod(newHashHobby, ion);
    }
}


