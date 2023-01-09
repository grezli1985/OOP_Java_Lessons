package OOP_Java_Lessons.seminar.Lesson0002.Homework.Project;

/**
 * Класс хранения возможных родственных связей в виде строк-констант.
 */
public class Relationship {
	private final String DAUGHTER = "daughter";
	private  final String FATHER = "father";
	private  final String MOTHER = "mother";
	private  final String GRANDFATHER = "grandFather";
	private  final String GRANDMOTHER = "grandMother";
	private  final String SON = "son";
	private  final String GRANDSON = "grandSon";
	private  final String GRANDDAUGHTER = "grandDaughter";
	private  final String BROTHER = "brother";
	private  final String SISTER = "sister";
	private  final String COUSINSISTER = "cousinSister";
	private  final String COUSINBROTHER = "cousinBrother";
	private  final String STEPBROTHER = "stepBrother";
	private  final String STEPSISTER = "stepSister";
	private final String GREAT_GRANDFATHER = "greatGrandFather";
	private final String GREAT_GRANDMOTHER = "greatGrandMother";
	private final String GREAT_GRANDSON = "greatGrandson";
	
	
	/**
	 * Ниже описаны методы получения констант.
	 * @return - константы в виде строки.
	 */
	
	public String getGREAT_GRANDDAUGHTER() {
		return GREAT_GRANDDAUGHTER;
	}
	public String getGREAT_GRANDMOTHER() {
		return GREAT_GRANDMOTHER;
	}
	
	private final String GREAT_GRANDDAUGHTER = "greatGrandDaughter";
	
	public Relationship() {
	}
	
	public String getGREAT_GRANDSON() {
		return GREAT_GRANDSON;
	}
	
	public String getGREAT_GRANDFATHER() {
		return GREAT_GRANDFATHER;
	}
	
	
	public String getDAUGHTER() {
		return DAUGHTER;
	}
	
	public String getFATHER() {
		return FATHER;
	}
	
	public String getMOTHER() {
		return MOTHER;
	}
	
	public String getGRANDFATHER() {
		return GRANDFATHER;
	}
	
	public String getGRANDMOTHER() {
		return GRANDMOTHER;
	}
	
	public String getSON() {
		return SON;
	}
	
	public String getGRANDSON() {
		return GRANDSON;
	}
	
	public String getGRANDDAUGHTER() {
		return GRANDDAUGHTER;
	}
	
	public String getBROTHER() {
		return BROTHER;
	}
	
	public String getSISTER() {
		return SISTER;
	}
	
	public String getCOUSINSISTER() {
		return COUSINSISTER;
	}
	
	public String getCOUSINBROTHER() {
		return COUSINBROTHER;
	}
	
	public String getSTEPBROTHER() {
		return STEPBROTHER;
	}
	
	public String getSTEPSISTER() {
		return STEPSISTER;
	}
}
