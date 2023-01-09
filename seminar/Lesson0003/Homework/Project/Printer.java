package OOP_Java_Lessons.seminar.Lesson0003.Homework.Project;

/**
 * Класс печатает объект
 */
public class Printer {
	MyObject object;
	
	public Printer(MyObject object) {
		this.object = object;
	}
	
	/**
	 * метод выводит объект на терминал
	 */
	public void printObj(){
		System.out.println("Входные данные:");
		System.out.println(object.getMycollect());
		System.out.println("Элемент = кол. повторений");
		object.getFrequencyDictionary().entrySet().forEach(System.out::println);
	}
}
