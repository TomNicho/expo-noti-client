package client.types;

import java.util.List;
import java.util.Objects;

import client.enums.MessagePriority;
import client.enums.MessageSound;

public class ExpoNMessage {
    private List<String> to;
    private String body, title, catagoryId, channelId, subtitle;
    private Integer ttl, expiration, badge;
    private Boolean mutableContent;
    private Object data;

    private MessagePriority priority;
    private MessageSound sound;

    public ExpoNMessage() {
    }

    public ExpoNMessage(List<String> to, String body, String title, String catagoryId, String channelId, String subtitle, Integer ttl, Integer expiration, Integer badge, Boolean mutableContent, Object data, MessagePriority priority, MessageSound sound) {
        this.to = to;
        this.body = body;
        this.title = title;
        this.catagoryId = catagoryId;
        this.channelId = channelId;
        this.subtitle = subtitle;
        this.ttl = ttl;
        this.expiration = expiration;
        this.badge = badge;
        this.mutableContent = mutableContent;
        this.data = data;
        this.priority = priority;
        this.sound = sound;
    }

    public List<String> getTo() {
        return this.to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatagoryId() {
        return this.catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getExpiration() {
        return this.expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    public Integer getBadge() {
        return this.badge;
    }

    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    public Boolean isMutableContent() {
        return this.mutableContent;
    }

    public Boolean getMutableContent() {
        return this.mutableContent;
    }

    public void setMutableContent(Boolean mutableContent) {
        this.mutableContent = mutableContent;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MessagePriority getPriority() {
        return this.priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    public MessageSound getSound() {
        return this.sound;
    }

    public void setSound(MessageSound sound) {
        this.sound = sound;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNMessage)) {
            return false;
        }
        ExpoNMessage expoNMessage = (ExpoNMessage) o;
        return Objects.equals(to, expoNMessage.to) && Objects.equals(body, expoNMessage.body) && Objects.equals(title, expoNMessage.title) && Objects.equals(catagoryId, expoNMessage.catagoryId) && Objects.equals(channelId, expoNMessage.channelId) && Objects.equals(subtitle, expoNMessage.subtitle) && Objects.equals(ttl, expoNMessage.ttl) && Objects.equals(expiration, expoNMessage.expiration) && Objects.equals(badge, expoNMessage.badge) && Objects.equals(mutableContent, expoNMessage.mutableContent) && Objects.equals(data, expoNMessage.data) && Objects.equals(priority, expoNMessage.priority) && Objects.equals(sound, expoNMessage.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, body, title, catagoryId, channelId, subtitle, ttl, expiration, badge, mutableContent, data, priority, sound);
    }

    @Override
    public String toString() {
        return "{" +
            " to='" + to + "'" +
            ", body='" + body + "'" +
            ", title='" + title + "'" +
            ", catagoryId='" + catagoryId + "'" +
            ", channelId='" + channelId + "'" +
            ", subtitle='" + subtitle + "'" +
            ", ttl='" + ttl + "'" +
            ", expiration='" + expiration + "'" +
            ", badge='" + badge + "'" +
            ", mutableContent='" + mutableContent + "'" +
            ", data='" + data + "'" +
            ", priority='" + priority + "'" +
            ", sound='" + sound + "'" +
        "}";
    }
}
