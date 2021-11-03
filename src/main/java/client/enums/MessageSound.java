package client.enums;

public enum MessageSound {
    DEFAULT("default"), NONE(null);

    public final String label;

    private MessageSound(String label) {
        this.label = label;
    }
}
