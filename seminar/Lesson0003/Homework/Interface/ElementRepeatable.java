package OOP_Java_Lessons.seminar.Lesson0003.Homework.Interface;

import java.util.HashMap;
import java.util.Map;

/**
 * Для коллекций, в которых элемент повторяется
 * @param <U>
 */
public interface ElementRepeatable<U> {
	HashMap<U, Integer> getCountRepeatable();
}
