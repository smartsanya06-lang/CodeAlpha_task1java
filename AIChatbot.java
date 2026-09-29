import java.util.Scanner;

public class AIChatbot {

    // NLP: Convert user input into a normalized form
    static String preprocess(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("[^a-zA-Z0-9 ]", "");
        return input.trim();
    }

    // Generate chatbot response
    static String getResponse(String input) {

        input = preprocess(input);

        // Greetings
        if (input.contains("hello") ||
            input.contains("hi") ||
            input.contains("hey")) {

            return "Hello! How can I help you?";
        }

        // Name
        else if (input.contains("your name") ||
                 input.contains("who are you")) {

            return "I am JavaBot, a simple AI chatbot.";
        }

        // How are you
        else if (input.contains("how are you")) {

            return "I'm doing great! Thanks for asking.";
        }

        // College / course
        else if (input.contains("course") ||
                 input.contains("college")) {

            return "I can help you with basic information about courses and college.";
        }

        // Programming
        else if (input.contains("java")) {

            return "Java is an object-oriented programming language.";
        }

        else if (input.contains("python")) {

            return "Python is a popular programming language used in AI, data science and web development.";
        }

        // Help
        else if (input.contains("help")) {

            return "Sure! You can ask me about Java, Python, courses, or general questions.";
        }

        // Thank you
        else if (input.contains("thank")) {

            return "You're welcome!";
        }

        // Goodbye
        else if (input.contains("bye") ||
                 input.contains("exit") ||
                 input.contains("goodbye")) {

            return "Goodbye! Have a great day!";
        }

        // Unknown question
        else {

            return "Sorry, I don't understand that yet. Please ask another question.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       JAVA AI CHATBOT");
        System.out.println("=================================");
        System.out.println("Type 'bye' to exit.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);

            System.out.println("Bot: " + response);

            if (preprocess(userInput).contains("bye") ||
                preprocess(userInput).contains("exit") ||
                preprocess(userInput).contains("goodbye")) {
                break;
            }
        }

        sc.close();
    }
}