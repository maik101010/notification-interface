package com.notificaciones.notificaciones.service;

import com.notificaciones.notificaciones.dominio.DomainNotification;
import org.springframework.stereotype.Service;

@Service("serviceNotificationMessageMovilImpl")
public class ServiceNotificationMessageMovilImpl implements ServiceNotification {
    @Override
    public String implementationGenerateMethod(DomainNotification domainNotification) {
        return "Implementamos metodo para notificar via SMS";
    }
}
