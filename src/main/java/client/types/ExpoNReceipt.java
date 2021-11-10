package client.types;

import java.util.Objects;

import client.enums.ExpoResponseStatus;

public class ExpoNReceipt {
    private ExpoResponseStatus status;
    private String id, messsage;
    private Object details;

    public ExpoNReceipt() {
    }

    public ExpoNReceipt(ExpoResponseStatus status, String id, String messsage, Object details) {
        this.status = status;
        this.id = id;
        this.messsage = messsage;
        this.details = details;
    }

    public ExpoResponseStatus getStatus() {
        return this.status;
    }

    public void setStatus(ExpoResponseStatus status) {
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMesssage() {
        return this.messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public Object getDetails() {
        return this.details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNReceipt)) {
            return false;
        }
        ExpoNReceipt expoNReceipt = (ExpoNReceipt) o;
        return Objects.equals(status, expoNReceipt.status) && Objects.equals(id, expoNReceipt.id) && Objects.equals(messsage, expoNReceipt.messsage) && Objects.equals(details, expoNReceipt.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, messsage, details);
    }

    @Override
    public String toString() {
        return "{" +
            " status='" + getStatus() + "'" +
            ", id='" + getId() + "'" +
            ", messsage='" + getMesssage() + "'" +
            ", details='" + getDetails() + "'" +
            "}";
    }
}
