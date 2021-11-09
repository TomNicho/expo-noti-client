package client.builders;

import java.util.List;

import client.types.ExpoNPush;

public class ExpoNPushBuilder {
    private List<String> ids;

    public ExpoNPushBuilder() {

    }

    public ExpoNPushBuilder setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public ExpoNPush build() {
        return new ExpoNPush(this.ids);
    }
}
