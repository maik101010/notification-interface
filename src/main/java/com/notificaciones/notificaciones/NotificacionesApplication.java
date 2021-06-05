package com.notificaciones.notificaciones;

import com.notificaciones.notificaciones.caseuse.GenerateNotificationCaseUse;
import com.notificaciones.notificaciones.dominio.DomainNotification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Controller
@SpringBootApplication
public class NotificacionesApplication implements CommandLineRunner {

    //asumimos que esto es un controller
    GenerateNotificationCaseUse generateNotificationCaseUse;

    public NotificacionesApplication(GenerateNotificationCaseUse generateNotificationCaseUse) {
        this.generateNotificationCaseUse = generateNotificationCaseUse;
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificacionesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        //System.out.println(generateNotificationCaseUse.generate(new DomainNotification()));
    }
}
