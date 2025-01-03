import java.util.ArrayList;
import java.util.List;

public class ArenaSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addCharacter(String characterName) {
        System.out.println("New character added: " + characterName);
        notifyObservers("Character " + characterName + " has joined the arena.");
    }
}
