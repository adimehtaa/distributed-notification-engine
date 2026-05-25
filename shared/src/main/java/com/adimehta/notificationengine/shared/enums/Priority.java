
package com.adimehta.notificationengine.shared.enums;


/**
 * CRITICAL  → OTP, payment failure, security alerts
 * HIGH      → Order confirmed, booking confirmed
 * NORMAL    → Delivery updates, shipping notifications
 * LOW       → Promotional, weekly digest
 */

public enum Priority {
    CRITICAL(3,0), // 3 retries, 0s initial backoff (retry immediately)
    HIGH(3,5),
    NORMAL(3,30),
    LOW(2,60); // 2 retries, 60s initial backoff

    private final int maxRetries;
    private final int initialBackoffSeconds;

    Priority(int maxRetries, int initialBackoffSeconds){
        this.maxRetries = maxRetries;
        this.initialBackoffSeconds = initialBackoffSeconds;
    }

    public int getMaxRetries(){return maxRetries;};
    public int getInitialBackoffSeconds(){return initialBackoffSeconds;};
}
