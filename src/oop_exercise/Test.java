package oop_exercise;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teachers teacher1 = new Teachers ("Michael Jefferson", "1 Class");
		Teachers teacher2 = new Teachers ("Paul Coulomb", "2 Class");
		Teachers teacher3 = new Teachers ("Luise Ayola", "3 Class");
		Students student1 = new Students ("Frank", "Keats", "1 Class");
		Students student2 = new Students ("Sofia", "Smith", "1 Class");
		Students student3 = new Students ("Amelia", "Brown", "1 Class");
		Students student4 = new Students ("Emma", "Jones", "2 Class");
		Students student5 = new Students ("Isabella", "Garcia", "2 Class");
		Students student6 = new Students ("Mia", "Rodriguez", "2 Class");
		Students student7 = new Students ("Charlotte", "Lopez", "3 Class");
		Students student8 = new Students ("Emily", "Thomas", "3 Class");
		Students student9 = new Students ("Olivia", "Gonzalez", "3 Class");

		Quizzes quizFirstClass = new Quizzes();
		Quizzes quizSecondClass = new Quizzes();
		Quizzes quizThirdClass = new Quizzes();
		
		
		//teacher1.printDeatilsOfTeachers();
		//student1.printDeatilsOfStudents();
		quizFirstClass.printQuizFirstClass();
		quizSecondClass.printQuizSecondClass();
		quizThirdClass.printQuizThirdClass();
		
	}
}
