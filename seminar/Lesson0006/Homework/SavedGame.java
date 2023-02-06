package OOP_Java_Lessons.seminar.Lesson0006.Homework;

import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {

   private static final long serialVersionUID = 1L;

   private int[][] LabyrinthInfo;
   private int[][] ProgramInfo;

   public SavedGame(int[][] LabyrinthInfo, int[][] ProgramInfo){
       this.LabyrinthInfo = LabyrinthInfo;
       this.ProgramInfo = ProgramInfo;
   }

   public SavedGame(int[][] endArray){

   }

   public int[][] getLabyrinthInfo() {
       return LabyrinthInfo;
   }

   public void setLabyrinthInfo(int[][] LabyrinthInfo) {
       this.LabyrinthInfo = LabyrinthInfo;
   }

   public int[][] getProgramInfo() {
       return ProgramInfo;
   }

   public void setProgramInfo(int[][] ProgramInfo) {
       this.ProgramInfo = ProgramInfo;
   }


   @Override
   public String toString() {
       return "SavedGame{" +
               "LabyrinthInfo=" + Arrays.toString(LabyrinthInfo) +
               ", ProgramInfo=" + Arrays.toString(ProgramInfo) +
               
               '}';
   }
}