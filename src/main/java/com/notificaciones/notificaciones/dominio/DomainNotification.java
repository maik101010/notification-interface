package com.notificaciones.notificaciones.dominio;

import java.time.LocalDate;

public class DomainNotification {
    //valores que representan la entrada del sistema y la logica...
    private String description;
    private LocalDate update;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }
}
