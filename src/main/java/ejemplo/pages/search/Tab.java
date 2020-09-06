package ejemplo.pages.search;

public enum Tab {
    ALL("All"),
    COURSES("Courses"),
    BLOG("Blog"),
    RESOURCES("Resources"),
    AUTHORS("Authors");

    String value;

    Tab(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
