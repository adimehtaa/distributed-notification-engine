package com.adimehta.notificationengine.shared.constants;

public final class RedisKeys {
    private RedisKeys() {
    }

    public static final String DEDUP_PREFIX = "dedup";

    public static final String RATE_LIMIT_PREFIX = "ratelimit";

    public static final String TEMPLATE_CACHE_PREFIX = "template";

    public static String dedupKey(
            String notificationType,
            String userId,
            String idempotencyKey) {
        return DEDUP_PREFIX + ":" + notificationType
                + ":" + userId + ":" + idempotencyKey;
    }
}
