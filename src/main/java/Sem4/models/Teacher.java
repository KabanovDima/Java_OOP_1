package Sem4.models;

public class Teacher extends User{
    public Teacher(String fullName, Integer age, String phoneNumber, String groupTitle) {
        super(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public String toString() {
        return String.format("Преподаватель имеет следующие свойтва: id: %s, " +
                "name: %s, age: %s, phone number: %s, group: %s", getId(), getFullName(), getAge(),
                getPhoneNumber(), getGroupTitle());
    }
}
