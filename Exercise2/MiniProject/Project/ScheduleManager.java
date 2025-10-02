package Project;

import java.util.*;
import java.time.LocalTime;
public class ScheduleManager {
    private static ScheduleManager instance;
    private ScheduleManager()
    {
    }
    public static ScheduleManager getInstance()
    {
        if(instance == null)
        {
            synchronized(ScheduleManager.class)
            {
                if(instance == null)
                {
                    instance = new ScheduleManager();
                }
            }
        }
        return instance;
    }
    List<Task> task = new ArrayList<>();
    List<Observer> astronauts = new ArrayList<>();
    public void addObserver(Observer a)
    {
        astronauts.add(a);
    }
    public void addTask(String description,String startTime,String endTime,String priority)
    {
        TaskFactory t = new TaskFactory();
        Task newtask = t.addTask(description, startTime, endTime, priority);
        try
        {

            if(LocalTime.parse(newtask.startTime).isAfter(LocalTime.parse(newtask.endTime)))
            {
                System.out.println("Error: Invalid task time");
                return;
            }
            else
            {
                for(int i = 0; i < task.size(); i++)
                {
                    if(newtask.description.equalsIgnoreCase(task.get(i).description))
                    {
                        throw new IllegalArgumentException();
                    }
                    else if(LocalTime.parse(newtask.startTime).isBefore(LocalTime.parse(task.get(i).endTime)) &&
                            LocalTime.parse(newtask.endTime).isAfter(LocalTime.parse(task.get(i).startTime)))
                    {
                        for(int j = 0; j < astronauts.size(); j++)
                        {
                            astronauts.get(j).conflictNotification(task.get(i).description, newtask.description);
                        }
                        System.out.println("Error: Task time conflicts with an existing task");
                        return;
                    }
                }
                if(!newtask.priority.equalsIgnoreCase("high") &&
                        !newtask.priority.equalsIgnoreCase("low") &&
                        !newtask.priority.equalsIgnoreCase("medium"))
                {
                    System.out.println("Error: Invalid priority level");
                    return;
                }

                task.add(newtask);
                task.sort(Comparator.comparing(tasktime -> LocalTime.parse(tasktime.startTime)));

                for(int i = 0; i < astronauts.size(); i++)
                {
                    astronauts.get(i).addTaskNotification(newtask.description);
                }
                System.out.println("Task added successfully");
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: Description already exists");
        }
        catch(Exception e)
        {
            System.out.println("Error: Enter start and end times in HH:MM format");
        }
    }
    public void removeTask(String description)
    {
        for(int i = 0; i < task.size(); i++)
        {
            if(task.get(i).getDescription().equalsIgnoreCase(description))
            {
                task.remove(i);
                System.out.println("Task removed successfully");
                for(int j = 0; j < astronauts.size(); j++)
                {
                    astronauts.get(j).removeTaskNotification(description);
                }
                return;
            }
        }
        System.out.println("Error: Task not found");
    }
    public void viewTask(int view)
    {
        if(task.size() == 0)
        {
            System.out.println("No tasks scheduled for the day");
            return;
        }
        boolean flag=false;
        if(view>0&&view<5)
        {
            for(Task t : task)
            {
                if(view ==1)
                {
                    t.Display();
                    flag=true;
                }
                else if(view ==2&&t.priority.equalsIgnoreCase("high"))
                {
                    t.Display();
                    flag=true;
                }
                else if(view==3&&t.priority.equalsIgnoreCase("medium"))
                {
                    t.Display();
                    flag=true;
                }
                else if(view==4&&t.priority.equalsIgnoreCase("low"))
                {
                    t.Display();
                    flag=true;
                }

            }
            if(flag==false)
            {
                System.out.println("No Task is Available");
            }

        }
        else
        {
            System.out.println("Invalid No");
        }
    }
    public void editTask(String description,int changes,String newChanges)
    {
        for(int i = 0; i < task.size(); i++)
        {
            if(description.equalsIgnoreCase(task.get(i).description))
            {
                if(changes == 1)
                {
                    for(int j = 0; j < task.size(); j++)
                    {
                        if(task.get(j).description.equalsIgnoreCase(newChanges) && i != j)
                        {
                            System.out.println("Error: Description already exists");
                            return;
                        }
                    }
                    task.get(i).description = newChanges;
                }
                else if(changes == 2)
                {
                    try
                    {
                        String[] time = newChanges.split("[-]");
                        if(LocalTime.parse(time[0]).isBefore(LocalTime.parse(time[1])))
                        {
                            for(int j = 0; j < task.size(); j++)
                            {
                                if(LocalTime.parse(time[0]).isBefore(LocalTime.parse(task.get(j).endTime)) &&
                                        LocalTime.parse(time[1]).isAfter(LocalTime.parse(task.get(j).startTime)) && i != j)
                                {
                                    for(int a = 0; a < astronauts.size(); a++)
                                    {
                                        astronauts.get(a).conflictNotification(task.get(i).description, task.get(j).description);
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                            task.get(i).startTime = time[0];
                            task.get(i).endTime = time[1];
                            task.sort(Comparator.comparing(tasktime -> LocalTime.parse(tasktime.startTime)));
                        }
                        else
                        {
                            System.out.println("Error: Invalid time range");
                            return;
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println("Error: Task time conflicts with another task");
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error: Invalid time format");
                        return;
                    }
                }
                else if(changes == 3)
                {
                    task.get(i).priority = newChanges;
                }
                System.out.println("Task updated successfully");
                for(int j = 0; j < astronauts.size(); j++)
                {
                    astronauts.get(j).updateTaskNotification(description, newChanges);
                }
                return;
            }
        }
        System.out.println("Error: Invalid description");
    }
}