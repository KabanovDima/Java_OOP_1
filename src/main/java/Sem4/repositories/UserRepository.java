package Sem4.repositories;

import Sem4.models.Student;
import Sem4.models.User;

import java.util.List;

public interface UserRepository <T extends User>{
    void create(T user);
    List<T> getAll();
    int remove(String fullName);

//    List<Student> getAllByGroupTitle(String groupTitle);
    List<T> getAllByGroupTitle(String groupTitle);
}
