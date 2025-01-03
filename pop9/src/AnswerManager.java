import java.io.*;
import java.util.Scanner;

public class AnswerManager {
    private static final String FILE_PATH = "answers.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть відповідь (або 'exit' для виходу, 'show' для перегляду відповідей):");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Програма завершена.");
                break;
            } else if ("show".equalsIgnoreCase(input)) {
                displayAnswers();
            } else {
                saveAnswer(input);
                System.out.println("Відповідь збережена.");
            }
        }

        scanner.close();
    }

    private static void saveAnswer(String answer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(answer);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }

    private static void displayAnswers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            System.out.println("Збережені відповіді:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл з відповідями поки що не створений.");
        } catch (IOException e) {
            System.err.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
