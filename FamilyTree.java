import java.util.HashMap;

public class FamilyTree {
    private HashMap<String, Person> people;

    public FamilyTree() {
        people = new HashMap<>();
    }

    public void addPerson(Person person) {
        people.put(person.getId(), person);
    }

    public void addRelationship(String parentId, String childId) {
        Person parent = people.get(parentId);
        Person child = people.get(childId);
        if (parent != null && child != null) {
            parent.addChild(child);
        }
        else {
            if (parent == null) {
                System.out.println("Parent with ID " + parentId + " not found.");
            }
            if (child == null) {
                System.out.println("Child with ID " + childId + " not found.");
            }
        }
    }

    public Person getPerson(String id) {
        return people.get(id);
    }

    public Person getRootPerson() {
        for (Person person : people.values()) {
            if (person.getParent() == null) {
                return person;
            }
        }
        return null;
    }
}
