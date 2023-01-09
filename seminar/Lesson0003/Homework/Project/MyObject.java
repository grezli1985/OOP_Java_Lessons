package OOP_Java_Lessons.seminar.Lesson0003.Homework.Project;

import OOP_Java_Lessons.seminar.Lesson0003.Homework.Abstract.Mycollect;

import java.util.ArrayList;
import java.util.Collection;

public class MyObject extends Mycollect {
	/**
	 * Создает список, содержащий элементы указанного
	 * коллекции, в том порядке, в котором они возвращаются
	 * итератор.
	 *
	 * @param c         коллекция, элементы которой должны быть помещены в этот список
	 * @param mycollect
	 * @throws NullPointerException если указанная коллекция является нулевой
	 */
	public MyObject(Collection c, ArrayList mycollect) {
		super(c, mycollect);
	}
	
	/**
	 * Создает пустой список с начальной емкостью десять.
	 *
	 * @param mycollect
	 */
	public MyObject(ArrayList mycollect) {
		super(mycollect);
	}
	
	/**
	 * Создает пустой список с указанной начальной емкостью.
	 *
	 * @param initialCapacity начальная емкость списка
	 * @param mycollect
	 * @throws IllegalArgumentException если указанная начальная мощность
	 *                                  отрицательно
	 */
	public MyObject(int initialCapacity, ArrayList mycollect) {
		super(initialCapacity, mycollect);
	}
}
