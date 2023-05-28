import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<String> keywordsPrint = new ArrayList<>(
                Arrays.asList("print", "psat", "sysout", "sout", "napsat")
        );
        ArrayList<String> keywordsWhileLoop = new ArrayList<>(
                Arrays.asList("while", "while loop", "whileloop", "kolecko")
        );
        ArrayList<String> keywordsForLoop = new ArrayList<>(
                Arrays.asList("for", "fori", "for i", "fori loop", "for i loop")
        );
        ArrayList<String> keywordsIfStatement = new ArrayList<>(
                Arrays.asList("if", "if()", "pokud", "kdyz", "if else")
        );
        ArrayList<String> keywordsElseStatment = new ArrayList<>(
                Arrays.asList("else", "if else", "else()", "tak")
        );
        ArrayList<String> keywordsSwitchStatement = new ArrayList<>(
                Arrays.asList("switch", "case", "switche", "switch{", "case:")
        );
        ArrayList<String> keywordsRandom = new ArrayList<>(
                Arrays.asList("random", "nahodne", "náhodné", "sout", "napsat")
        );
        ArrayList<String> keywordsScanner = new ArrayList<>(
                Arrays.asList("print", "psat", "sysout", "sout", "napsat")
        );
        ArrayList<String> keywordsArray = new ArrayList<>(
                Arrays.asList("print", "psat", "sysout", "sout", "napsat")
        );
        ArrayList<String> keywordsString = new ArrayList<>(
                Arrays.asList("print", "psat", "sysout", "sout", "napsat")
        );

        while (true) {
            System.out.print("You: ");
            String input = inputScanner.nextLine();
            input = input.toLowerCase();

            for (String s : keywordsPrint) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To print something in Java, you can use the System.out.println() method.");
                    break;
                }
            }
            for (String s : keywordsWhileLoop) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create a while loop in Java, use the following syntax:\nwhile (condition) {\n  // code to be executed\n}");
                    break;
                }
            }
            for (String s : keywordsForLoop) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create a for loop in Java, use the following syntax:\nfor (initialization; condition; update) {\n  // code to be executed\n}");
                    break;
                }
            }
            for (String s : keywordsIfStatement) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create an if statement in Java, use the following syntax:\nif (condition) {\n  // code to be executed\n}");
                    break;
                }
            }
            for (String s : keywordsElseStatment) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create an else statement in Java, use the following syntax:\nelse {\n  // code to be executed\n}");
                    break;
                }
            }
            for (String s : keywordsSwitchStatement) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create a switch statement in Java, use the following syntax:\nswitch (expression) {\n  case value1:\n    // code to be executed\n    break;\n  case value2:\n    // code to be executed\n    break;\n  ...\n  default:\n    // code to be executed if none of the cases are true\n}");

                    break;
                }
            }
            for (String s : keywordsRandom) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To generate a random number in Java, use the java.util.Random class. Here's an example:\nimport java.util.Random;\n...\nRandom rand = new Random();\nint randomNum = rand.nextInt(max - min + 1) + min;");
                    break;
                }
            }
            for (String s : keywordsScanner) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create a Scanner object in Java, use the following syntax:\nimport java.util.Scanner;\n...\nScanner scanner = new Scanner(System.in);");

                    break;
                }
            }
            for (String s : keywordsArray) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create an array in Java, use the following syntax:\nint[] myArray = new int[5];\nmyArray[0] = 1;\nmyArray[1] = 2;\n...\nmyArray[4] = 5;");

                    break;
                }
            }
            for (String s : keywordsString) {
                if (input.contains(s)) {
                    System.out.println("Chatbot: To create a String object in Java, use the following syntax:\nString myString = \"Hello, world!\";");

                    break;
                }
            }
            if (input.contains("exit")){
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            else {
                System.out.println("Chatbot: I'm sorry, I don't understand. Please try again.");
            }
        }
        inputScanner.close();
    }
}