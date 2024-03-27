package hu.webler.model;

import hu.webler.value.Gender;

public class Student extends Person {

    private Gender gender;
    private int birthYear;

    @Override
    public String doSomething() {
        return "The student is learning Java";
    }

    public Student(String firstName, String midName, String lastName, Gender gender, int birthYear) {
        super(firstName, midName, lastName);
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName = " + getFirstName() +
                ", midName = " + getMidName() +
                ", lastName = " + getLastName() +
                ", gender = " + gender +
                ", birthYear = " + birthYear +
                '}';
    }
}