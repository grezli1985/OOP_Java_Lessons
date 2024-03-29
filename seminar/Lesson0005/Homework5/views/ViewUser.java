package OOP_Java_Lessons.seminar.Lesson0005.Homework5.views;

import OOP_Java_Lessons.seminar.Lesson0005.Homework5.controllers.UserController;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {

        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            if (com == Commands.EXIT) return;
            try {
                switch (com) {
                    case CREATE:
                        String firstName = prompt("Имя: ");
                        String lastName = prompt("Фамилия: ");
                        String phone = prompt("Номер телефона: ");
                        userController.saveUser(new User(firstName, lastName, phone));
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User user = userController.readUser(id);
                        System.out.println(user);
                        break;
                    case LIST:
                        List<User> lst = userController.readList();
                        lst.forEach(i -> System.out.println(i + "\n"));
                        break;
                    case UPDATE:
                        String numId = prompt("Какой контакт редактировать? Введите номер ID: ");
                        userController.idPresenceValidation(numId);
                        userController.updateUser(numId, createAGuy());
                        break;
                    case DELETE:
                        String indId = prompt("Идентификатор пользователя: ");
                        userController.deleteById(indId);
                        break;
                    case XML:
                        System.out.println(userController.getFileType());
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Упс!\n"+ e.getMessage()); ;
            }
        }
    }

    private String prompt(String message) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(message);
            return in.nextLine();    
        }
        
    }

    private User createAGuy() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        User newGuy = new User(firstName, lastName, phone);
        return newGuy;
    }
}
