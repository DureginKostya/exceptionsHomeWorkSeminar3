package model;

import lombok.Getter;

@Getter
public class Human {
    String lastName;
    String firstName;
    String patronymic;
    String birthday;
    String phone;
    String gender;

    public Human(String lastName, String firstName, String patronymic, String birthday, String phone, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + birthday + " " + phone + " " + gender;
    }
}
