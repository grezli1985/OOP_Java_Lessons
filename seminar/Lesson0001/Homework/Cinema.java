package OOP_Java_Lessons.seminar.Lesson0001.Homework;

import java.util.ArrayList;

// import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Cinema {
    // ArrayList<String> movie; // фильм
    private String movieTitles; // Названия фильмов
    private Integer year;  // год
    private String genre;  // жанр
    private String country;  // страна
    private String Producer; // Режиссёр

    public Cinema(){
        System.out.println("Cinema");
    }

    public Cinema(String movieTitles, Integer year, String genre, String country, String Producer){
        this.movieTitles = movieTitles;
        this.year = year;
        this.genre = genre;
        this.country = country;
        this.Producer = Producer;
    }



    public String getMovieTitles(){
        return movieTitles;
    }

    public void setMovieTitles(String newMovieTitles){
        movieTitles = newMovieTitles;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer newYear){
        if (newYear > 0){
            this.year = newYear; 
        }
        else {
            System.out.printf("Значения %d не может быть отрицательным!!!\n", newYear);
        }
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String newGenre){
        this.genre = newGenre;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String newCountry){
        this.country = newCountry;
    }

    public String getProducer(){
        return Producer;
    }

    public void setProducer(String newProducer){
        this.Producer = newProducer;
    }

    
    private void print(String str){
        System.out.println(str);
    }

    // private void print(Integer str){
    //     System.out.println(str);
    // }

    private void print(String str, String stri){
        System.out.printf(str, stri);
    }

    private void print(String str, Integer stri){
        System.out.printf(str, stri);
    }


    public void info(){
        print("=====================###INFO####=======================");
        print("Названия фильмов: %s \n", getMovieTitles());
        print("год: %d \n", getYear());
        print("жанр: %s \n", getGenre());
        print("страна: %s \n", getCountry());
        print("Режиссёр: %s \n", getProducer());
        print("=======================================================");
    }
    
}


