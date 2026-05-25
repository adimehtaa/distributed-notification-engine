package com.adimehta.notificationengine.shared.constants;

public final class KafkaTopics {
    private KafkaTopics(){}

    // ── Inbound notification topics (by priority)
    public static final String NOTIFICATION_CRITICAL = "notification-critical";
    public static final String NOTIFICATION_HIGH = "notification-high";
    public static final String NOTIFICATION_NORMAL = "notification-normal";
    public static final String NOTIFICATION_LOW = "notification-low";

    // ── Dead Letter Queue
    public static final String NOTIFICATION_DLQ = "notification-dlq";

    // ── Delivery status events (channel services → delivery tracker)
    public static final String DELIVERY_STATUS_EMAIL     = "delivery-status-email";
    public static final String DELIVERY_STATUS_SMS       = "delivery-status-sms";
    public static final String DELIVERY_STATUS_PUSH      = "delivery-status-push";
    public static final String DELIVERY_STATUS_WHATSAPP  = "delivery-status-whatsapp";
    public static final String DELIVERY_STATUS_IN_APP    = "delivery-status-inapp";
}
