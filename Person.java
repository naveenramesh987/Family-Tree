import java.util.ArrayList;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String dateOfDeath;
    private ArrayList<Person> children;
    private Person parent;
    private String id;

    public Person(String name, String gender, String dateOfBirth, String dateOfDeath, String id) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.id = id;
        this.children = new ArrayList<>();
        this.parent = null;
    }

    public void addChild(Person child) {
        children.add(child);
        child.setParent(this);
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}