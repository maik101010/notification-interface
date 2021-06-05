package com.notificaciones.notificaciones.service;

import com.notificaciones.notificaciones.dominio.DomainNotification;
import org.springframework.stereotype.Service;

@Service("serviceNotificationEmailImpl")
public class ServiceNotificationEmailImpl implements ServiceNotification {
    @Override
    public String implementationGenerateMethod(DomainNotification domainNotification) {
        return "Implementamos metodo para notificar via email";
    }
}
