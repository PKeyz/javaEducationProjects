package studentDatabaseApplication;

public enum Courses {
    HISTORY101 ("History 101"),
    MATHEMATICS101 ("Mathematics 101"),
    PHYSICS101 ("Physics 101"),
    ENGLISH101 ("English 101"),
    CHEMISTRY101 ("Chemistry 101"),
    COMPUTERSCIENCE101 ("Computer Science 101");

    private final String courseName;

    Courses(String courseName) {
        this.courseName = courseName;
    }
}
