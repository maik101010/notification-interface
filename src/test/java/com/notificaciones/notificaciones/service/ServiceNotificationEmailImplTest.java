package com.notificaciones.notificaciones.service;

import com.notificaciones.notificaciones.NotificacionesApplication;
import com.notificaciones.notificaciones.dominio.DomainNotification;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(
        classes = NotificacionesApplication.class)
@AutoConfigureMockMvc
public class ServiceNotificationEmailImplTest {

    @MockBean
    ServiceNotification serviceNotification;

    @Test
    void test_unit_send_email() {

        String answer = serviceNotification.implementationGenerateMethod(new DomainNotification());

    }
}
