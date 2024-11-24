//Here is a Java code snippet that implements a blood donation survey in a college. It takes input for name, age, weight, and blood group, validates the criteria (age between 18 and 65, weight more than 50 kgs, and valid blood group), and determines if the person is eligible for blood donation:

import java.util.Scanner;

public class BloodDonationSurvey {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter weight (in kgs): ");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter blood group: ");
            String bloodGroup = scanner.nextLine();

            if (age >= 18 && age <= 65 && weight > 50 && isValidBloodGroup(bloodGroup)) {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Weight: " + weight + " kgs");
                System.out.println("Blood Group: " + bloodGroup);
                System.out.println("Eligible for blood donation: Yes");
            } else {
                System.out.println("Not eligible for blood donation: No");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values for age and weight.");
        }
    }

    private static boolean isValidBloodGroup(String bloodGroup) {
        String[] validBloodGroups = {"A", "B", "AB", "O"};
        for (String group : validBloodGroups) {
            if (bloodGroup.equalsIgnoreCase(group)) {
                return true;
            }
        }
        return false;
    }
}
