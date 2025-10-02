package Project;

public interface Observer {
    public void conflictNotification(String t1,String t2);
    public void addTaskNotification(String description);
    public void removeTaskNotification(String description);
    public void updateTaskNotification(String t1,String t2);
}