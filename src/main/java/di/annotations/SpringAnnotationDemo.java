package di.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext("di.annotations");
        NotificationService notificationService = factory.getBean("notificationService", NotificationService.class);
        notificationService.sendNotification("OTP:002");
    }
}
