public class ObserverTest {
    public static void main(String[] args) {
        ArenaSubject arena = new ArenaSubject();

        Observer player1 = new Player("Player1");
        Observer player2 = new Player("Player2");

        arena.addObserver(player1);
        arena.addObserver(player2);

        arena.addCharacter("Warrior");
        arena.addCharacter("Mage");
    }
}
