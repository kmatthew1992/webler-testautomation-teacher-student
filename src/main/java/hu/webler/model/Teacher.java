package hu.webler.model;

import hu.webler.value.Gender;

public class Teacher extends Person {

    private Gender gender;

    private final String SUBJECT = "Java";


    @Override
    public String doSomething() {
        return "The teacher is teaching " + getSUBJECT();
    }

    public Teacher(String firstName, String midName, String lastName, Gender gender) {
        super(firstName, midName, lastName);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSUBJECT() {
        return SUBJECT;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName = " + getFirstName() +
                ", midName = " + getMidName() +
                ", lastName = " + getLastName() +
                ", gender = " + gender +
                ", SUBJECT = " + SUBJECT +
                '}';
    }
}