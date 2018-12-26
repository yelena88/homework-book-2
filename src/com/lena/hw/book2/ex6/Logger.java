package com.lena.hw.book2.ex6;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
    private static Logger instance;
    private File logFile = new File("./src/com/lena/hw/book2/ex6/logFile.txt");

    private Logger() {
        try {
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(Exception exception, String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
            writeFile(exception, message, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(Exception exception, String message, PrintWriter writer) {
        Calendar time = new GregorianCalendar();
        StringBuilder writeLine = new StringBuilder(time.getTime().toString());
        writeLine.append("  Message : ");
        writeLine.append(message);
        writer.println(writeLine.toString());
        for (StackTraceElement trace : exception.getStackTrace()) {
            writer.println(trace.toString());
            if (trace.toString().contains("main")) {
                break;
            }
        }
        writer.println();
    }
}
