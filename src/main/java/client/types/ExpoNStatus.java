package client.types;

import java.util.Map;
import java.util.Objects;

public class ExpoNStatus extends ExpoNResponse<Object> {
    private Map<String, Object> ids;

    public ExpoNStatus() {
        super();
    }

    public ExpoNStatus(Map<String, Object> ids) {
        super();
        this.ids = ids;
    }

    public Map<String, Object> getIds() {
        return ids;
    }

    public void setIds(Map<String, Object> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNStatus)) {
            return false;
        }

        ExpoNStatus expoNStatus = (ExpoNStatus) o;
        return Objects.equals(super.getData(), expoNStatus.getData()) && Objects.equals(super.getErrors(), expoNStatus.getErrors());
    }
}
