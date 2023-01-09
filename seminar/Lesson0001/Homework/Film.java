package OOP_Java_Lessons.seminar.Lesson0001.Homework;

public class Film extends Cinema {

    public Film(String movieTitles, Integer year, String genre, String country, String Producer) {
        super(movieTitles, year, genre, country, Producer);
    }

    public Film(){
        System.out.println("Films");
    }

    @Override
    public String toString() {
        return "Film []";
    }



}
    

