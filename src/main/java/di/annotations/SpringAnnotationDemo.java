package di.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext("di.annotations");
        NotificationService notificationService = factory.getBean("notificationService", NotificationService.class);
        notificationService.sendNotification("OTP:002");

        // This gives false because I have annotated notificationService class with @Scope="prototype"
        // Therefore, a new object of notificationservice is created whenever we initialize like below.
        // The output is false. We can remove scope annotation to make the bean factory classes to be singleton.
        NotificationService notificationService1 = factory.getBean("notificationService",NotificationService.class);
        System.out.println("Is scope singleton in Bean factory ? : " + (notificationService1 == notificationService));

        NotificationService notificationService2 = new NotificationService(new SMSGateWayService());
        System.out.println("Is scope singleton in this spring project ? : " + (notificationService1 == notificationService2));

    }
}
