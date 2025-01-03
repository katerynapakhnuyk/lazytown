public class MediatorTest {
    public static void main(String[] args) {
        Arena arena = new Arena();

        CharacterUnit player1 = new PlayerCharacter(arena, "Warrior");
        CharacterUnit player2 = new PlayerCharacter(arena, "Mage");
        CharacterUnit player3 = new PlayerCharacter(arena, "Archer");

        arena.registerCharacter(player1);
        arena.registerCharacter(player2);
        arena.registerCharacter(player3);

        player1.sendAction("Attack");
        player2.sendAction("Defend");
    }
}
