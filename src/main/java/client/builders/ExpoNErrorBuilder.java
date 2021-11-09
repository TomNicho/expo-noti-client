package client.builders;

import client.types.ExpoNError;

public class ExpoNErrorBuilder {
    private Integer code;
    private String message;

    public ExpoNErrorBuilder() {
        
    }

    public ExpoNErrorBuilder setCode(Integer code) {
        this.code = code;
        return this;
    }

    public ExpoNErrorBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public ExpoNError build() {
        return new ExpoNError(this.code, this.message);
    }
}
