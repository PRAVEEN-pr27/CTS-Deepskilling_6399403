package org.example;

public class Processor {
    private final RemoteService service;

    public Processor(RemoteService service) {
        this.service = service;
    }

    public void processData() {
        // internally calls the service
        service.load();
    }
}
