import java.time.LocalDate;

public class Relationship {
    private Person person1;
    private Person person2;
    private String relationshipType;
    private LocalDate startDate;
    private LocalDate endDate;

    public Relationship(Person person1, Person person2, String relationshipType, LocalDate startDate) {
        this.person1 = person1;
        this.person2 = person2;
        this.relationshipType = relationshipType;
        this.startDate = startDate;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}