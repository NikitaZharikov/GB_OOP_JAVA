public class Main {
    public static void main(String[] args) {
        Human mihail = new Human("Михаил", 43);
        Human milana = new Human("Милана", 38);
        Human anastasia = new Human("Анастасия", 12);
        Human arina = new Human("Арина", 16);

        Human bogdan = new Human("Богдан", 32);
        Human agnia = new Human("Агния", 28);
        Human arsen = new Human("Арсен", 8);

        Human ivan = new Human("Иван", 52);
        Human victoria = new Human("Виктория", 42);
        Human pavel = new Human("Павел", 10);
        Human georgi = new Human("Георгий", 18);

        FamilyTree familyTree = new FamilyTree();

        familyTree.appendWifeHusband(mihail,milana);
        familyTree.appendWifeHusband(milana,mihail);
        familyTree.appendWifeHusband(bogdan,agnia);
        familyTree.appendWifeHusband(agnia,bogdan);
        familyTree.appendWifeHusband(ivan,victoria);
        familyTree.appendWifeHusband(victoria,ivan);

        familyTree.appendParentChild(mihail,anastasia);
        familyTree.appendParentChild(mihail,arina);
        familyTree.appendParentChild(milana,anastasia);
        familyTree.appendParentChild(milana,arina);

        familyTree.appendParentChild(bogdan,arsen);
        familyTree.appendParentChild(agnia,arsen);

        familyTree.appendParentChild(ivan,pavel);
        familyTree.appendParentChild(ivan,georgi);
        familyTree.appendParentChild(victoria,pavel);
        familyTree.appendParentChild(victoria,georgi);


        System.out.println("Муж Миланы");
        System.out.println(new FindNodesFamily(familyTree).spend(milana, FamilyRelationship.wife));
        System.out.println("Жена Михаила");
        System.out.println(new FindNodesFamily(familyTree).spend(mihail, FamilyRelationship.husband));
        System.out.println();

        System.out.println("Дети Михаила");
        System.out.println(new FindNodesFamily(familyTree).spend(mihail, FamilyRelationship.parent));
        System.out.println("Дети Миланы");
        System.out.println(new FindNodesFamily(familyTree).spend(milana, FamilyRelationship.parent));
        System.out.println();

        System.out.println("Муж Агнии");
        System.out.println(new FindNodesFamily(familyTree).spend(agnia, FamilyRelationship.wife));
        System.out.println("Жена Богдана");
        System.out.println(new FindNodesFamily(familyTree).spend(bogdan, FamilyRelationship.husband));
        System.out.println();

        System.out.println("Дети Богдана");
        System.out.println(new FindNodesFamily(familyTree).spend(bogdan, FamilyRelationship.parent));
        System.out.println("Дети Агнии");
        System.out.println(new FindNodesFamily(familyTree).spend(agnia, FamilyRelationship.parent));
        System.out.println();


        System.out.println("Муж Виктории");
        System.out.println(new FindNodesFamily(familyTree).spend(victoria, FamilyRelationship.wife));
        System.out.println("Жена Ивана");
        System.out.println(new FindNodesFamily(familyTree).spend(ivan, FamilyRelationship.husband));
        System.out.println();

        System.out.println("Дети Ивана");
        System.out.println(new FindNodesFamily(familyTree).spend(ivan, FamilyRelationship.parent));
        System.out.println("Дети Виктории");
        System.out.println(new FindNodesFamily(familyTree).spend(victoria, FamilyRelationship.parent));
        System.out.println();

    }
}