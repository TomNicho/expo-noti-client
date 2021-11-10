package client.types;

import java.util.Objects;

public class ExpoNStatus extends ExpoNResponse<Object> {
    public ExpoNStatus() {
        super();
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
