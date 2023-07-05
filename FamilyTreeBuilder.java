import java.util.Map;

public class FamilyTreeBuilder {
    private FamilyTree familyTree;

    public FamilyTreeBuilder() {
        familyTree = new FamilyTree();
    }

    public void buildFamilyTree(Map<String, Person> personMap, Map<String, String[]> relationshipMap) {
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String id = entry.getKey();
            Person person = entry.getValue();
            familyTree.addPerson(person);
        }

        for (Map.Entry<String, String[]> entry : relationshipMap.entrySet()) {
            String parentId = entry.getKey();
            String[] childIds = entry.getValue();
            Person parent = familyTree.getPerson(parentId);
            if (parent != null) {
                for (String childId : childIds) {
                    Person child = familyTree.getPerson(childId);
                    if (child != null) {
                        parent.addChild(child);
                    }
                }
            }
        }
    }

    public FamilyTree getFamilyTree() {
        return familyTree;
    }
}