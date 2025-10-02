package Project;

public class Astronaut implements Observer {

    @Override
    public void conflictNotification(String t1, String t2) {
        System.out.println("[ObserverNotification]: Task \"" + t1 + "\" overlaps with \"" + t2 + "\"");
    }

    @Override
    public void addTaskNotification(String description) {
        System.out.println("[ObserverNotification]: Task \"" + description + "\" has been added");
    }

    @Override
    public void removeTaskNotification(String description) {
        System.out.println("[ObserverNotification]: Task \"" + description + "\" has been removed");
    }

    @Override
    public void updateTaskNotification(String t1, String t2) {
        System.out.println("[ObserverNotification]: Task \"" + t1 + "\" has been updated to \"" + t2 + "\"");
    }
}