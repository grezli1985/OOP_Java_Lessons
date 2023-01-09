package OOP_Java_Lessons.seminar.Lesson0001.Homework.xxx;



public class FilmFinder {
    String creator;
    String name;
    String genre;
    Db db;

    public FilmFinder(Db db) {
        this.db = db;
    }

    public Film getFilmBy(int id) {

        Cinema c = db.films.get(id - 1);

        Genre g = db.genres.get(c.genreId - 1);
        FilmProducer p = db.filmProducers.get(c.creatorId - 1);

        return new Film(p.titleName, c.name, g.name);

    }
    
    public void Info(){
        System.out.println("====================############=======================");
        System.out.printf("создатель: %s \n", creator);
        System.out.printf("Имя: %s \n", name);
        System.out.printf("Жанр: %s \n", genre);
        System.out.println("=======================================================");

    }
}
