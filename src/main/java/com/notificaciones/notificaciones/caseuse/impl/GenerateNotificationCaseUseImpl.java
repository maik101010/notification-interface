package com.notificaciones.notificaciones.caseuse.impl;

import com.notificaciones.notificaciones.caseuse.GenerateNotificationCaseUse;
import com.notificaciones.notificaciones.dominio.DomainNotification;
import com.notificaciones.notificaciones.service.ServiceNotification;
import com.notificaciones.notificaciones.service.ServiceNotificationEmailImpl;
import com.notificaciones.notificaciones.service.ServiceNotificationMessageMovilImpl;
import com.notificaciones.notificaciones.service.ServiceNotificationSocketImpl;

public class GenerateNotificationCaseUseImpl implements GenerateNotificationCaseUse {

    private ServiceNotification serviceNotification;

    public GenerateNotificationCaseUseImpl(ServiceNotification serviceNotification) {
        this.serviceNotification = serviceNotification;
    }

    @Override
    public String generate(DomainNotification domainNotification, String type) {
        switch (type) {
            case "sms":
                serviceNotification = new ServiceNotificationMessageMovilImpl();
                break;
            case "email":
                serviceNotification = new ServiceNotificationEmailImpl();
                break;
            case "socket":
                serviceNotification = new ServiceNotificationSocketImpl();
                break;
        }

        return serviceNotification.implementationGenerateMethod(domainNotification);
    }
}
