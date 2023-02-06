package OOP_Java_Lessons.seminar.Lesson0006.Homework;


// import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Labyrinth {
    

    public static int [][] sozdanieLabirinta(){
        System.out.println("Какой способ ввода лабиринта ты хочешь использовать");
        System.out.println("1. - рандомный - 2. мануальный - 3. save");
        System.out.println("--> ");
        int vibor;

        try (Scanner scan = new Scanner(System.in)) {
            vibor = scan.nextInt();

            int mSizeCol = 0;
            int mSizeRow = 0;
            

            if(vibor == 1){
                int min = 5;
                int max = 20;
                mSizeCol = (int) (Math.random() * (max - min + 1) + min);
                mSizeRow = (int) (Math.random() * (max - min + 1) + min);
            }
            else if(vibor == 2){
                System.out.print("Введите колонны - ");
                mSizeCol = scan.nextInt();
                System.out.print("Введите строки - ");
                mSizeRow = scan.nextInt();
            }
            else if(vibor == 3) {
                try {
                    List allLines = Files.readAllLines(Paths.get("SaveMaze.txt"));
                    for (Object line : allLines) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            
            }
            else{

            }
            int [][] labyrinth = new int [mSizeRow][mSizeCol];
            System.out.println(labyrinth.length + " " + labyrinth[0].length);
            return labyrinth;
        }
        
    }

    public static int[][] init(){
        int[][] initArray = sozdanieLabirinta();
        Random rnd = new Random(0);
        int length = initArray.length;
        int length2 = initArray[0].length;

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length2; k++) {
                initArray[i][k] = 1;
                System.out.print(initArray[i][k] + " ");
            }
            System.out.println(" ");
        }
        
        
        for (int i = 0; i < length2; i++) {
            initArray[0][i] = 0;
            for (int k = 0; k < length; k++) {
                initArray[k][length2 - 1] = 0;
            }
        }
        System.out.println("=======================");
        return initArray;

    }


// //  // Метод записывает полученный лабиринт в файл либо инициирует запуск новой генерации
//     public static void saveSystem(String[][] sozdanieLabirinta) throws IOException {
        
//         FileWriter logMaze = new FileWriter("SaveMaze.txt", false);
//         for (int i = 0; i < sozdanieLabirinta.length; i++) {
//             for (int j = 0; j < sozdanieLabirinta.length; j++) {
//                 if (sozdanieLabirinta[i][j] == "1") {                
//                     logMaze.write("###");
//                 } else {                       
//                     logMaze.write(String.format("%3s", sozdanieLabirinta[i][j]));
//                 }
//                 if (j == sozdanieLabirinta.length-1) {
//                     logMaze.write("\n");
//                 }
//             }
//         }
//         logMaze.flush();
//         logMaze.close();
//     }
}