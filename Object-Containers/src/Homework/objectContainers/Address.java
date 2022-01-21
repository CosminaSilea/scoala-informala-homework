package Homework.objectContainers;

public class Address {
 private String street;
 private String Country;

 public Address(String street, String country) {
  this.street = street;
  Country = country;
 }

 public String getStreet() {
  return street;
 }

 public String getCountry() {
  return Country;
 }

 @Override
 public String toString() {
  return Country;
 }
}
