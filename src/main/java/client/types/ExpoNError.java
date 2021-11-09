package client.types;

import java.util.Objects;

import client.builders.ExpoNErrorBuilder;

public class ExpoNError {
    private Integer code;
    private String message;

    public ExpoNError() {
    }

    public ExpoNError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNError)) {
            return false;
        }
        ExpoNError expoNError = (ExpoNError) o;
        return Objects.equals(code, expoNError.code) && Objects.equals(message, expoNError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }

    public static ExpoNErrorBuilder builder() {
        return new ExpoNErrorBuilder();
    }
}
