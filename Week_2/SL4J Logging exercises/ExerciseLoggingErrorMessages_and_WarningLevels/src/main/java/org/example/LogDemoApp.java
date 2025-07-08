package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemoApp {

    // Creating a logger instance for this class
    private static final Logger log = LoggerFactory.getLogger(LogDemoApp.class);

    public static void main(String[] args) {
        // Logging messages at different severity levels
        log.error("Critical error occurred while processing the request.");
        log.warn("Disk space running low. Please check the server.");
    }
}

