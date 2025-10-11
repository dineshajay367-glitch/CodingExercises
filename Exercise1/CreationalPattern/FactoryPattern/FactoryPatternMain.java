package FactoryPattern;

import java.util.*;
public class FactoryPatternMain {
    public static void main(String[] args) {
    Task task1=new BugFactory().getTask();
    task1.task();
    Task task2=new FeatureFactory().getTask();
    task2.task();
    Task task3=new ImprovementFactory().getTask();
    task3.task();

    }
}