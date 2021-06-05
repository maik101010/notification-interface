package com.notificaciones.notificaciones.controller;

import com.notificaciones.notificaciones.caseuse.GenerateNotificationCaseUse;
import com.notificaciones.notificaciones.dominio.DomainNotification;
import com.notificaciones.notificaciones.dto.DtoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NotificationController {

    private static final String TYPE_EMAIL = "email";
    private static final String TYPE_MESSAGE_MOVIL = "sms";
    private static final String TYPE_MESSAGE_SOCKET = "socket";
    //asumimos que esto es un controller
    GenerateNotificationCaseUse generateNotificationCaseUse;

    public NotificationController(GenerateNotificationCaseUse generateNotificationCaseUse) {
        this.generateNotificationCaseUse = generateNotificationCaseUse;
    }

    @GetMapping("/api/notification/email")
    DtoResponse responseEmail() {
        return new DtoResponse(generateNotificationCaseUse.generate(new DomainNotification(), TYPE_EMAIL));
    }

    @GetMapping("/api/notification/sms")
    DtoResponse responseSms() {
        return new DtoResponse(generateNotificationCaseUse.generate(new DomainNotification(), TYPE_MESSAGE_MOVIL));
    }


    @GetMapping("/api/notification/socket")
    DtoResponse responseSocket() {
        return new DtoResponse(generateNotificationCaseUse.generate(new DomainNotification(), TYPE_MESSAGE_SOCKET));
    }


}
