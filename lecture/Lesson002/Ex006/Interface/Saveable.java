package OOP_Java_Lessons.lecture.Lesson002.Ex006.Interface;

import OOP_Java_Lessons.lecture.Lesson002.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
