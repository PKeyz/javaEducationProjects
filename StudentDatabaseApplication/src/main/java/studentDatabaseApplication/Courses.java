package studentDatabaseApplication;

public enum Courses {
    HISTORY101 ("History"),
    MATHEMATICS101 ("Mathematics"),
    PHYSICS101 ("Physics"),
    ENGLISH101 ("English"),
    CHEMISTRY101 ("Chemistry"),
    COMPUTERSCIENCE101 ("Computer Science");

    private final String name;

    Courses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
/*
Environment(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }

 */