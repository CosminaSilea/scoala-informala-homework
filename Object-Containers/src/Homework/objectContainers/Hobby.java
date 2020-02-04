package Homework.objectContainers;

import java.util.List;

public class Hobby {

    private String nameOfHobby;
    private Integer frequency;
    private List address;

    public Hobby(String nameOfHobby, Integer frequency, List address) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        this.address = address;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public List getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Hobby: " + nameOfHobby + "." +
                " Countries where can practice the hobbies are " +
                 address + ".";
    }
}
