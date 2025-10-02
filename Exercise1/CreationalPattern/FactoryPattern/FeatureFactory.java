package FactoryPattern;


public class FeatureFactory extends TaskFactory {

    @Override
    public Task getTask() {

        return new FeatureTask();
    }
}
