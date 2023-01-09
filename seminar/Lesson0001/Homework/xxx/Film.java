package OOP_Java_Lessons.seminar.Lesson0001.Homework.xxx;

public class Film {
    String creator;
    String name;
    String genre;

    
    public Film(String creator, String name, String genre) {
        this.creator = creator;
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {

        return String.format(" >>> %s | %s | %s <<<",
            creator,
            name,
            genre);
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public String getGenre() {
        return genre;
    }


    public void info(){
        System.out.println("====================############=======================");
        System.out.printf("создатель: %s \n", creator);
        System.out.printf("Имя: %s \n", name);
        System.out.printf("Жанр: %s \n", genre);
        System.out.println("=======================================================");
    }
    
}
