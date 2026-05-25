package com.adimehta.notificationengine.shared.events;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

import com.adimehta.notificationengine.shared.enums.Channel;
import com.adimehta.notificationengine.shared.enums.NotificationType;
import com.adimehta.notificationengine.shared.enums.Priority;
import com.fasterxml.jackson.annotation.JsonFormat;

public class NotificationRequestedEvent {

    private String notificationId;

    private String idempotencyKey;

    private String userId;

    private Channel channel;

    private NotificationType notificationType;

    private Priority priority;

    private Map<String, String> templateVariables;

    private String recipientOverride;

    private Integer templateVersion;

    private int retryCount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Instant createdAt;

    private String sourceService;

    public NotificationRequestedEvent() {
    }

    private NotificationRequestedEvent(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String notificationId = UUID.randomUUID().toString();
        private String idempotencyKey;
        private String userId;
        private Channel channel;
        private NotificationType notificationType;
        private Priority priority = Priority.NORMAL;
        private Map<String, String> templateVariables = Map.of();
        private String recipientOverride;
        private Integer templateVersion;
        private int retryCount = 0;
        private Instant createdAt = Instant.now();
        private String sourceService;

        public Builder notificationId(String val) {
            notificationId = val;
            return this;
        }

        public Builder idempotencyKey(String val) {
            idempotencyKey = val;
            return this;
        }

        public Builder userId(String val) {
            userId = val;
            return this;
        }

        public Builder channel(Channel val) {
            channel = val;
            return this;
        }

        public Builder notificationType(NotificationType val) {
            notificationType = val;
            return this;
        }

        public Builder priority(Priority val) {
            priority = val;
            return this;
        }

        public Builder templateVariables(Map<String, String> val) {
            templateVariables = val;
            return this;
        }

        public Builder recipientOverride(String val) {
            recipientOverride = val;
            return this;
        }

        public Builder templateVersion(Integer val) {
            templateVersion = val;
            return this;
        }

        public Builder retryCount(int val) {
            retryCount = val;
            return this;
        }

        public Builder createdAt(Instant val) {
            createdAt = val;
            return this;
        }

        public Builder sourceService(String val) {
            sourceService = val;
            return this;
        }

        public NotificationRequestedEvent build() {
            return new NotificationRequestedEvent(this);
        }
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public String getUserId() {
        return userId;
    }

    public Channel getChannel() {
        return channel;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public Priority getPriority() {
        return priority;
    }

    public Map<String, String> getTemplateVariables() {
        return templateVariables;
    }

    public String getRecipientOverride() {
        return recipientOverride;
    }

    public Integer getTemplateVersion() {
        return templateVersion;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getSourceService() {
        return sourceService;
    }

    public void setNotificationId(String v) {
        this.notificationId = v;
    }

    public void setIdempotencyKey(String v) {
        this.idempotencyKey = v;
    }

    public void setUserId(String v) {
        this.userId = v;
    }

    public void setChannel(Channel v) {
        this.channel = v;
    }

    public void setNotificationType(NotificationType v) {
        this.notificationType = v;
    }

    public void setPriority(Priority v) {
        this.priority = v;
    }

    public void setTemplateVariables(Map<String, String> v) {
        this.templateVariables = v;
    }

    public void setRecipientOverride(String v) {
        this.recipientOverride = v;
    }

    public void setTemplateVersion(Integer v) {
        this.templateVersion = v;
    }

    public void setRetryCount(int v) {
        this.retryCount = v;
    }

    public void setCreatedAt(Instant v) {
        this.createdAt = v;
    }

    public void setSourceService(String v) {
        this.sourceService = v;
    }

    @Override
    public String toString() {
        return "NotificationRequestedEvent{" +
                "notificationId='" + notificationId + '\'' +
                ", userId='" + userId + '\'' +
                ", channel=" + channel +
                ", type=" + notificationType +
                ", priority=" + priority +
                ", retryCount=" + retryCount +
                '}';
    }
}
