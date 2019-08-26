package oop_exercise;

public class Students {
	private String name;
	private String surname;
	private String classOfSchool;
	
	public Students (String name, String surname, String classOfSchool) {
		this.name=name;
		this.surname=surname;
		this.classOfSchool=classOfSchool;
				
	}
	
	public void printDeatilsOfStudents() {
		System.out.println("Students details: ");
		System.out.println("NAME: " +name+ " SURNAME: "+surname+ " CLASS: "+classOfSchool);
		
	}

}
