package client.types;

import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;

public class ExpoNResponse {
    private List<ExpoNReceipt> data;
    private List<ExpoNError> errors;

    public ExpoNResponse() {
    }

    public ExpoNResponse(List<ExpoNReceipt> data, List<ExpoNError> errors) {
        this.data = data;
        this.errors = errors;
    }

    public List<ExpoNReceipt> getData() {
        return this.data;
    }

    public void setData(List<ExpoNReceipt> data) {
        this.data = data;
    }

    public List<ExpoNError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<ExpoNError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpoNResponse)) {
            return false;
        }
        ExpoNResponse expoNResponse = (ExpoNResponse) o;
        return Objects.equals(data, expoNResponse.data) && Objects.equals(errors, expoNResponse.errors);
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
