public class Node {
    public Node(Human human1, FamilyRelationship relation, Human human2) {
        this.human1 = human1;
        this.relation = relation;
        this.human2 = human2;
    }

    Human human1;
    FamilyRelationship relation;
    Human human2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", human1, relation, human2);
    }
}
