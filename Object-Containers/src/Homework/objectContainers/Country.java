package Homework.objectContainers;

public class Country {
    private String nameOfCountry;
    private String code;

    public Country(String nameOfCountry, String code) {
        this.nameOfCountry = nameOfCountry;
        this.code = code;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
