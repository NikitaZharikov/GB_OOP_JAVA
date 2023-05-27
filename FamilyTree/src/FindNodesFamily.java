import java.util.ArrayList;

public class FindNodesFamily {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public FindNodesFamily(FamilyTree familyTree) {
        tree = familyTree.getTree();
    }

    public ArrayList<String> spend(Human p, FamilyRelationship re) {
        for (Node t : tree) {
            if (t.human1.name == p.name && t.relation == re) {
                result.add(t.human2.name);
            }
        }
        return result;
    }

}
