import java.util.Random;

public class Question {
    //This class generates a random arithmetic question and validate an answer
    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;

    public Question(){
        Random random = new Random(); //Without a seed defined, the random method uses a seed based on the system time

        this.operand1 = random.nextInt(100) + 1;
        this.operand2 = random.nextInt(100) + 1;

        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[random.nextInt(operators.length)]; //Choose a random operator from the list

        //Calculate the right answer and stores it at "correctAnswer"
        calculateAnswer();
    }

    private void calculateAnswer(){
        switch (operator){
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2; //In this cast, as operand1 and operand2 are integers, is necessary to do a type casting
                break;
        }
    }

    public void generateQuestion() {
        System.out.println("What is " + this.operand1 + " " + operator + " " + this.operand2 + "?");
    }

    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001; // Allowing a small tolerance for floating-point answers
    }
}
