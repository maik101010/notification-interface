package com.notificaciones.notificaciones.dto;

public class DtoResponse {
    private String response;
    public DtoResponse(String response) {
        this.response=response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "DtoResponse{" +
                "response='" + response + '\'' +
                '}';
    }
}
