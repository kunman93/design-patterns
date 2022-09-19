package behavioralpatterns.chainofresponsibilities.example2;

import behavioralpatterns.chainofresponsibilities.example2.concretehandlers.Level;

public class Client {

    public static void main(String[] args) {
        LoggerChain loggerChain = new LoggerChain();

        loggerChain.logMessage(Level.INFO, "This is an information.");
        loggerChain.logMessage(Level.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(Level.ERROR, "This is an error information.");
    }
}
