import java.util.Scanner;
public class ResumeBuilder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        // Get the user's name.
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        // Get the user's contact information.
        System.out.println("What is your email address?");
        String email = scanner.nextLine();
        System.out.println("What is your phone number?");
        String phone = scanner.nextLine();
        // Get the user's education history.
        System.out.println("What is your highest level of education?");
        String education = scanner.nextLine();
        System.out.println("What schools did you attend?");
        String[] schools = scanner.nextLine().split(",");
        System.out.println("What degrees did you earn?");
        String[] degrees = scanner.nextLine().split(",");
        // Get the user's work experience.
        System.out.println("What jobs have you had?");
        String[] jobs = scanner.nextLine().split(",");
        System.out.println("What were your responsibilities at each job?");
        String[] responsibilities = scanner.nextLine().split(",");
        // Create a resume object and add the user's information to it.
        Resume resume = new Resume();
        resume.setName(name);
        resume.setEmail(email);
        resume.setPhone(phone);
        resume.setEducation(education);
        resume.setSchools(schools);
        resume.setDegrees(degrees);
        resume.setJobs(jobs);
        resume.setResponsibilities(responsibilities);
        // Print the resume to the console.
        System.out.println(resume);
    }
}
