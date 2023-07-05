import java.util.ArrayList;

public class Family {
    private Person father;
    private Person mother;
    private ArrayList<Person> children;

    public Family(Person father, Person mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }
}