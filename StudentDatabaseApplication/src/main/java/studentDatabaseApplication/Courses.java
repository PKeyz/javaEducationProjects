package studentDatabaseApplication;

public enum Courses {
    HISTORY101("History"),
    MATHEMATICS101("Mathematics"),
    PHYSICS101("Physics"),
    ENGLISH101("English"),
    CHEMISTRY101("Chemistry"),
    COMPUTERSCIENCE101("Computer Science");

    private final String name;

    Courses(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Courses toCourse(String name) {
        for (Courses course : values()) {
            if (course.getName().equals(name)) return course;
        }
        return null;
    }
    public static String toCourseName(String name) {
        String courseName;
        for (Courses course : values()) {
            if (course.getName().equals(name)) {
                courseName = name;
                return courseName;
            }
        }
        return null;
    }
    public static boolean isInCourseList(String name){
        for(Courses course : Courses.values()){
            if(course.getName().equals(name));
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return  name;
    }
}
