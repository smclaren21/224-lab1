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

		//Question 3
                System.out.println("Who painted the Sistine Chapel?");
                System.out.println("A. Michelangelo       B. Raphael");
                System.out.println("C. Leonardo           D. Donatello");

                String answer3 = in.nextLine();
                if (answer3.toUpperCase().equals("A")) {
                        score++;
                        System.out.println("Correct!");
                } else {
                        System.out.println("Incorrect");
                }

		//question4
                System.out.println("Which of these countries' prime minister shit themself in a McDonalds?");
                System.out.println("A. Belgium            B. Canada");
                System.out.println("C. United Kingdom     D. Australia");
                String answer4 = in.nextLine();
                if(answer4.toUpperCase().equals("D")) {
                        System.out.println("Correct!");
                        score++;
                }else{
                        System.out.println("Incorrect");
                }

		//Question 5
                System.out.println("In a hypothetical universe, the speed of light is only half of its value in our universe (c/2).\n"
                		+ "An observer in this universe measures the speed of light while standing on a moving spaceship.\n"
                		+ "According to the theory of relativity, which of the following statements is true??");
                System.out.println("A. The measured speed of light on the spaceship will be equal to c/2, regardless of the spaceship's velocity                     B. The measured speed of light on the spaceship will always be greater than c/2, regardless of the spaceship's velocity");
                System.out.println("C. The measured speed of light on the spaceship will depend on the velocity of the spaceship and will be less than c/2           D. The measured speed of light on the spaceship will always be equal to c, regardless of the spaceship's velocity");

                String answer5 = in.nextLine();
                if (answer5.toUpperCase().equals("C")) {
                        score++;
                        System.out.println("Correct!");
                } else {
                        System.out.println("Incorrect");
                }
                
                if (score >= 4) {
                	System.out.println("Great job " + name + "! You scored " + score + "/5!");
                } else if (score == 3) {
                	System.out.println("Good job " + name + "! You scored " + score + "/5");
                } else {
                	System.out.println("Nice try " + name + ", but you only scored " + score + "/5 :(");
                }
	}
}
