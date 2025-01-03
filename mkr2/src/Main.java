public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method: Character Creation");
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");

        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();

        System.out.println("\nMediator: Coordination of actions in the arena");
        Arena arena = new Arena();

        CharacterUnit player1 = new PlayerCharacter(arena, "Warrior");
        CharacterUnit player2 = new PlayerCharacter(arena, "Mage");
        CharacterUnit player3 = new PlayerCharacter(arena, "Archer");

        arena.registerCharacter(player1);
        arena.registerCharacter(player2);
        arena.registerCharacter(player3);

        player1.sendAction("Attack");
        player2.sendAction("Defend");
        player3.sendAction("Move to position (5, 10)");

        System.out.println("\nObserver: Announcement of new characters");
        ArenaSubject arenaSubject = new ArenaSubject();

        Observer observer1 = new Player("Player1");
        Observer observer2 = new Player("Player2");

        arenaSubject.addObserver(observer1);
        arenaSubject.addObserver(observer2);

        arenaSubject.addCharacter("Warrior");
        arenaSubject.addCharacter("Mage");
        arenaSubject.addCharacter("Archer");

        System.out.println("\nGame over!");
    }
}
