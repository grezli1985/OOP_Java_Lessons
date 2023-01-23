package OOP_Java_Lessons.seminar.Lesson0005.Homework5.controllers;

import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.Repository;
// import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.FileOperationXML;
import OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model.User;

import java.util.List;

public class UserController {
    private final Repository repository;
    private String fileType;

    public UserController(Repository repository) {
        this.repository = repository;
        this.fileType = repository.getFileType();
    }

    public void saveUser(User user) throws Exception {
        validateUser(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("Пользователь не найден");
    }

    public List<User> readList() {
        List<User> result = repository.getAllUsers();
        return result;
    }

    public void updateUser(String idNumber, User newGuy) throws Exception {
        idPresenceValidation(idNumber);
        newGuy.setId(idNumber);
        validateUserId(newGuy);
        repository.updateUser(newGuy);
    }

    private void validateUser(User user) throws Exception {
        if (user.getFirstName().contains(" "))
            throw new Exception("Имя пользователя содержит недопустимые символы");
        if (user.getLastName().contains(" "))
            throw new Exception("Фамилия пользователя содержит недопустимые символы");
    }

    private void validateUserId (User user) throws Exception{
        if (user.getId().isEmpty())
            throw new Exception("У пользователя нет идентификатора");
        validateUser(user);
    }

    public void idPresenceValidation (String inputId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User u : users) {
            if (u.getId().equals(inputId))
               return;
        }
        throw new Exception("Здесь нет такого идентификатора");
    }
    public void deleteById (String inputId){
        repository.deleteById(inputId);
    }

    public String getFileType() { return fileType; }
    //    public void toXML(){
//        List<User> users = repository.getAllUsers();
//        FileOperationXML rXml = new FileOperationXML("users.xml");
//    }
}
