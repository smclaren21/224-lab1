import java.util.Scanner;

public class SimpleQuiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = 0;

		System.out.println("Welcome to our quiz! \n Please answer questions by answering the number corresponding with your preferred response:");
		System.out.println("Please enter your name to begin:");
		String name = in.nextLine();
		//Question 1
		System.out.println("What is the island of the Eastern Coast of Africa?");
		System.out.println("A. Iceland		B. Madagascar");
		System.out.println("C. New Zealand	D. Russia");
		
		char answer1 = in.nextChar();
		if (answer1 == 'B' || answer1 == 'b') {
			score++;
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect");
		}
	}
}
