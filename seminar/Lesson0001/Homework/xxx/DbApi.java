package OOP_Java_Lessons.seminar.Lesson0001.Homework.xxx;

public class DbApi {
    int cinemaIdGenerator;
    int filmProducerIdGenerator;
    int genreIdGenerator;

    Db db;

    private int getGenreId() {
        return genreIdGenerator++;
    }

    public void init() {
        db = new Db();

        FilmProducer fp1 = new FilmProducer(1, "Ленфильм");
        FilmProducer fp2 = new FilmProducer(2, "Мосфильм");
        FilmProducer fp3 = new FilmProducer(3, "Марвел");
        FilmProducer fp4 = new FilmProducer(4, "20th Century Fox");
        genreIdGenerator = 1;

        db.filmProducers.add(fp1);
        db.filmProducers.add(fp2);
        db.filmProducers.add(fp3);
        db.filmProducers.add(fp4);

        Genre g1 = new Genre(getGenreId(), "Комедия");
        Genre g2 = new Genre(getGenreId(), "Х/ф");
        Genre g3 = new Genre(getGenreId(), "Драма");
        Genre g4 = new Genre(getGenreId(), "Ужасы");
        Genre g5 = new Genre(getGenreId(), "фантастика");
        Genre g6 = new Genre(getGenreId(), "боевик");
        Genre g7 = new Genre(getGenreId(), "приключения");

        db.genres.add(g1);
        db.genres.add(g2);
        db.genres.add(g3);
        db.genres.add(g4);
        db.genres.add(g5);
        db.genres.add(g6);
        db.genres.add(g7);

        db.films.add(new Cinema(1, 2, "Особенности национальной охоты", 1));
        db.films.add(new Cinema(1, 3, "Паук", 4));
        db.films.add(new Cinema(1, 1, "Приключения шурика", 2));
        db.films.add(new Cinema(1, 4, "Аватар", 5));
        db.films.add(new Cinema(1, 5, "Дэдпул", 5));
    
    }   

    public Db getGb() {
        return db;
    }

}
