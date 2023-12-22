package di.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("notificationService")
@Scope("prototype")
public class NotificationService {
    private SMSGateWayService smsGateWayService;

    public NotificationService(SMSGateWayService smsGateWayService) {
        this.smsGateWayService = smsGateWayService;
    }

    public void sendNotification(String sms)
    {
        smsGateWayService.sendSMS(sms);
    }
}
