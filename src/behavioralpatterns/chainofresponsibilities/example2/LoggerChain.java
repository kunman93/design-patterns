package behavioralpatterns.chainofresponsibilities.example2;

import behavioralpatterns.chainofresponsibilities.example2.concretehandlers.*;

/**
 * Responsible to build a chain of logger from the concrete handlers package.
 */
public class LoggerChain {

    private Logger chainOfLoggers;

    public LoggerChain(){
        buildLoggerChain();
    }

    private void buildLoggerChain(){
        chainOfLoggers = new ErrorLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Level.INFO);

        chainOfLoggers.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
    }

    public void logMessage(Level level, String message) {
        chainOfLoggers.logMessage(level, message);
    }
}
