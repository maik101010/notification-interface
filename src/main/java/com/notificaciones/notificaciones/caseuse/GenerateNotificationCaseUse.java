package com.notificaciones.notificaciones.caseuse;

import com.notificaciones.notificaciones.dominio.DomainNotification;

public interface GenerateNotificationCaseUse {
    String generate(DomainNotification domainNotification, String type);
}
