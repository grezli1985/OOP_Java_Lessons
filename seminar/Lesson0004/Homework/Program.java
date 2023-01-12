package OOP_Java_Lessons.seminar.Lesson0004.Homework;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] endArray = Labyrinth.init();
        int pers = 5;
        int moveX = 0;
        int moveY = 0;
        char wasd;
        endArray[moveY][moveX] = pers;

        for (int i = 0; i < endArray.length; i++) {
            for (int k = 0; k < endArray[0].length; k++) {
                System.out.print(endArray[i][k] + " ");
            }
            System.out.println("  ");
        }

        System.out.println("Выберити как вы хотите пройти лабиринт: 1.Авто - 2.Мануал");
        int viborAvtoManual = scan.nextInt();

        if(viborAvtoManual == 1){
            while(endArray[endArray.length - 1][endArray[0].length - 1] != pers){
                
                for (int i = 0; i < endArray.length; i++) {
                    for (int k = 0; k < endArray[0].length; k++) {
                        System.out.print(endArray[i][k] + " ");
                    }
                    System.out.println("");
                }
                System.out.println();

                if(moveX + 1 > endArray[0].length - 1 || endArray[moveY][moveX + 1] == 1){
                    if(moveY + 1 > endArray.length || endArray[moveY + 1][moveX] == 1){
                        if (moveX - 1 < 0 || endArray[moveY][moveX - 1] == 1){
                            if(moveY - 1 < 0 || endArray[moveY - 1][moveX] == 1){
                                
                            }else {
                                endArray[moveY][moveX] = 0;
                                moveY = moveY - 1;
                                endArray[moveY][moveX] = pers;
                                continue;
                            }
                        }else{
                            endArray[moveY][moveX] = 0;
                            moveX = moveX - 1;
                            endArray[moveY][moveX] = pers;
                            continue;
                        }
                    }else {
                        endArray[moveY][moveX] = 0;
                        moveY = moveY + 1;
                        endArray[moveY][moveX] = pers;
                        continue;
                    }
                }else {
                    endArray[moveY][moveX] = 0;
                    moveX = moveX + 1;
                    endArray[moveY][moveX] = pers;
                    continue;
                }



            }
        }
        else if(viborAvtoManual == 2) {
            System.out.println(" Ходи с помощью w a s d ");
            while(endArray[endArray.length - 1][endArray[0].length - 1] != pers){
                wasd = scan.next().charAt(0);

                switch(wasd){
                    case 'a': {
                        if (moveX - 1 < 0 || endArray[moveY][moveX - 1] == 1){
                            System.out.println("Там стена!");
                            break;
                        }else{
                            endArray[moveY][moveX] = 0;
                            moveX = moveX - 1;
                            break;
                        }
                    }
                    case 's': {
                        if(moveY + 1 > endArray.length || endArray[moveY + 1][moveX] == 1){
                            System.out.println("Там стена!");
                            break;
                        }else {
                            endArray[moveY][moveX] = 0;
                            moveY = moveY + 1;
                            break;
                        }
                    }
                    case 'd': {
                        if(moveX + 1 > endArray[0].length - 1 || endArray[moveY][moveX + 1] == 1){
                            System.out.println("Там стена!");
                            break;
                        }else {
                            endArray[moveY][moveX] = 0;
                            moveX = moveX + 1;
                            break;
                        }
                    }
                    case 'w': {
                        if(moveY - 1 < 0 || endArray[moveY - 1][moveX] == 1){
                            System.out.println("Там стена!");
                            break;
                        }else {
                            endArray[moveY][moveX] = 0;
                            moveY = moveY - 1;
                            break;
                        }
                    }    
                }
                endArray[moveY][moveX] = pers;

                for (int i = 0; i < endArray.length; i++) {
                    for (int k = 0; k < endArray[0].length; k++) {
                        System.out.print(endArray[i][k] + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Ура!!!");
        System.out.println("-->");
        for (int i = 0; i < endArray.length; i++) {
            for (int k = 0; k < endArray[0].length; k++) {
                System.out.print(endArray[i][k] + " ");
            }
            System.out.println("");
        }
    }
}