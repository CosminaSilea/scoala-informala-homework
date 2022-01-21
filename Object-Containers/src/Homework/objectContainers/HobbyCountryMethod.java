package Homework.objectContainers;

import java.util.HashMap;

public abstract class HobbyCountryMethod {

    /**
     *the method prints the name of the person that was given as parameter and the hobbies that
     * the person has
     * @param hashName the name of the HashMap where the information about the person and the hobbies are inserted
     * @param person the name of the person object
     */
    public static void hobbyMethod(HashMap hashName, Person person){

          System.out.println(person.getName()  + hashName.get(person)) ;
        }


    }

