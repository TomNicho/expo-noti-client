package client.types;

import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;

public class ExpoNResponse<T> {
    private T data;
    private List<ExpoNError> errors;

    public ExpoNResponse() {
    }

    public ExpoNResponse(T data, List<ExpoNError> errors) {
        this.data = data;
        this.errors = errors;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<ExpoNError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<ExpoNError> errors) {
        this.errors = errors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errors);
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            ", errors='" + getErrors() + "'" +
            "}";
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
