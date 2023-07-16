package Sem4.controllers;

import Sem4.models.User;
import Sem4.service.GroupService;

import java.util.List;

public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    public List<User> getAllUserFromGroup (String groupTitle) {
        return groupService.getAllUserFromGroup(groupTitle);
    }

}
