package client.types;

import java.util.List;
import java.util.Objects;

public class ExpoNTicket extends ExpoNResponse<List<ExpoNReceipt>> {
    public ExpoNTicket() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNStatus)) {
            return false;
        }
        ExpoNTicket expoNTicket = (ExpoNTicket) o;
        return Objects.equals(super.getData(), expoNTicket.getData()) && Objects.equals(super.getErrors(), expoNTicket.getErrors());
    }
}