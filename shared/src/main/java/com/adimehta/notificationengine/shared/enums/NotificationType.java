package com.adimehta.notificationengine.shared.enums;

/**
 * Business event type that triggered this notification.
 * Maps to template keys in the Template Service.
 *
 * Format: <DOMAIN>_<EVENT>
 */
public enum NotificationType {
    
    // Auth domain
    AUTH_OTP,
    AUTH_PASSWORD_RESET,
    AUTH_LOGIN_ALERT,

    // Order domain
    ORDER_CONFIRMED,
    ORDER_SHIPPED,
    ORDER_DELIVERED,
    ORDER_CANCELLED,

    // Payment domain
    PAYMENT_SUCCESS,
    PAYMENT_FAILED,
    PAYMENT_REFUND_INITIATED,
    PAYMENT_REFUND_COMPLETED,

    // Account domain
    ACCOUNT_WELCOME,
    ACCOUNT_KYC_APPROVED,
    ACCOUNT_KYC_REJECTED,

    // Marketing domain
    MARKETING_PROMOTIONAL,
    MARKETING_WEEKLY_DIGEST
}
