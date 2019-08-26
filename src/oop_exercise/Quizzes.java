package oop_exercise;

import java.util.Random;

public class Quizzes {
		
	Random number = new Random();
		
	public Quizzes() {
			
		
	}
	
	protected String randomQuiz() {
		String questions[];
		questions = new String[] {
				"What is the Spanish capital? MADRID/PARIS",
				"Where is the Gioconda picture? MADRID/PARIS",
				"Where is the Coloseum? ROME/FLORENCE",
				"What is the French capital? MADRID/PARIS",
				"Where is the London bridge? LONDON/LIVERPOOL",
				"Where is the Corsica island? ITALY/FRANCE",
				"Where is the Australia? Sud of Japan/Nord of Great Britain",
				"Where is the Cina? Sud of South Africa/Nord of Vietnam",
				"What is the prime number? 3/8",
				"What is biggest? SUN/MOON",
				"Where is the Amazzonia? America/Australia",
				"What is the USA President? Trump/Bush",
				"Where is the Tour Eiffel? LONDON/PARIS",
				"What is the correct result (2*2*2)/2? 4/16",
				"What is most related to NaCl? Chemistry/Maths",
				"What is higher Tour Eiffel or Torre di Pisa? Tour Eiffel/Torre di Pisa"
				
		};

		int random = number.nextInt(questions.length);
		return questions[random];

	}


	
	public void printQuizFirstClass() {
		System.out.println("QUIZ FIRST CLASS(3 questions): ");
		System.out.println("QUESTION 1: " +randomQuiz());
		System.out.println("QUESTION 2: " +randomQuiz());
		System.out.println("QUESTION 3: " +randomQuiz());
	
	}
	
	public void printQuizSecondClass() {
		System.out.println("QUIZ SECOND CLASS(4 questions): ");
		System.out.println("QUESTION 1: " +randomQuiz());
		System.out.println("QUESTION 2: " +randomQuiz());
		System.out.println("QUESTION 3: " +randomQuiz());
		System.out.println("QUESTION 4: " +randomQuiz());
	
	}

	public void printQuizThirdClass() {
		System.out.println("QUIZ THIRD CLASS(5 questions): ");
		System.out.println("QUESTION 1: " +randomQuiz());
		System.out.println("QUESTION 2: " +randomQuiz());
		System.out.println("QUESTION 3: " +randomQuiz());
		System.out.println("QUESTION 4: " +randomQuiz());
		System.out.println("QUESTION 5: " +randomQuiz());
	
	}
}
