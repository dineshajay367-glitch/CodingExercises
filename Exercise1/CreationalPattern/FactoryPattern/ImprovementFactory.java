package FactoryPattern;


public class ImprovementFactory extends TaskFactory {

    @Override
    public Task getTask() {

        return new ImprovementTask();
    }
}