package Homework.objectContainers;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator {


    @Override
    public int compare(Object o, Object t1) {

        Person p1 = (Person) o;
        Person p2 = (Person) t1;

        if(p1.getAge() > p2.getAge()){
            return -1;
        }
        if(p1.getAge() < p2.getAge()){
            return 1;
        }
        return 0;
    }



    }

