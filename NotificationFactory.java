public class NotificationFactory {
    public Notification notifier(String channel){
        if(channel==null || channel.equalsIgnoreCase(""))
            return null;
        switch (channel){
            case "SMS":
                return new SmsNofifier();
            case "PUSH":
                return  new PushNofifier();
            case "EMAIL"  :
                return new EmailNofifier();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
        }
    }

