package Sem4.controllers;

import Sem4.models.User;

import java.util.List;

public interface UserController <T extends User>{
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    int remove(String fullName);
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
}
