import java.util.Scanner;

public class MathQuiz {
    //This class runs a five question quiz and track the user score
    private int score;

    public void MathQuiz(){
        this.score = 0;
    }

    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            askQuestion(scanner);
        }

    }

    private void askQuestion(Scanner scanner){
        //init the question class
        Question question = new Question();
        question.generateQuestion(); //Print the random question

        //Expects the user answer
        System.out.print("User Answer: ");
        double userAnswer = scanner.nextDouble();

        if (question.checkAnswer(userAnswer)){
            System.out.println("Right Answer!!!");
            this.score++;
        }
        else{
            System.out.println("Wrong Answer!!!");
        }
    }

}
