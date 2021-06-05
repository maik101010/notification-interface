package com.notificaciones.notificaciones.config;

import com.notificaciones.notificaciones.caseuse.GenerateNotificationCaseUse;
import com.notificaciones.notificaciones.caseuse.impl.GenerateNotificationCaseUseImpl;
import com.notificaciones.notificaciones.service.ServiceNotification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {

    @Bean
    GenerateNotificationCaseUse generateNotification(@Qualifier("serviceNotificationMessageMovilImpl") ServiceNotification serviceNotification) {
        return new GenerateNotificationCaseUseImpl(serviceNotification);
    }

}
