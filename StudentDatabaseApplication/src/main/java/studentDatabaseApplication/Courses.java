package studentDatabaseApplication;

import java.util.Arrays;
import java.util.Optional;

/**
 * asen on https://www.youtube.com/watch?v=GOGt7PACl10
 * https://howtodoinjava.com/java/enum/java-enum-string-example/
 */
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

      public static Optional<Courses> getCourse(String courseName){
        return Arrays.stream(Courses.values())
                .filter(courses -> courses.name.equals(courseName))
                .findFirst();
    }
    /*
    public static Courses toCourse(String name) {
        for (Courses course : values()) {
            if (course.getName().equals(name)) return course.valueOf(name);
        }
        return null;
    }

     */
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

/*
enum Environment
{
    PROD("https://prod.domain.com:1088/"),
    SIT("https://sit.domain.com:2019/"),
    CIT("https://cit.domain.com:8080/"),
    DEV("https://dev.domain.com:21323/");

    private String url;

    Environment(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }

    //****** Reverse Lookup ************/
/*
public static Optional<Environment> get(String url) {
        return Arrays.stream(Environment.values())
        .filter(env -> env.url.equals(url))
        .findFirst();
        }
        }
        To use the reverse lookup in the application code, use enum.get() method.

        String url = "https://sit.domain.com:2019/";

        Optional<Environment> env = Environment.get(url);

        System.out.println(env.get());
 */
