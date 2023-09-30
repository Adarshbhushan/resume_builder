import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Resume Builder");
        System.out.println("------------------------------------");

        // Prompt the user for their personal information
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        // Prompt the user for their education information
        System.out.println("\nEducation:");
        System.out.print("Enter your degree: ");
        String degree = scanner.nextLine();
        System.out.print("Enter your university: ");
        String university = scanner.nextLine();
        System.out.print("Enter your graduation year: ");
        String graduationYear = scanner.nextLine();

        // Prompt the user for their work experience
        System.out.println("\nWork Experience:");
        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter the company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter the start date (e.g., MM/YYYY): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter the end date (e.g., MM/YYYY): ");
        String endDate = scanner.nextLine();
        System.out.print("Enter job description: ");
        String jobDescription = scanner.nextLine();

        // Print the generated resume
        System.out.println("\nGenerated Resume:");
        System.out.println("-----------------");
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("\nEducation:");
        System.out.println(" - Degree: " + degree);
        System.out.println(" - University: " + university);
        System.out.println(" - Graduation Year: " + graduationYear);
        System.out.println("\nWork Experience:");
        System.out.println(" - Job Title: " + jobTitle);
        System.out.println(" - Company Name: " + companyName);
        System.out.println(" - Start Date: " + startDate);
        System.out.println(" - End Date: " + endDate);
        System.out.println(" - Job Description: " + jobDescription);

        scanner.close();
    }
}
