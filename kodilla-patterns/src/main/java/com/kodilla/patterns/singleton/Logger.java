package com.kodilla.patterns.singleton;

public final class Logger {
    private static Logger logger = null;
    private String lastLog = "";

    private Logger() {
    }

    public String getLastLog() {
        return lastLog;
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }
}
