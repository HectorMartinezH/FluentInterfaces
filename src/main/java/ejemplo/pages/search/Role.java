package ejemplo.pages.search;

public enum Role {
    BUSSINES_PROFESSIONAL("Bussines Professional"),
    SOFTWARE_DEVELOPMENT("Software Development");

    String value;

    Role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
