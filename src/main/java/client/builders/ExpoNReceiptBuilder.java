package client.builders;

import client.enums.ExpoResponseStatus;
import client.types.ExpoNReceipt;

public class ExpoNReceiptBuilder {
    private ExpoResponseStatus status;
    private String id, messsage;
    private Object details;

    public ExpoNReceiptBuilder() {
    }

    public ExpoNReceiptBuilder setDetails(Object details) {
        this.details = details;
        return this;
    }

    public ExpoNReceiptBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ExpoNReceiptBuilder setMesssage(String messsage) {
        this.messsage = messsage;
        return this;
    }

    public ExpoNReceiptBuilder setStatus(ExpoResponseStatus status) {
        this.status = status;
        return this;
    }

    public ExpoNReceipt build() {
        return new ExpoNReceipt(this.status, this.id, this.messsage, this.details);
    }
}
