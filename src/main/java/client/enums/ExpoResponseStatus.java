package client.enums;

public enum ExpoResponseStatus {
    OKAY("okay"), ERROR("error");

    public final String label;

    private ExpoResponseStatus(String label) {
        this.label = label;
    }
}
