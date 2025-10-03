package Project;

import java.util.logging.Logger;

public class Astronaut implements Observer {
    private static final Logger logger= Logger.getLogger(Astronaut.class.getName());
    @Override
    public void conflictNotification(String t1, String t2) {
        logger.info("[ObserverNotification]: Task \"" + t1 + "\" overlaps with \"" + t2 + "\"");
    }

    @Override
    public void addTaskNotification(String description) {
        logger.info("[ObserverNotification]: Task \"" + description + "\" has been added");
    }

    @Override
    public void removeTaskNotification(String description) {
        logger.info("[ObserverNotification]: Task \"" + description + "\" has been removed");
    }

    @Override
    public void updateTaskNotification(String t1, String t2) {
        logger.info("[ObserverNotification]: Task \"" + t1 + "\" has been updated to \"" + t2 + "\"");
    }
}