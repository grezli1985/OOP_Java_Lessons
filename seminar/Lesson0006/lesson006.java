package OOP_Java_Lessons.seminar.Lesson0006;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class lesson006 {
    public static void main(String args[])throws IOException {
        File file = new File("Example.txt");
        
        // Создание файла
        file.createNewFile();
        
        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file); 
        
        // Запись содержимого в файл
        writer.write("Это простой пример,\n в котором мы осуществляем\n с помощью языка Java\n запись в файл\n и чтение из файла\n"); 
        writer.flush();
        writer.close();
  
        // Создание объекта FileReader
        FileReader fr = new FileReader(file); 
        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив
        
        for(char c : a)
           System.out.print(c);   // Вывод символов один за другими
        fr.close();
     }
}
