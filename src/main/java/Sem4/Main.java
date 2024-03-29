package Sem4;

import Sem4.controllers.GroupController;
import Sem4.controllers.StudentController;
import Sem4.controllers.TeacherController;
import Sem4.repositories.StudentRepository;
import Sem4.repositories.TeacherRepository;
import Sem4.service.GroupService;
import Sem4.service.StudentService;
import Sem4.service.TeacherService;
import Sem4.view.GroupView;
import Sem4.view.SortType;
import Sem4.view.StudentView;
import Sem4.view.TeacherView;

public class Main {
    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    private static TeacherRepository teacherRepository;
    private static TeacherService teacherService;
    private static TeacherController teacherController;



    public static void main(String[] args) {
         TeacherView viewTeacher= getTeacherController();
         StudentView view = getStudentController();
         GroupView groupView = getGroupView();


//        -----------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "11Б");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");
        viewTeacher.create("Anna Nikolaevna", 45, "555", "11А");
        viewTeacher.create("Julia Sergeevna", 50, "666", "11Б");


        viewTeacher.sendOnConsole();
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);
        groupView.printAllFromGroup("11А");
        groupView.printAllFromGroup("11Б");
        view.removeUser("Ivan Morozov");
        view.sendOnConsole();

    }


    private static StudentView getStudentController(){

        studentRepository= new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static TeacherView getTeacherController(){
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView(){

        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }

}
