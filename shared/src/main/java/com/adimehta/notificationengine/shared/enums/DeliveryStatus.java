package com.adimehta.notificationengine.shared.enums;

/**
 * Tracks the lifecycle of a notification from acceptance to final state.
 *
 * State machine:
 * PENDING → QUEUED → PROCESSING → DELIVERED
 *                              ↘ FAILED → RETRYING → DELIVERED
 *                                                  ↘ DEAD_LETTERED
 */

public enum DeliveryStatus {
    PENDING,        // Accepted by gateway, not yet on Kafka
    QUEUED,         // On Kafka topic, awaiting consumer
    PROCESSING,     // Consumer picked it up, calling provider
    DELIVERED,      // Provider confirmed delivery
    FAILED,         // Delivery attempt failed
    RETRYING,       // Scheduled for retry
    DEAD_LETTERED   // Max retries exceeded, moved to DLQ
}
