package OOP_Java_Lessons.seminar.Lesson0001;

import java.lang.Thread.State;
import java.util.HashMap;
import java.util.Random;
import java.lang.reflect.Array;


/* Составить частотный словарь элементов массива

        Частотный словарь содержит информацию о том, 
        сколько раз встречается элемент входных данных.

        Пример: 
        Есть набор данных 

        ```
        { 1, 9, 9, 0, 2, 8, 0, 9 }
        ```
        частотный массив может быть представлен так:
        ```
        0 встречается 2 раза
        1 встречается 1 раз
        2 встречается 1 раз
        8 встречается 1 раз
        9 встречается 3 раза
        ```
        Если набор данных - таблица
        ```
    */


// public class lesson01 {   
//     public static void main(String[] args) {
//         new Printer().print(new Jober(new DataProvider().getData()).job());
//     }
    

//     class Jober {
//         int[] data;

//         public Jober(int[] input) {
//             data = new int[input.length];
//             for (int i = 0; i < input.length; i++) {
//                 data[i] = input[i];
//             }
//         }

//         public int[] job() {
//             int max = 30;
//             int[] result = new int[max];

//             for (int i = 0; i < data.length; i++) {
//                 result[data[i]]++;
//             }
//             return result;
//         }

//     }

//     class Printer {
//         public void print(int[] dict) {
//             for (int i = 0; i < dict.length; i++) {
//                 if (dict[i] != 0) {
//                     System.out.printf("%d встречается %d\n", i, dict[i]);
//                 }   
//             }
//         }
//     }

//     class DataProvider {
//         int[] getData() {
//             return new int[] { 1, 9, 9, 0, 2, 8, 0, 9 };
//         }
//     }
        
// }



    //         void Zadacha57()
    // {

    //     Random random = new Random();
    //     int rows = random.Next(2, 5);
    //     int columns = random.Next(3, 5);

    //     int[,] array = new int[rows, columns];
    //     int[] dictionary = new int[10];

    //     FillArray(array, rows, columns);
    //     PrintArray(array, rows, columns);
        
    //     for (int i = 0; i < rows; i++)
    //     {
    //         for (int j = 0; j < columns; j++)
    //         {
    //             dictionary[array[i, j]] ++;
    //         }
    //     }

    //     for (int i = 0; i < dictionary.Length; i++)
    //     {
    //         if(dictionary[i] != 0) Console.WriteLine($"Элемент {i} втречается {dictionary[i]} раз");
    //     }


    // }




    // public static FillArray(int[] dictionary){
    //     // Random random = new Random();

    //     for (int i = 0; i < rows; i++){
    //             dictionary[i] = random.Next(0, 10);
    //     }
    // }
    

    // void PrintArray(int[,] array, int rows, int columns)
    // {
    //     Console.WriteLine();
    //     for (int i = 0; i < rows; i++)
    //     {
    //         for (int j = 0; j < columns; j++)
    //         {
    //             Console.Write(array[i, j] + " |" + "\t");
    //         }
    //         Console.WriteLine();
    //     }
    //     Console.WriteLine();
        
    // }

    // Zadacha57();
    


    


