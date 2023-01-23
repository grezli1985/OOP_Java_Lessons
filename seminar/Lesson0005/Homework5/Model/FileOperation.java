package OOP_Java_Lessons.seminar.Lesson0005.Homework5.Model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
    String getFileType();
}
