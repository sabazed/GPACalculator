import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to GPA Calculator!");
        System.out.println("=====================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many subjects would you like to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        Subject[] subjects = new Subject[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter " + "N" + (i + 1) + " Subject's Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the number of credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            subjects[i] = new Subject(name, score, credits);
            System.out.println();
        }

        int totalCredits = 0;
        float totalGPA = 0;
        System.out.println("GPA for each class:");
        for (Subject s : subjects) {
            System.out.println(s.toString());
            totalCredits += s.getCredits();
            totalGPA += s.getCredits() * s.getGPA();
        }

        System.out.println();
        System.out.println("Total credits: " + totalCredits);
        System.out.println("=====================================================");
        System.out.println("Final GPA: " + totalGPA / totalCredits);
    }

}
