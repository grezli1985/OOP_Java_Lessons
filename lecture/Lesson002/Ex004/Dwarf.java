package OOP_Java_Lessons.lecture.Lesson002.Ex004;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}