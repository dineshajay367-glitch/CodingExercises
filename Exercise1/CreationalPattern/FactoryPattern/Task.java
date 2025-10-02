package FactoryPattern;


import java.util.logging.Logger;

abstract class Task {
    protected static final Logger logger= Logger.getLogger(Task.class.getName());
    abstract void task();
}
