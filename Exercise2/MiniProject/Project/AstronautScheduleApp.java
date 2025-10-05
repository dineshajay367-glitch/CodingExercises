package Project;
import java.util.*;
import java.util.logging.Logger;

public class AstronautScheduleApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ScheduleManager manager = ScheduleManager.getInstance();
        Observer astronaut = new Astronaut();
        manager.addObserver(astronaut);
        boolean flag = true;

        while(flag)
        {
            System.out.println("\n===== Astronaut Daily Schedule =====");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Edit Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try
            {
                choice = sc.nextInt();
                sc.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Error: Please enter a valid number");
                sc.nextLine();
                continue;
            }

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter task description: ");
                    String Description = sc.nextLine();
                    System.out.print("Enter start time (HH:MM): ");
                    String StartTime = sc.nextLine();
                    System.out.print("Enter end time (HH:MM): ");
                    String EndTime = sc.nextLine();
                    System.out.print("Enter priority (High/Medium/Low): ");
                    String Priority = sc.nextLine();
                    manager.addTask(Description, StartTime, EndTime, Priority);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter task description to remove: ");
                    String Description = sc.nextLine();
                    manager.removeTask(Description);
                    break;
                }
                case 3:
                {	System.out.println("Select what you want to view:");
                    System.out.println("1. All Tasks");
                    System.out.println("2. High Priority Tasks");
                    System.out.println("3. Medium Priority Tasks");
                    System.out.println("4. Low Priority Tasks");
                    try
                    {
                        int view=Integer.parseInt(sc.nextLine());
                        manager.viewTask(view);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Invalid No");
                    }
                    break;
                }
                case 4:
                {
                    System.out.print("Enter task description to edit: ");
                    String Description = sc.nextLine();
                    System.out.println("Select what you want to change:");
                    System.out.println("1. Description");
                    System.out.println("2. Time");
                    System.out.println("3. Priority Level");
                    System.out.print("Enter the number (1/2/3): ");

                    try
                    {
                        int changes = Integer.parseInt(sc.nextLine());
                        String newChanges = null;
                        if(changes == 1)
                        {
                            System.out.print("Enter new description: ");
                            newChanges = sc.nextLine();
                        }
                        else if(changes == 2)
                        {
                            System.out.print("Enter new time (StartTime-EndTime, HH:MM-HH:MM): ");
                            newChanges = sc.nextLine();
                        }
                        else if(changes == 3)
                        {
                            System.out.print("Enter new priority (High/Medium/Low): ");
                            newChanges = sc.nextLine();
                        }
                        else
                        {
                            System.out.println("Error: Invalid option");
                        }
                        manager.editTask(Description, changes, newChanges);
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("Error: Invalid input for changes");
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error: Invalid input for changes");
                    }
                    break;
                }
                case 5:
                {
                    flag = false;
                    System.out.println("Exiting application...");
                    break;
                }
                default:
                {
                    System.out.println("Error: Invalid choice");
                }
            }
        }
        sc.close();
    }
}