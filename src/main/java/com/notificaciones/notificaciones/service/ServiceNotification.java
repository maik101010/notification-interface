package com.notificaciones.notificaciones.service;

import com.notificaciones.notificaciones.dominio.DomainNotification;

public interface ServiceNotification {
    String implementationGenerateMethod(DomainNotification domainNotification);
}
