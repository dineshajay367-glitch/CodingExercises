package FactoryPattern;

public class BugFactory extends TaskFactory {

    @Override
    public Task getTask() {
        return new BugTask();
    }

}
