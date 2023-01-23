package OOP_Java_Lessons.seminar.Lesson0005.Homework5;

// import java.util.Scanner;

import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.FileOperation;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.FileOperationTXT;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.Repository;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.RepositoryFile;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.controllers.UserController;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationTXT();
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
