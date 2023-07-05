import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private FamilyTree familyTree;

    public UserInterface(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Family Tree Application ===");
            System.out.println("1. Display Family Tree");
            System.out.println("2. Add Person");
            System.out.println("3. Add Relationship");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayFamilyTree();
                    break;
                case 2:
                    addPerson(scanner);
                    break;
                case 3:
                    addRelationship(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Exiting the Family Tree Application.");
        scanner.close();
    }

    void displayFamilyTree() {
        System.out.println("=== Family Tree ===");
        Person root = familyTree.getRootPerson();

        displayFamilyTreeRecursive(root, 0);
    }

    private void displayFamilyTreeRecursive(Person person, int generation) {
        // Indentation based on the generation level
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < generation; i++) {
            indent.append("  ");
        }

        System.out.println(indent + "- " + person.getName() + " (ID: " + person.getId() + ")");

        ArrayList<Person> children = person.getChildren();
        for (Person child : children) {
            displayFamilyTreeRecursive(child, generation + 1);
        }
    }

    private void addPerson(Scanner scanner) {
        System.out.println("=== Add Person ===");
        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the person's gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter the person's date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter the person's date of death (or leave blank if alive): ");
        String dateOfDeath = scanner.nextLine();
        System.out.print("Enter the person's id: ");
        String id = scanner.nextLine();

        Person person = new Person(name, gender, dateOfBirth, dateOfDeath, id);
        familyTree.addPerson(person);

        System.out.println("Person added successfully.");
    }

    private void addRelationship(Scanner scanner) {
        System.out.println("=== Add Relationship ===");
        System.out.print("Enter the parent's ID: ");
        String parentId = scanner.nextLine();
        System.out.print("Enter the child's ID: ");
        String childId = scanner.nextLine();

        familyTree.addRelationship(parentId, childId);

        System.out.println("Relationship added successfully.");
    }
}