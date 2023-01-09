package OOP_Java_Lessons.seminar.Lesson0001.Homework;

public class MyProgram {
    public static void main(String[] args) {
        Cinema film1 = new Cinema("Аватар", 2009, "боевик, фантастика, драма, приключения", "США", "Джеймс Кэмерон");

        // film1.setMovieTitles("Аватар");
        // film1.setCountry("США");
        // film1.setYear(2009);
        // film1.setGenre("боевик, фантастика, драма, приключения");
        // film1.setProducer("Джеймс Кэмерон");


        film1.info();

        Film film2 = new Film();

        film2.setCountry("24");
        film2.info();
    }
}
