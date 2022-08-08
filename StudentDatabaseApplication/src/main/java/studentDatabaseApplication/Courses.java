package studentDatabaseApplication;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Morr 08.2022
 * project idea from https://www.youtube.com/watch?v=GOGt7PACl10
 * https://howtodoinjava.com/java/enum/java-enum-string-example/
 */
public enum Courses {
    HISTORY101("History"),
    MATHEMATICS101("Mathematics"),
    PHYSICS101("Physics"),
    ENGLISH101("English"),
    CHEMISTRY101("Chemistry"),
    COMPUTERSCIENCE101("Computer-Science");

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
