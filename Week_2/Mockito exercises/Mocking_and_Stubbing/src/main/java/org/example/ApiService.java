package org.example;

public class ApiService {
    private final RemoteApi api;

    public ApiService(RemoteApi api) {
        this.api = api;
    }

    public String getInfo() {
        return api.fetchInfo();
    }
}
