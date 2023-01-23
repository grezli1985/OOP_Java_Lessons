package OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void updateUser(User user);
    void deleteById(String inputId);
    String getFileType();
}
