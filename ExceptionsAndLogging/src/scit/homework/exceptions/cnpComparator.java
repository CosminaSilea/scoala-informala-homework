package scit.homework.exceptions;

import java.util.Comparator;

class cnpComparator implements Comparator<Student>{

    /**
     * compare the cnp of two students, check if two students have the same cnp
     */

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getCnp().compareTo(st2.getCnp());
    }


}