package Sem4.service;

import Sem4.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupService {
    private final StudentService studentService;
    private final TeacherService teacherService;

    public GroupService(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    public List<User> getAllUserFromGroup (String groupTitle) {
        List<User> users = new ArrayList<>(studentService.getAllByTitle(groupTitle));
        users.addAll(teacherService.getAllByTitle(groupTitle));
        return users;
    }



}
