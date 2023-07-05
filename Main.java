public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Male", "1980-01-01", null, "455");
        Person person2 = new Person("Mary", "Female", "1985-02-01", null, "4676");
        Person person3 = new Person("Alice", "Female", "2010-03-01", null, "234565");

        person1.setId("1");
        person2.setId("2");
        person3.setId("3");

        FamilyTree familyTree = new FamilyTree();

        familyTree.addPerson(person1);
        familyTree.addPerson(person2);
        familyTree.addPerson(person3);

        familyTree.addRelationship("1", "2");
        familyTree.addRelationship("2", "3");

        UserInterface ui = new UserInterface(familyTree);
        ui.displayFamilyTree();
    }
}