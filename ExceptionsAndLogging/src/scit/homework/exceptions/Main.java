package scit.homework.exceptions;

import java.util.TreeSet;

            public class Main {
                public static void main(String[] args) {

                    Student mara = new Student("Mara", "Amm", "05 02 2000",'F', "8656565656" );
                    Student mary = new Student("Mary", "Abbb", "05 02 1999",'f', "556565677" );
                    Student mario = new Student("Mario", "Far", "05 07 2000",'M', "923432656" );


                    TreeSet<Student> studentsSet = new TreeSet<>(new cnpComparator());

                    studentsSet.add(mara);
                    studentsSet.add(mary);
                    mario.addStudent(mario, studentsSet);



                    for(Student s: studentsSet){
                        System.out.println(s);
        }

                    mario.retrieveStudentByAge(20 , studentsSet);

    }
}
