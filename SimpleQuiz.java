import java.util.Scanner;

public class SimpleQuiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = 0;

		System.out.println("Welcome to our quiz! \nPlease answer questions by answering the letter corresponding with your preferred response:");
		System.out.println("Please enter your name to begin:");
		String name = in.nextLine();
		//Question 1
		System.out.println("What is the island of the Eastern Coast of Africa?");
		System.out.println("A. Iceland		B. Madagascar");
		System.out.println("C. New Zealand	D. Russia");
		
		String answer1 = in.nextLine();
		if (answer1.toUpperCase().equals("B")) {
			score++;
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect");
		}


		//question2
                System.out.println("What is the correct term for a group of crows?");
                System.out.println("A. a killing         B. a party");
                System.out.println("C. a murder          D. a flock");
                String answer2 = in.nextLine();
                if(answer2.toUpperCase().equals("C")) {
                        System.out.println("Correct!");
                        score++;
                }else{
                        System.out.println("Incorrect");
                }
	}
}
