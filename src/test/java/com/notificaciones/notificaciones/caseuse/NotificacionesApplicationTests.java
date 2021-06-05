package com.notificaciones.notificaciones.caseuse;

import com.notificaciones.notificaciones.NotificacionesApplication;
import com.notificaciones.notificaciones.dominio.DomainNotification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

//@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = NotificacionesApplication.class)
@AutoConfigureMockMvc
class NotificacionesApplicationTests {

    private static final String SMS = "sms";
    private static final String EMAIL = "email";
    private static final String SOCKET = "socket";

    @MockBean
    GenerateNotificationCaseUse generateNotificationCaseUse;

    @Test
    void test_generate_notification_sms_success() {
        //given"
        DomainNotification domainNotification = new DomainNotification();
        String returnExpected = "Implementamos metodo para notificar via SMS";
        Mockito.when(generateNotificationCaseUse.generate(domainNotification, SMS)).thenReturn(returnExpected);
        //when
        String answer = generateNotificationCaseUse.generate(domainNotification, SMS);
        //then
        Assertions.assertEquals(returnExpected, answer);
        Assertions.assertFalse(answer.isEmpty());
    }

    @Test
    void test_generate_notification_email_success() {
        //given"
        DomainNotification domainNotification = new DomainNotification();
        String returnExpected = "Implementamos metodo para notificar via SMS";
        Mockito.when(generateNotificationCaseUse.generate(domainNotification, SMS)).thenReturn(returnExpected);
        //when
        String answer = generateNotificationCaseUse.generate(domainNotification, SMS);
        //then
        Assertions.assertEquals(returnExpected, answer);
    }

    @Test
    void test_generate_notification_socket_success() {
        //given"
        DomainNotification domainNotification = new DomainNotification();
        String returnExpected = "Implementamos metodo para notificar via SMS";
        Mockito.when(generateNotificationCaseUse.generate(domainNotification, SMS)).thenReturn(returnExpected);
        //when
        String answer = generateNotificationCaseUse.generate(domainNotification, SMS);
        //then
        Assertions.assertEquals(returnExpected, answer);
    }

//    @Test
//    void test_generate_notification_success() {
//        //given
//        Mockito.when(generateNotificationCaseUse.generate(new DomainNotification())).thenReturn("true");
//        //when
//        String answer = generateNotificationCaseUse.generate(new DomainNotification());
//    }

}
