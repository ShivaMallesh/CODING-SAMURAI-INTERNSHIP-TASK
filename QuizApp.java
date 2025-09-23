import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    int correctOption; 

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption + 1;
    }

    public String getCorrectAnswer() {
        return options[correctOption];
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("What is the capital of India?", new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 1),
            new Question("Which language is used for Android development?", new String[]{"Python", "Java", "Swift", "C++"}, 1),
            new Question("Who is known as the father of Java?", new String[]{"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup", "Guido van Rossum"}, 1)
        };

        int score = 0;

        System.out.println("🧠 Welcome to the Quiz!");
        System.out.println("----------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions[i].display();
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect. Correct answer: " + questions[i].getCorrectAnswer());
            }
        }

        System.out.println("\n🎉 Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }

}
