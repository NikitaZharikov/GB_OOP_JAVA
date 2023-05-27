import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendParentChild(Human parent, Human children) {
        tree.add(new Node(parent, FamilyRelationship.parent, children));
        tree.add(new Node(children, FamilyRelationship.children, parent));
    }

    public void appendWifeHusband(Human wife, Human husband) {
        tree.add(new Node(wife, FamilyRelationship.wife, husband));
        tree.add(new Node(husband, FamilyRelationship.husband, wife));
    }
}
