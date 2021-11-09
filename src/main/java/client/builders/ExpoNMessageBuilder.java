package client.builders;

import java.util.List;

import client.enums.MessagePriority;
import client.enums.MessageSound;
import client.types.ExpoNMessage;

public class ExpoNMessageBuilder {
    private List<String> to;
    private String body, title, catagoryId, channelId, subtitle;
    private Integer ttl, expiration, badge;
    private Boolean mutableContent;
    private Object data;

    private MessagePriority priority;
    private MessageSound sound;
    
    public ExpoNMessageBuilder() {
        
    }

    public ExpoNMessageBuilder setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public ExpoNMessageBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public ExpoNMessageBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ExpoNMessageBuilder setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
        return this;
    }

    public ExpoNMessageBuilder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public ExpoNMessageBuilder setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ExpoNMessageBuilder setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public ExpoNMessageBuilder setExpiration(Integer expiration) {
        this.expiration = expiration;
        return this;
    }

    public ExpoNMessageBuilder setBadge(Integer badge) {
        this.badge = badge;
        return this;
    }

    public ExpoNMessageBuilder setMutableContent(Boolean mutableContent) {
        this.mutableContent = mutableContent;
        return this;
    }

    public ExpoNMessageBuilder setData(Object data) {
        this.data = data;
        return this;
    }

    public ExpoNMessageBuilder setPriority(MessagePriority priority) {
        this.priority = priority;
        return this;
    }

    public ExpoNMessageBuilder setSound(MessageSound sound) {
        this.sound = sound;
        return this;
    }

    public ExpoNMessage build() {
        return new ExpoNMessage(this.to, this.body, this.title, this.catagoryId, this.channelId, this.subtitle, this.ttl, this.expiration, this.badge, this.mutableContent, this.data, this.priority, this.sound);
    }

}
