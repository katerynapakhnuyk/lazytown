public class FactoryTest {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");

        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();
    }
}
