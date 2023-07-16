package Sem4.view;

import Sem4.controllers.GroupController;

public class GroupView {
    private final GroupController controller;


    public GroupView(GroupController controller) {
        this.controller = controller;
    }

    public void printAllFromGroup(String groupTitle){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        System.out.println(controller.getAllUserFromGroup(groupTitle));
        System.out.println("СТУДЕНТЫ И ПРЕПОДАВАТЕЛЬ ГРУППЫ " + groupTitle);
        controller.getAllUserFromGroup(groupTitle).forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
