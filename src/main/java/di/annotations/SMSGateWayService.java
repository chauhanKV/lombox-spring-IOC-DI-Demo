package di.annotations;

import org.springframework.stereotype.Component;

@Component("smsGateWayService")
public class SMSGateWayService {
    public void sendSMS(String msg)
    {
        System.out.println("Sending.." + msg);
    }
}
