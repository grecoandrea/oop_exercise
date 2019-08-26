package oop_exercise;

public class Teachers {
	private String nameAndSurname;
	private String classOfSchool;
	
	public Teachers (String nameAndSurname, String classOfSchool) {
		this.nameAndSurname=nameAndSurname;
		this.classOfSchool=classOfSchool;
	}
	
	public void printDeatilsOfTeachers() {
		System.out.println("Teacher details: ");
		System.out.println("Name and Surname: "+nameAndSurname+ ", Class: "+classOfSchool);
	}

}
