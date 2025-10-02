package Project;

public class TaskFactory {
    public Task addTask(String description,String startTime,String endTime,String priority)
    {
        Task task=new Task(description,startTime,endTime,priority);
        return task;

    }

}