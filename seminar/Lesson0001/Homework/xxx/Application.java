package OOP_Java_Lessons.seminar.Lesson0001.Homework.xxx;

import java.util.Scanner;

public class Application {
    public static void run() {

        DbApi dbApi = new DbApi();
        dbApi.init();
    
        Db db = dbApi.getGb();
    
        FilmFinder ff = new FilmFinder(db);
        System.out.println("Добро пожаловать в Кино список\n=============*****===========.");
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("" +
                "1.Показать Весь список фильмов\n" +
                "2.Найти фильм(ы) по названию\n" +
                "3.Добавить фильм\n" +
                "4.Выход");
            System.out.print("Введите номер команды: ");
            int id = scan.nextInt();
            if (id == 1){
                ff.Info();
            }
            // System.out.println(ff.getFilmBy(id));
        }
    }
    
}
