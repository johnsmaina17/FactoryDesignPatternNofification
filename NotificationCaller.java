public class NotificationCaller {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.notifier("SMS");
        notification.notifyUser();
    }
}
