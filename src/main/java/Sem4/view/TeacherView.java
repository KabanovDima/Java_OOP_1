package Sem4.view;

import Sem4.controllers.UserController;
import Sem4.models.Teacher;

import java.util.List;

public class TeacherView implements UseView{

    private final UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole() {
        sendOnConsole(SortType.NONE);
    }

    @Override
    public void sendOnConsole(SortType sortType) {
        List<Teacher> teachers = switch (sortType){
            case NONE -> controller.getAll();
            case NAME -> controller.getAllSortByFullName();
            case ID -> controller.getAllSortById();
        };
        if(teachers == null || teachers.size() == 0) {
            System.out.println("Отсутствуют преподаватели для вывода");
            return;
        }

        System.out.println("===================================");
        System.out.println("Для вывода использована " + sortType);

        teachers.forEach(System.out::println);
        System.out.println("===================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        controller.create(fullName, age, phoneNumber, groupTitle);
    }

    @Override
    public void removeUser(String fullName) {
        int removeCount = controller.remove(fullName);
        if(removeCount == 0){
            System.out.println("Удаление не получилось");
        } else {
            System.out.println("Удаление преподавателей: " + removeCount);
        }
    }
}
