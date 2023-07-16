package Sem4.models;

import java.util.Objects;

public class User implements Comparable<User>{
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupTitle;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGroupTitle() {
        return groupTitle;
    }
    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(fullName, user.fullName) && Objects.equals(age, user.age) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(groupTitle, user.groupTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public User(String fullName, Integer age, String phoneNumber, String groupTitle) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.groupTitle = groupTitle;
    }

    @Override
    public int compareTo(User o) {
        return getAge().compareTo(o.getAge());
    }

}
