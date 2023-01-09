package OOP_Java_Lessons.seminar.Lesson0003.Homework.Abstract;

import OOP_Java_Lessons.seminar.Lesson0003.Homework.Interface.ElementRepeatable;

import java.util.*;

/**
 * Коллекции, которые после получения итерируемых данных в ArrayList,
 * сразу считать частотный словарь элементов.
 * @param <U>
 */
public abstract class Mycollect<U> extends ArrayList<U> implements ElementRepeatable<U> {
	private ArrayList<U> mycollect;
	private HashMap<U,Integer> frequencyDictionary;
	
	/**
	 * Создает список, содержащий элементы указанного
	 * коллекции в том порядке, в котором они возвращаются
	 * итератор.
	 *
	 * @param c коллекция, элементы которой должны быть помещены в этот список
	 * @throws NullPointerException если указанная коллекция является нулевой
	 */
	public Mycollect(Collection<? extends U> c, ArrayList<U> mycollect) {
		super(c);
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	/**
	 * Создает пустой список с начальной емкостью десять.
	 */
	public Mycollect(ArrayList<U> mycollect) {
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	/**
	 * Создает пустой список с указанной начальной емкостью.
	 *
	 * @param initialCapacity начальная емкость списка
	 * @throws IllegalArgumentException если указанная начальная мощность
	 *                                  отрицательно
	 */
	public Mycollect(int initialCapacity, ArrayList<U> mycollect) {
		super(initialCapacity);
		this.mycollect = mycollect;
		this.frequencyDictionary = this.getCountRepeatable();
	}
	
	public ArrayList<U> getMycollect() {
		return mycollect;
	}
	
	public void setMycollect(ArrayList<U> mycollect) {
		this.mycollect = mycollect;
	}
	
	public HashMap<U, Integer> getFrequencyDictionary() {
		return frequencyDictionary;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Mycollect<?> mycollect1)) return false;
		if (!super.equals(o)) return false;
		return getMycollect().equals(mycollect1.getMycollect()) && Objects.equals(getFrequencyDictionary(), mycollect1.getFrequencyDictionary());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getMycollect(), getFrequencyDictionary());
	}
	
	/**
	 * Метод анализирует коллекцию на наличие в ней повторяющихся элементов.
	 * @return - Словарь повторений элементов коллекции.
	 * Ключ — уникальный элемент, значение — количество повторений в коллекции.
	 */
	@Override
	public HashMap<U, Integer> getCountRepeatable() {
		HashMap<U,Integer> result = new HashMap<>();
		for (U obj: this.mycollect) {
			if (result.containsKey(obj)){
				result.put(obj, result.get(obj) + 1);
			}
			result.putIfAbsent(obj,1);
		}
		return result;
	}
}
