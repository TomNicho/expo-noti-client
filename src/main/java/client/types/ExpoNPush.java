package client.types;

import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;

import client.builders.ExpoNPushBuilder;

public class ExpoNPush {
    private List<String> ids;
    
    public ExpoNPush() {
    }

    public ExpoNPush(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNPush)) {
            return false;
        }
        ExpoNPush expoNPush = (ExpoNPush) o;
        return Objects.equals(ids, expoNPush.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ids);
    }

    @Override
    public String toString() {
        return "{" +
            " ids='" + getIds() + "'" +
            "}";
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
    
    public static ExpoNPushBuilder builder() {
        return new ExpoNPushBuilder();
    }
}